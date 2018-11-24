package com.qingshan.qingshanMiniProgram;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2018/11/24.
 */

@RestController
@RequestMapping("/hello_world")
public class HelloWorldController {

    @GetMapping
    public Map<String, Object> sayHello() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "hello world!");
        return result;
    }
}
