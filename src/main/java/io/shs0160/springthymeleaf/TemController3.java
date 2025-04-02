package io.shs0160.springthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layouts/pages")
public class TemController3 {

    @GetMapping("/1")
    public String showLayout1() {
        return "/pages/layout_page_1";
    }

    @GetMapping("/2")
    public String showLayout2() {
        return "/pages/layout_page_2";
    }

    @GetMapping("/3")
    public String showLayout3(Model model) {
        model.addAttribute("isLogin", true);
        return "/pages/layout_page_3";
    }

    @GetMapping("/4")
    public String showLayout4(Model model) {

        model.addAttribute("isLogin", true);
        model.addAttribute("post", new Post(1L, "h1", "h2", "h2"));

        return "/pages/layout_page_4";
    }

}
