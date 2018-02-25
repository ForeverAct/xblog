package com.xblog.domain.category.service;

import com.xblog.domain.category.entity.Category;

import java.util.List;

/**
 *
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
public interface ICategoryService {
    /**
     * @param category
     *
     * @return
     */
    public int addCategory(Category category);

    /**
     * @param categoryNo
     *
     * @return
     */
    public int updateCategory(String categoryNo);

    /**
     * @param id
     *
     * @return
     */
    public int updateCategoryById(int id);

    /**
     * @param categoryNo
     *
     * @return
     */
    public Category getCategory(String categoryNo);

    /**
     * @return
     */
    public List<Category> getCategorys();
}
