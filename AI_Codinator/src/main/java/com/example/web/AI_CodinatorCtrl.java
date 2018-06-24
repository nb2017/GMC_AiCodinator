package com.example.web;

import com.example.domain.ProductItem;
import com.example.service.ShopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    String find(@RequestParam String itemName, ShopForm form) {
        // 商品情報取得
        List<ProductItem> items = shopService.findAll();
        // 商品情報数取得
        int idxSize = items.size();
        for ( int ii = 0 ; ii < idxSize ; ++ii )
        {
            // キーワードの商品名と一致 ?
            if ( items.get(ii).getItemName().equalsIgnoreCase(itemName) )
            {
                // 商品画像パスをフォームにセット           ←なんか違う気がする
                form.setImgPath(items.get(ii).getImgPath());
                break;
            }
        }
        return "ai_codinator/result";
    }
}
