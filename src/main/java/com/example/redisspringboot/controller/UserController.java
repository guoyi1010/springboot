package com.example.redisspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redisspringboot.service.RedisServices;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RedisServices redisServices;

    //从redis获取某个用户
    @GetMapping("/{key}")
    public String getRedis(@PathVariable("key") String key) {
        return redisServices.get(key).toString();
    }

    //获取所有用户
    /*@RequestMapping(value = "/getusers", method = RequestMethod.GET)
    public @ResponseBody Page<User> list(Model model, Pageable pageable){
        return userService.findAll(pageable); 
    }*/

    //添加用户
    /*@PutMapping("/{user}")
    public String addUser(@RequestParam String dictum,
            @RequestParam String password, @RequestParam String username) {
        User user = new User();
        user.setDictum(dictum);
        user.setPassword(password);
        user.setUsername(username);
        System.out.println(user);
        userService.saveUser(user);
        redisService.set(user.getId()+"", user);
        return "Saved";
    }*/
}

