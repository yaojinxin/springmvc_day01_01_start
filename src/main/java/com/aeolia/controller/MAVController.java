package com.aeolia.controller;

import com.aeolia.domain.Student;
import com.aeolia.domain.User;
import com.aeolia.domain.VO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/mav")
public class MAVController {

    @RequestMapping(path = "/testModelAndView")
    public ModelAndView testModelAndView(ModelAndView modelAndView) {
        //ModelAndView对象可以通过方法入参创建也可以在方法体中new一个
        Student student = new Student(50, "小明", 20, "浙江杭州", "18072977615");
        modelAndView.addObject(student);
        modelAndView.addObject("user", "zhangsan");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(path = "/testModel")
    public String testModel(Model model) {
        model.addAttribute("username", "尤克里里");
        return "success";
    }

    @RequestMapping(path = "/testRequest")
    public String testRequest(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("username", "那吾克热");
        return "success";
    }

    @RequestMapping(path = "/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().write("hello response");
    }

    @RequestMapping(path = "/testResponse2")
    @ResponseBody//告知SpringMVC框架，对该方法返回值不进行视图解析直接进行数据响应
    public String testResponse2() {
        return "hello response2";
    }

    @RequestMapping(path = "/testResponse3")
    @ResponseBody
    public String testResponse3() throws JsonProcessingException {
        User user = new User();
        user.setUname("张三");
        user.setAge(25);
        user.setDate(new Date());
        //使用json的转化工具转换成json格式字符串再返回
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);

        return json;
    }

    @RequestMapping(path = "/testResponse4")
    @ResponseBody
    //期望SpringMVC自动将User转化成JSON格式的字符串
    public User testResponse4() throws JsonProcessingException {
        User user = new User();
        user.setUname("张三");
        user.setAge(25);
        user.setDate(new Date());

        return user;
    }

    @RequestMapping(path = "/testQuick1")
    @ResponseBody
    public void testQuick1(String username, int age) {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(path = "/testQuick2")
    @ResponseBody
    public void testQuick2(String[] strs) {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping(path = "testVO")
    @ResponseBody 
    public void testVO(VO vo){
        List<User> users = vo.getUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }


}
