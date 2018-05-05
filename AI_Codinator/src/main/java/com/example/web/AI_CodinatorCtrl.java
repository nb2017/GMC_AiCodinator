package com.example.web;

import com.example.domain.Customer;
import com.example.domain.ProductItem;
import com.example.service.CustomerService;
import com.example.service.ShopService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ------------------------------------
// AIコーディネーターコントローラ
// ------------------------------------
@Controller
@RequestMapping("ai_codinator")
public class AI_CodinatorCtrl {
    @Autowired
    ShopService shopService;

    @ModelAttribute
    ShopForm setUpForm() {
        return new ShopForm();
    }

	 // ------------------------------------
	 // 初回リダイレクト
	 // ------------------------------------
    @GetMapping
    String list(Model model) {
        return "ai_codinator/main";
    }
    
	 // ------------------------------------
	 // 検索ボタンアクション
	 // ------------------------------------
    @GetMapping(path = "find", params = "itemName")
//    @PostMapping(path = "find")
    String find(@RequestParam String itemName, ShopForm form) {
//    String find(@Validated ShopForm form, BindingResult result, Model model) {
        // if (result.hasErrors()) {
        //     return list(model);
        // }
        List<ProductItem> items = shopService.findAll();
        int idxSize = items.size();
        for ( int ii = 0 ; ii < items.size() ; ++ii )
        {
            if ( items.get(ii).getItemName().equalsIgnoreCase(itemName) )
//            if ( items.get(ii).getItemName().equalsIgnoreCase(form.getItemName()) )
            {
                form.setImgPath(items.get(ii).getImgPath());
                break;
            }
        }
        return "ai_codinator/result";
    }
    
/*
    @PostMapping(path = "create")
    String create(@Validated CustomerForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(form, customer);
        customerService.create(customer);
        return "redirect:/ai_codinator";
    }

    @GetMapping(path = "edit", params = "form")
    String editForm(@RequestParam Integer id, CustomerForm form) {
        Customer customer = customerService.findOne(id);
        BeanUtils.copyProperties(customer, form);
        return "ai_codinator/main";
    }

    @PostMapping(path = "edit")
    String edit(@RequestParam Integer id, @Validated CustomerForm form, BindingResult result) {
        if (result.hasErrors()) {
            return editForm(id, form);
        }
        Customer customer = new Customer();
        BeanUtils.copyProperties(form, customer);
        customer.setId(id);
        customerService.update(customer);
        return "redirect:/ai_codinator";
    }
    @GetMapping(path = "edit", params = "goToTop")
    String goToTop() {
        return "redirect:/ai_codinator";
    }
    @PostMapping(path = "delete")
    String delete(@RequestParam Integer id) {
        customerService.delete(id);
        return "redirect:/ai_codinator";
    }
  */
}