package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//アノテーションのルール：対象のコードの上に書くこと

@RestController
//（@Controller + @ResponseBodyの同義。）
//@ControllerとはMVCのコントローラー部分。@ResponseBodyは戻り値をjson形式で返却することを意味しています。(bean等を返却することも可能)
public class RaiseTech3no1 {
    @RequestMapping("hello")
//    helloをURLに入れたらする処理
    String sample() {
        return "Hello World";
    }

}
