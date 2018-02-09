package com.xblog.domain.category.dao;

import com.xblog.domain.category.entity.Category;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 * @date 2018/2/9 0009
 */
public interface CategoryMapper {

    public int insert(Category category);

    public int update(Category category);

    public Category getCategoryByNo(String categoryNo);

    public Category getCategoryById(int id);

    public List<Category> list(Map map);
}
