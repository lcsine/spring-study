package com.ydlclass.dao.impl;

import com.ydlclass.dao.IUserDao;
import com.ydlclass.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao implements IUserDao {
    @Autowired
    private  JdbcTemplate jdbcTemplate;


    @Override
    public User selectById(int ids) {
        List<User> userList = jdbcTemplate.query("select * from user where id=?", (rs,i)->{
                String username = rs.getString("username");
                String password = rs.getString("password");
                int id = rs.getInt("id");
                return new User(id,username,password);
        }, ids);
        return userList.size()==0?null:userList.get(0);
    }

    @Override
    public List<User> selectAll() {
        return jdbcTemplate.query("select * from user", (RowMapper<User>) (rs, rowNum) -> {
            String username = rs.getString("username");
            String password = rs.getString("password");
            int id = rs.getInt("id");
            return new User(id, username, password);
        });
    }
}
