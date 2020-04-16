package org.text.bookpub;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("home")
    @ResponseBody
    public String home(String keyword){

        return "my name is "+keyword;
    }
}
