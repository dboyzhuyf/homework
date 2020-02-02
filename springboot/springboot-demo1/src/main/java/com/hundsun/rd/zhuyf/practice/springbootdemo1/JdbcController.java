package com.hundsun.rd.zhuyf.practice.springbootdemo1;

import com.hundsun.rd.zhuyf.practice.springbootdemo1.demo1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.UIResource;
import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class JdbcController {

    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Autowired
    JdbcTemplate db2JdbcTemplate;

    @GetMapping("/jdbc/user1")
    public User getUserById1(@RequestParam(name="uid") int userId){
        User user = db1JdbcTemplate.queryForObject("select * from users where id=" + userId, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setId(resultSet.getInt("id"));
                u.setName(resultSet.getString("name"));
                u.setAge(resultSet.getInt("age"));
                return u;
            }
        });
        return user;
    }

    @GetMapping("/jdbc/user2")
    public User getUserById2(@RequestParam(name="uid") int userId){
        User user = db2JdbcTemplate.queryForObject("select * from users where id=" + userId, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setId(resultSet.getInt("id"));
                u.setName(resultSet.getString("name"));
                u.setAge(resultSet.getInt("age"));
                return u;
            }
        });
        return user;
    }
}
