package test.com.xblog.domain.article.service;/**
 * Created by Administrator on 2017/8/30 0030.
 */

import com.xblog.archi.common.generator.IDGenerator;
import com.xblog.archi.common.time.DateFormatUtils;
import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;
import com.xblog.domain.article.service.IArticleService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.greaterThan;

/**
 * @author Administrator
 * @datetime 2017-08-30 23:07
 **/
public class ArticleServiceTest extends BaseTest {

    @Autowired
    IArticleService articleService;

    @Test
    public void testInsert() {
        Article article = new Article();
        // article.setArticleNo(IDGenerator.randomNumberUniq8());
        article.setTitle("MyBatis拦截器实现分页功能");
        System.out.println(article.getTitle().length());
        article.setSummary("MyBatis拦截器实现分页功能");
        article.setCreateTime(DateFormatUtils.DEFAULT_DATE_TIME_STANDARD_FORMAT());
        article.setModifyTime(DateFormatUtils.DEFAULT_DATE_TIME_STANDARD_FORMAT());
        article.setAuthor("admin");
        ArticleContent articleContent = new ArticleContent();
        articleContent.setArticleNo(article.getArticleNo());
        articleContent.setContent("首先说下实现原理。使用拦截器拦截原始的sql，然后加上分页查询的关键字和属性，拼装成新的sql语句再交给mybatis去执行。".getBytes());
        articleService.insertArticle(article, articleContent);
    }

    @Test
    public void testUpdateArticle() {
        Article article = new Article();
        article.setArticleNo("29418053");
        article.setTitle("IntelliJ IDEA 最新激活码（截止到2018年1月30日）");
        System.out.println(article.getTitle().length());
        article.setModifyTime(DateFormatUtils.DEFAULT_DATE_TIME_STANDARD_FORMAT());
        Assert.assertThat(articleService.updateArticle(article), greaterThan(0));
    }

    @Test
    public void testUpdateArticleContent() {
        ArticleContent articleContent = new ArticleContent();
        articleContent.setArticleNo("29418053");
        articleContent.setContent(("注册码：\n" +
                "\n" +
                "CNEKJPQZEX-eyJsaWNlbnNlSWQiOiJDTkVLSlBRWkVYIiwibGljZW5zZWVOYW1lIjoibGFuIHl1IiwiYXNzaWduZWVOYW1lIjoiIiwiYXNzaWduZWVFbWFpbCI6IiIsImxpY2Vuc2VSZXN0cmljdGlvbiI6IkZvciBlZHVjYXRpb25hbCB1c2Ugb25seSIsImNoZWNrQ29uY3VycmVudFVzZSI6ZmFsc2UsInByb2R1Y3RzIjpbeyJjb2RlIjoiQUMiLCJwYWlkVXBUbyI6IjIwMTgtMDEtMzAifSx7ImNvZGUiOiJETSIsInBhaWRVcFRvIjoiMjAxOC0wMS0zMCJ9LHsiY29kZSI6IklJIiwicGFpZFVwVG8iOiIyMDE4LTAxLTMwIn0seyJjb2RlIjoiUlMwIiwicGFpZFVwVG8iOiIyMDE4LTAxLTMwIn0seyJjb2RlIjoiV1MiLCJwYWlkVXBUbyI6IjIwMTgtMDEtMzAifSx7ImNvZGUiOiJEUE4iLCJwYWlkVXBUbyI6IjIwMTgtMDEtMzAifSx7ImNvZGUiOiJSQyIsInBhaWRVcFRvIjoiMjAxOC0wMS0zMCJ9LHsiY29kZSI6IlBTIiwicGFpZFVwVG8iOiIyMDE4LTAxLTMwIn0seyJjb2RlIjoiREMiLCJwYWlkVXBUbyI6IjIwMTgtMDEtMzAifSx7ImNvZGUiOiJEQiIsInBhaWRVcFRvIjoiMjAxOC0wMS0zMCJ9LHsiY29kZSI6IlJNIiwicGFpZFVwVG8iOiIyMDE4LTAxLTMwIn0seyJjb2RlIjoiUEMiLCJwYWlkVXBUbyI6IjIwMTgtMDEtMzAifSx7ImNvZGUiOiJDTCIsInBhaWRVcFRvIjoiMjAxOC0wMS0zMCJ9XSwiaGFzaCI6IjUxOTU1OTMvMCIsImdyYWNlUGVyaW9kRGF5cyI6MCwiYXV0b1Byb2xvbmdhdGVkIjpmYWxzZSwiaXNBdXRvUHJvbG9uZ2F0ZWQiOmZhbHNlfQ==-QOxwjWvRwJz6vo6J6adC3CJ4ukQHosbPYZ94URUVFna/Rbew8xK/M5gP3kAaPh6ZDveFdtMR1UBoumq3eCwXtXM3U3ls5noB4LIr+QplVlCj2pK5uNq7g/feyNyQcHpSXtvhIOnXDBLOecB05DOsxzm0p7ulGGJoAInmHeb9mc0eYjqc4RPpUQfh6HSYBnvEnKMlLF5bz4KEtzmsvvgA55CwzwQ3gRitm5Q/wUT7AQCBdjmBfNUjKVQL6TSjSDPp56FUdEs4Aab8LqstA2DIMbxocO64rvytmcUeIwu8Mi5uq87KQP5AQMSMYb59Inbd+dmVfx5cJo3fRS4/5s3/Hg==-MIIEPjCCAiagAwIBAgIBBTANBgkqhkiG9w0BAQsFADAYMRYwFAYDVQQDDA1KZXRQcm9maWxlIENBMB4XDTE1MTEwMjA4MjE0OFoXDTE4MTEwMTA4MjE0OFowETEPMA0GA1UEAwwGcHJvZDN5MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxcQkq+zdxlR2mmRYBPzGbUNdMN6OaXiXzxIWtMEkrJMO/5oUfQJbLLuMSMK0QHFmaI37WShyxZcfRCidwXjot4zmNBKnlyHodDij/78TmVqFl8nOeD5+07B8VEaIu7c3E1N+e1doC6wht4I4+IEmtsPAdoaj5WCQVQbrI8KeT8M9VcBIWX7fD0fhexfg3ZRt0xqwMcXGNp3DdJHiO0rCdU+Itv7EmtnSVq9jBG1usMSFvMowR25mju2JcPFp1+I4ZI+FqgR8gyG8oiNDyNEoAbsR3lOpI7grUYSvkB/xVy/VoklPCK2h0f0GJxFjnye8NT1PAywoyl7RmiAVRE/EKwIDAQABo4GZMIGWMAkGA1UdEwQCMAAwHQYDVR0OBBYEFGEpG9oZGcfLMGNBkY7SgHiMGgTcMEgGA1UdIwRBMD+AFKOetkhnQhI2Qb1t4Lm0oFKLl/GzoRykGjAYMRYwFAYDVQQDDA1KZXRQcm9maWxlIENBggkA0myxg7KDeeEwEwYDVR0lBAwwCgYIKwYBBQUHAwEwCwYDVR0PBAQDAgWgMA0GCSqGSIb3DQEBCwUAA4ICAQC9WZuYgQedSuOc5TOUSrRigMw4/+wuC5EtZBfvdl4HT/8vzMW/oUlIP4YCvA0XKyBaCJ2iX+ZCDKoPfiYXiaSiH+HxAPV6J79vvouxKrWg2XV6ShFtPLP+0gPdGq3x9R3+kJbmAm8w+FOdlWqAfJrLvpzMGNeDU14YGXiZ9bVzmIQbwrBA+c/F4tlK/DV07dsNExihqFoibnqDiVNTGombaU2dDup2gwKdL81ua8EIcGNExHe82kjF4zwfadHk3bQVvbfdAwxcDy4xBjs3L4raPLU3yenSzr/OEur1+jfOxnQSmEcMXKXgrAQ9U55gwjcOFKrgOxEdek/Sk1VfOjvS+nuM4eyEruFMfaZHzoQiuw4IqgGc45ohFH0UUyjYcuFxxDSU9lMCv8qdHKm+wnPRb0l9l5vXsCBDuhAGYD6ss+Ga+aDY6f/qXZuUCEUOH3QUNbbCUlviSz6+GiRnt1kA9N2Qachl+2yBfaqUqr8h7Z2gsx5LcIf5kYNsqJ0GavXTVyWh7PYiKX4bs354ZQLUwwa/cG++2+wNWP+HtBhVxMRNTdVhSm38AknZlD+PTAsWGu9GyLmhti2EnVwGybSD2Dxmhxk3IPCkhKAK+pl0eWYGZWG3tJ9mZ7SowcXLWDFAk0lRJnKGFMTggrWjV8GYpw5bq23VmIqqDLgkNzuoog==\n" +
                "1\n" +
                "如果在验证上述注册码的过程中，显示此注册码已经被取消，则可以通过在hosts文件中，添加\n" +
                "\n" +
                "0.0.0.0 account.jetbrains.com\n" +
                "1\n" +
                "构造映射关系，来解决此问题。\n" +
                "\n" +
                "如果大家对hosts文件不太了解，不知道如何修改此文件，则可以通过阅读「详述 hosts 文件的作用及修改 hosts 文件的方法」了解详情。\n" +
                "\n").getBytes());
        articleContent.setModifyTime(DateFormatUtils.DEFAULT_DATE_TIME_STANDARD_FORMAT());
        Assert.assertThat(articleService.updateArticleContent(articleContent), greaterThan(0));
    }

    @Test
    public void testList() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("numPerPage", "2");
        map.put("pageNum", "1");
        List<Article> list = articleService.getArticleList(map);
        System.out.println(list.size());
        System.out.println(list.get(1).getTitle());
        Assert.assertThat(list.size(), greaterThan(0));
    }
}
