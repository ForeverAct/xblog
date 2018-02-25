package com.xblog.domain.category.dao;

import com.xblog.domain.category.entity.Category;

import java.util.List;
import java.util.Map;

/**
 *
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
public interface CategoryMapper {

    public int insert(Category category);

    public int update(Category category);

    public Category getCategoryByNo(String categoryNo);

    public Category getCategoryByID(int id);

    public List<Category> list(Map map);
}
