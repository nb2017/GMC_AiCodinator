package com.example.web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.ProductItem;
import com.example.service.ShopService;

// ------------------------------------------------------------------------
// ショップページ コントローラー
// ------------------------------------------------------------------------
@Controller
@RequestMapping("shop")
public class Aicodinator_Shop {
	// 商品情報を持つクラス
    @Autowired
    ShopService shopService;
/*
    @ModelAttribute
    ShopForm setUpForm() {
        return new ShopForm();
    }
*/
    // 4/29 構造から見直す方針
    @GetMapping
    String list(Model model) {
//        List<ProductItem> productItems = shopService.findAll();
        //model.addAttribute("productItems", productItems);
        return "shop/main";
    }

    /*
    @PostMapping(path = "find")
    String find(@Validated ShopForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return list(model);
        }
        return "shop/item";
    }
    */

    /*
    @GetMapping(path = "edit", params = "goToTop")
    String goToTop() {
        return "redirect:/shop";
    }
    */
}
