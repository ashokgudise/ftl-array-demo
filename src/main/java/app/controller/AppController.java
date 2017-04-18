package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by ashokgudise on 4/18/17.
 */
@Controller
public class AppController {

    @Value("${app.message:Hello World}")
    private String message = "Hello World";

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {

        String[] strArray= {"ArrayItemOne","ArrayItemTwo"};
        model.put("arrayitems", strArray);

        return "welcome";
    }


}
