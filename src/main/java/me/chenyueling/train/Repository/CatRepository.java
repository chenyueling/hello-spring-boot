package me.chenyueling.train.Repository;

import me.chenyueling.train.domain.Cat;
import org.springframework.data.repository.CrudRepository;

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
 * @since 2016/12/23.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
