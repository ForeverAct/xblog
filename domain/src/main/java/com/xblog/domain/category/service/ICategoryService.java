package com.xblog.domain.category.service;

import com.xblog.domain.category.entity.Category;

import java.util.List;

/**
 *
 * @author Administrator
 * @date 2018/2/9 0009
 */
public interface ICategoryService {
    public int addCategory(Category category);

    public int updateCategory(String categoryNo);

    public int updateCategoryById(int id);

    public Category getCategory(String categoryNo);

    public List<Category> getCategorys();
}
