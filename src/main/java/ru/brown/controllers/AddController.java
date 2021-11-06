package ru.brown.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    @RequestMapping(value = "/add", method = RequestMethod.GET )
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        int k = i+j;

        /**Рботая с ModelAndView всегда устанавливаются 2 параметра: setViewName и addObject*/
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", k);
        return mv;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET )
    public String add1(){
        return "hello";
    }
}
