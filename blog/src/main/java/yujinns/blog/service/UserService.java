package yujinns.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yujinns.blog.dto.User;
import yujinns.blog.mapper.UserMapper;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public void insert(User user) {
        userMapper.insert(user);
    }

    public User selectById(String name){
        return userMapper.selectById(name);
    }

    public List<User> getUsers(){
        return userMapper.selectAll();
    }

    public void deleteById(String id){
        userMapper.deleteById(id);
    }
}
