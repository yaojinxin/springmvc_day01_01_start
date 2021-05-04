package com.aeolia.controller;

import com.aeolia.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/anno")
public class AnnoController {

    @RequestMapping(path = "/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println(username);
        return "success";
    }

    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println(body);
        return "success";
    }

    @RequestMapping(path = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping(path = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Cookie") String header) {
        System.out.println(header);
        return "success";
    }

    @RequestMapping(path = "/testCookieValue")
    public String testCookieValue(@CookieValue(name = "JSESSIONID") String cookieValue) {
        System.out.println(cookieValue);
        return "success";
    }

    @RequestMapping(path = "/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法会先执行
     *
     * @return
     */
//    @ModelAttribute
//    public User showUser(String uname) {
//        System.out.println("showUser执行了");
//        //通过uname查询数据库
//        User user=new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }
    @RequestMapping(path = "/testSessionAttribute")
    public String testSessionAttribute() {
        return "success";
    }
}
