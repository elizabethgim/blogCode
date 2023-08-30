package yujinns.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yujinns.blog.dto.User;
import yujinns.blog.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public void insertUser(@RequestBody User user){
        userService.insert(user);
    }

    @GetMapping("/{user_id}")
    public User getUser(@PathVariable("user_id") String id){
        return userService.selectById(id);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getUsers();

        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(users);
        }
        return ResponseEntity.ok(users);
    }

    @GetMapping("/delete/{user_id}")
    public void deleteById(@PathVariable("user_id") String id){
        userService.deleteById(id);
    }
}
