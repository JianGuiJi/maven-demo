package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jijiangui
 * date:2018-04-12 9:52
 */
@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
