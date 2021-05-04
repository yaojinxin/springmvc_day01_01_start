package com.aeolia.controller;

import com.aeolia.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(path = "/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
    @RequestMapping(path = "saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }
}
