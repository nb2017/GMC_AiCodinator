package com.example.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ShopForm {
   @NotNull
    @Size(min = 1, max = 127)
    private String itemName;
    @Size(min = 1, max = 256)
    private String imgPath;
}

// ----------------------------
// 検索結果フォームクラス
// ----------------------------
@Data
class ShopForm_Result {
   @NotNull
    @Size(min = 1, max = 127)
    private String itemName;
   private String imgPath;
}

