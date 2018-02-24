package com.xblog.domain.user.dao;

import com.xblog.domain.user.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author WangYue
 */
public interface UserMapper {
    /**
     * 插入
     *
     * @param user
     *
     * @return
     */
    public int insert(User user);

    /**
     * @param id
     *
     * @return
     */
    public User getUserByID(int id);

    /**
     * @param userNo
     *
     * @return
     */
    public User getUserByNo(String userNo);

    public User getUserByNamePass(String userName, String password);

    /**
     * @param user
     *
     * @return
     */
    public int update(User user);

    /**
     * @param map
     *
     * @return
     */
    public List<User> list(Map map);

}
