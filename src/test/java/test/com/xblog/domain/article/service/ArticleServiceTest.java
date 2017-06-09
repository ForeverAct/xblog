package test.com.xblog.domain.article.service;

import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;
import com.xblog.domain.article.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.JUnit4ClassRunner;

import java.io.UnsupportedEncodingException;
import java.sql.Blob;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
@RunWith(JUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:config/ApplicationContext.xml","classpath:config/Spring-MVC.xml"})
@ContextConfiguration(locations={"classpath:config/ApplicationContext.xml"})
public class ArticleServiceTest {
    @Autowired
    private ArticleService articleService;

    @Test
    public void insertTest() throws UnsupportedEncodingException {
        Article article = new Article();
        article.setTitle("111");
        article.setCreateTime("2017-05-05");
        article.setModifyTime("2017-05-05");
        ArticleContent content = new ArticleContent();
        content.setContent("1111<>\\///\"''".getBytes("UTF-8"));
        articleService.insertArticle(article, content);
    }
}
