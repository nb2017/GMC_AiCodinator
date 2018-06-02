package com.example.web;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// ------------------------------------------------------------------------
// システム管理者用ページコントローラクラス
// ------------------------------------------------------------------------
@Controller
@RequestMapping("system")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @ModelAttribute
    CustomerForm setUpForm() {
        return new CustomerForm();
    }

    // --------------------------------------------------------------------
    // ユーザ管理ページ 初回リダイレクト
    // --------------------------------------------------------------------
    @GetMapping
    String list(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "system/list";
    }

    // --------------------------------------------------------------------
    // ユーザクリエイト
    // --------------------------------------------------------------------
    @PostMapping(path = "create")
    String create(@Validated CustomerForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(form, customer);
        customerService.create(customer);
        return "redirect:/system";
    }

    // --------------------------------------------------------------------
    // ユーザ情報編集ページ
    // --------------------------------------------------------------------
    @GetMapping(path = "edit", params = "form")
    String editForm(@RequestParam Integer id, CustomerForm form) {
        Customer customer = customerService.findOne(id);
        BeanUtils.copyProperties(customer, form);
        return "system/edit";
    }

    // --------------------------------------------------------------------
    // ユーザ情報編集ボタンアクション
    // --------------------------------------------------------------------
    @PostMapping(path = "edit")
    String edit(@RequestParam Integer id, @Validated CustomerForm form, BindingResult result) {
       if (result.hasErrors()) {
           return editForm(id, form);
       }
        Customer customer = new Customer();
        BeanUtils.copyProperties(form, customer);
        customer.setId(id);
        customerService.update(customer);
        return "redirect:/system";
    }

    // --------------------------------------------------------------------
    // ユーザ情報編集　トップページへ
    // --------------------------------------------------------------------
    @GetMapping(path = "edit", params = "goToTop")
    String goToTop() {
        return "redirect:/system";
    }

    // --------------------------------------------------------------------
    // ユーザ情報　削除
    // --------------------------------------------------------------------
    @PostMapping(path = "delete")
    String delete(@RequestParam Integer id) {
        customerService.delete(id);
        return "redirect:/system";
    }
}