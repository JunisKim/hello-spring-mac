package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;

import java.util.List;

public interface ArticleDao {

    void insertArticle(Article article);
    Article selectArticle(String articleId);
    List<Article> selectArticles();

}