package com.xblog.admin.module.article.controller;

import com.xblog.domain.article.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/5 0005.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    public void saveArticle() {}

    public void addArticle() {}

    public void deleteArticle() {

    }
}
