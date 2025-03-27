package com.jdbcex.JdbcCrudOp.dao;

import com.jdbcex.JdbcCrudOp.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean insertUser(Users users) {
        boolean status = false;
        try {
            String Insert_Sql_Query = "Insert Into Users(name, email, gender, city) VALUES(?,?,?,?)";
            int count = jdbcTemplate.update(Insert_Sql_Query, users.getName(), users.getEmail(), users.getGender(), users.getCity());

            if (count > 0) {
                status = true;
            } else {
                status = false;
            }
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }


    public boolean updateUser(Users users){
        boolean status=false;
        try {
            String UPDATE_SQL_QUERY = "UPDATE users SET name=?, gender=?, city=? WHERE email=?";
            int count = jdbcTemplate.update(UPDATE_SQL_QUERY, users.getName(), users.getGender(), users.getCity(), users.getEmail());
            if (count > 0){
                status=true;
            }
            else {
                status=false;
            }
        }
        catch (Exception e){
            status=false;
            e.printStackTrace();
        }
        return status;
    }

    public boolean deleteByUserEmail(String email){
        boolean status=false;
        try {
            String DELETE_SQL_QUERY = "DELETE from users where email=?";
            int count = jdbcTemplate.update(DELETE_SQL_QUERY, email);
            if (count > 0){
                status=true;
            }
            else {
                status=false;
            }
        }
        catch (Exception e){
            status=false;
            e.printStackTrace();
        }
        return status;
    }

    public Users getUsersByEmail(String email){
        String SELECT_SQL_QUERY= "SELECT * FROM users where email=?";
        return jdbcTemplate.queryForObject(SELECT_SQL_QUERY, new UserRowMapper(), email);
    }

    public List<Users> getAllUser(){
        String SELECT_SQL_QUERY = "SELECT * FROM users";
        return jdbcTemplate.query(SELECT_SQL_QUERY, new UserRowMapper());
    }

    public static final class UserRowMapper implements RowMapper<Users>{

        @Override
        public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
            Users users = new Users();
            users.setName(rs.getString("name"));
            users.setEmail(rs.getString("email"));
            users.setGender(rs.getString("gender"));
            users.setCity(rs.getString("city"));
            return users;
        }
    }
}
