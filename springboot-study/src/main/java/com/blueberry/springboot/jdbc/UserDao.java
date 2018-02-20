package com.blueberry.springboot.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author hekai
 * @create 2018-02-17-20:30
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public int addUser(String name) {
        String sql = "insert into tb_user (name) values (?)";
        int update = jdbcTemplate.update(sql, new Object[]{name});
        return update;
    }

    public int countUser() {
        List rows = jdbcTemplate.queryForList("SELECT * FROM tb_user");
        return rows.size();
    }
}
