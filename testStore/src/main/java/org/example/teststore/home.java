package org.example.teststore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {
    @RequestMapping("/")

    public String index(){
        return "index.html";
    }
}
