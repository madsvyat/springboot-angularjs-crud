package com.madsvyat.crud.controller;

import com.madsvyat.crud.domain.TestClass;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Infiltrator on 26.01.2015.
 */
@RestController
@RequestMapping("/api")
public class TestController {
    
    @RequestMapping("/test")
    public TestClass getTest() {
        TestClass instance = new TestClass();
        instance.setValue("Ololo!! You are know, who are you!");
        return instance;
    }
}
