package com.kingland.training.service;

import com.kingland.training.mapper.UserMapper;
import com.kingland.training.mapper.dao.UserModel;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @create 2022-05-16 12:39
 */
@Service
public class UserService {

    //    @Autowired
    private final UserMapper userMapper;
    //    @Autowired
    private final PasswordEncoder passwordEncoder;

    public UserService(UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public UserModel addUser(UserModel userModel) {
        /** encode raw password string before inserting to the database
         * the encode provided in {@link PasswordEncoderConfig#passwordEncoder}
         **/
        userModel.setPassword(this.passwordEncoder.encode(userModel.getPassword()));
        userMapper.insert(userModel);
        return userModel;
    }

    public Integer countUser() {
        return userMapper.count();
    }

    public UserModel getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public List<UserModel> getAllUser(){
        return userMapper.selectAllUsers();
    }

    public int deleteUser(Long userId) {
        return this.userMapper.deleteByPrimaryKey(userId);
    }
}
