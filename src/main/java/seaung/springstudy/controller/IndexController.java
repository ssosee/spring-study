package seaung.springstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import seaung.springstudy.controller.dto.HelloData;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {

        model.addAttribute("form", new HelloData());

        return "index";
    }

    @PostMapping(value = "/index", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String postIndex(@ModelAttribute HelloData helloData, Model model) {
        log.info("name={}, age={}", helloData.getName(), helloData.getAge());
        model.addAttribute("form", helloData);
        return "index";
    }

}
