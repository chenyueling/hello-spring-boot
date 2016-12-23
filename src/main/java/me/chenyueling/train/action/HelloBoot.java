package me.chenyueling.train.action;

import me.chenyueling.train.Repository.CatRepository;
import me.chenyueling.train.Repository.CutRepository;
import me.chenyueling.train.domain.Cat;
import me.chenyueling.train.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 　　　　　　　 ┏┓   ┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　  ┃　　　┃
 * 　　　　　　　  ┃　　　┃ + + + +
 * 　　　　　　　  ┃　　　┃　　　　Code is far away from bug with the animal protecting
 * 　　　　　　　  ┃　　　┃ + 　　　　神兽保佑,代码无BUG
 * 　　　　　　　  ┃　　　┃
 * 　　　　　　　  ┃　　　┃　　+
 * 　　　　　　　  ┃　 　　┗━━━┓ + +
 * 　　　　　　　  ┃ 　　　　　　　┣┓
 * 　　　　　　　  ┃ 　　　　　　　┏┛
 * 　　　　　　　  ┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　┃┫┫ ┃┫┫
 * 　　　　　　　　　┗┻┛ ┗┻┛+ + + +
 * Copyright (c) 2016 Mljia , All rights reserved.
 * http://www.mljia.cn/
 *
 * @author Paul
 * @description
 * @since 2016/11/2.
 */
@RestController
public class HelloBoot {
    @Resource
    CutRepository cutRepository;

    @Resource
    CatRepository catRepository;

    @RequestMapping("/")
    @ResponseBody
    Object home() {
        //return cutRepository.findAll();
        return "x";
    }

    @RequestMapping("/x")
    @ResponseBody
    Object homex() {
        //return cutRepository.findAll();
        return "x";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public User add() {

        Cat cat = new Cat("miaomiao");
        User user = new User("owen",1,cat);
      //  catRepository.save(cat);
        cutRepository.save(user);

        return user;
    }
}
