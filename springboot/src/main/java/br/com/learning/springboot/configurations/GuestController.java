package br.com.learning.springboot.configurations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ggarcia on 02/01/17.
 */
@Controller
public class GuestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
