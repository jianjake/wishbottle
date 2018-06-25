//账号控制类
package com.wishbottle.wishbottle.controller;


import org.springframework.web.bind.annotation.GetMapping;

public class AccountInfoController {
    @GetMapping()
    public String  index(){
        return "index";
    }
    

}
