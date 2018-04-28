package com.example.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ShopForm {
   @NotNull
    @Size(min = 1, max = 127)
    private String itemName;
}

@Data
class ShopForm_Result {
   @NotNull
    @Size(min = 1, max = 127)
    private String itemName;
   private String imgPath;
}

