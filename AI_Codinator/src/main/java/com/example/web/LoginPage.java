package com.example.web;


import com.example.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// ------------------------------------------------------------------------
// ショップページ コントローラー
// ------------------------------------------------------------------------
@Controller
@RequestMapping("login")
public class LoginPage {
    @Autowired
    CustomerService customerService;

}

