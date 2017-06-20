package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-19.
 */
public class ApiAmigoController {
    @Autowired
    private BbsService service;

    @GetMapping("/amigo")
    public List<Amigo> viewAll() {

        return null; //TODO
    }

    @GetMapping("amigo/{articleId}")
    public Article viewDetail(@PathVariable String amigoId) {
        return null; //TODO
    }

    @PostMapping("")
    public void regist(@RequestBody Amigo amigo) {

    }

    @PutMapping("/{amigoID}")
    public void modify(@RequestBody Amigo amigo) {

    }

    @PutMapping("/{amigoID}")
    public void remove(@RequestBody Amigo amigo) {

    }
}
