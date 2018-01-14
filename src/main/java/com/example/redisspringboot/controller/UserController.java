package com.example.redisspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redisspringboot.entity.User;
import com.example.redisspringboot.service.RedisServices;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RedisServices redisServices;

    //从redis获取某个用户
    @ApiOperation(value="获取value值", notes="获取value值")
    @GetMapping("/{key}")
    public String getRedis(@PathVariable("key") String key) {
        return redisServices.get(key).toString();
    	//return "success";
    }
    
    /**
     * 
     * @param key
     * @param value
     */
    @ApiOperation(value="获取value值", notes="获取value值")
    @PostMapping("/")
    public String setRedis(@RequestBody User user){
    	redisServices.set(user.getName(), user.getAge());
    	String age = redisServices.get(user.getName()).toString();
    	return age == null ? "true" : "false";
    }
    
//    /**
//     * 
//     * @param user
//     * @return
//     */
//    @ApiOperation(value="获取value值", notes="获取value值")
//    @PostMapping("/")
//    public String addUser(@RequestBody User user){
//    return "";	
//    }
//    
//    
//    /**
//     * 
//     * @param user
//     * @return
//     */
//    @ApiOperation(value="获取value值", notes="获取value值")
//    @PutMapping("/")
//    public String updateUser(@RequestBody User user){
//    return "";	
//    }
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

