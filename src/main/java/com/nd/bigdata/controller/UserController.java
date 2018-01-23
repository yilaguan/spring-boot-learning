package com.nd.bigdata.controller;

import com.nd.bigdata.dao.metadata.UserEntity;
import com.nd.bigdata.dao.metadata.UserEntityRepository;
import com.nd.bigdata.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-17
 * Time: 下午10:21
 * AuthorEmail: zhangliangxgd@163.com
 */

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
    private final UserEntityRepository userEntityRepository;

    @Autowired
    public UserController(UserEntityRepository userEntityRepository){
        this.userEntityRepository = userEntityRepository;

    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<UserEntity> getUserList(){
        return userEntityRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user){
        User oldUser = users.get(id);
        oldUser.setAge(user.getAge());
        oldUser.setId(user.getId());
        oldUser.setName(user.getName());
        users.put(id, oldUser);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }

}



//    private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());
//
//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public List<User> getUserList(){
//        List<User> r = new ArrayList<User>(users.values());
//        return r;
//    }
//
//    @RequestMapping(value="/{id}", method = RequestMethod.POST)
//    public String postUser(@ModelAttribute User user){
//        users.put(user.getId(), user);
//        return "success";
//    }
//
//    @RequestMapping(value="/{id}", method = RequestMethod.GET)
//    public User getUser(@PathVariable Long id){
//        return users.get(id);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public String putUser(@PathVariable Long id, @ModelAttribute User user){
//        User oldUser = users.get(id);
//        oldUser.setAge(user.getAge());
//        oldUser.setId(user.getId());
//        oldUser.setName(user.getName());
//        users.put(id, oldUser);
//        return "success";
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public String deleteUser(@PathVariable Long id){
//        users.remove(id);
//        return "success";
//    }
