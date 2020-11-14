package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RaiseTech3no2 {
    @RequestMapping("/")
    //URLの最後
    String sample(Model model) { //Modelは画面を表す
        model.addAttribute("name","朴先生!");
//        Attributeとは属性のこと

        return "Hello World ver2";
        //returnの""内がHTMLの名前になる
//        さっきはreturnの中身をアノテーションで表示だったけど
//        今回はreturn→HTMLファイルを表示
    }
}
