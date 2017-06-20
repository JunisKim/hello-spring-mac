package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  /api/bbs (GET) .. 전체보기
 *  /api/bbs/{articleID} (GET) .. 상세보기
 *  /api/bbs (POST) .. 글쓰기
 *  /api/bbs/{aricleId} (PUT) .. 글수정
 *  /api/bbs/{aricleId} (DELETE) .. 글 삭제
 */
@RestController
@RequestMapping("/api")
public class ApiBbsController {

    private BbsService service;

    @GetMapping("/bbs")
    public List<Article> viewAll() {
        List<Article> list = service.viewArticles();
        return list;  //TODO
    }

    @GetMapping("bbs/{articleId}")
    public Article viewDetail(@PathVariable String articleId) {
        Article article = service.viewArticle(articleId); //TODO
        return article;
    }

    @PostMapping("")
    public void regist(@RequestBody Article article) {
        service.registArticle(article);
    }

    @PutMapping("/{articleID}")
    public void modify(@PathVariable String articleId,
            @RequestBody Article article) {
    }

    @PutMapping("/{articleID}")
    public void remove(@PathVariable Article article) {

    }
}
