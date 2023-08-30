package yujinns.blog.mapper;

import org.apache.ibatis.annotations.Mapper;
import yujinns.blog.dto.User;

import java.util.List;

@Mapper
public interface UserMapper {
    void insert(User user);
    List<User> selectAll();
    User selectById(String id);
    void deleteById(String id);
}
