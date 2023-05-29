package seaung.springstudy.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import seaung.springstudy.controller.dto.HelloData;

@Controller
public class ConverterTestController {

    @ResponseBody
    @GetMapping("/converter")
    public String convert(@RequestParam String time) {
        return time;
    }

    @GetMapping("/converter-view")
    public String convertView(Model model) {

        HelloData helloData = new HelloData();
        helloData.setAge(100);
        helloData.setName("장세웅");

        model.addAttribute("number", 1000);
        model.addAttribute("helloData", helloData);

        return "converter-view";
    }

    @GetMapping("/converter/edit")
    public String converterForm(Model model) {

        Form form = new Form();
        HelloData helloData = new HelloData();
        helloData.setName("장세웅");
        helloData.setAge(100);
        form.setHelloData(helloData);

        model.addAttribute("form", form);

        return "converter-form";
    }

    @PostMapping("/converter/edit")
    public String converterForm(@ModelAttribute Form form, Model model) {

        model.addAttribute("helloData", form.getHelloData());

        return "converter-view";
    }

    @Data
    static class Form {
        private HelloData helloData;
    }

}
