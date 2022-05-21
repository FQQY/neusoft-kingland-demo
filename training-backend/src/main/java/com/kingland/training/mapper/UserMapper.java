package com.kingland.training.mapper;

//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageInfo;
import com.kingland.training.mapper.dao.UserModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);

    UserModel selectUserByUsername(String username);

//    Page<UserModel> query(PageInfo<UserModel> queryRequest);

    Integer count();

    List<UserModel> selectAllUsers();
}