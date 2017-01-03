package br.com.learning.springboot.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ggarcia on 02/01/17.
 */
@SpringBootApplication
@Controller
public class Configuration {

    public static void main(String[] args) {
        SpringApplication.run(Configuration.class, args);
    }

}
