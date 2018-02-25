package com.xblog.domain.tag.dao;

import com.xblog.domain.tag.entity.Tag;

import java.util.List;
import java.util.Map;

/**
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
public interface TagMapper {
    /**
     * insert
     *
     * @param tag
     *
     * @return
     */
    public int insert(Tag tag);

    /**
     * update
     *
     * @param tag
     *
     * @return
     */
    public int update(Tag tag);

    /**
     * getTagByID
     *
     * @param id
     *
     * @return
     */
    public Tag getTagByID(int id);

    /**
     * getTagByNo
     *
     * @param tagNo
     *
     * @return
     */
    public Tag getTagByNo(String tagNo);

    /**
     * list
     *
     * @param map
     *
     * @return
     */
    public List<Tag> list(Map map);
}
