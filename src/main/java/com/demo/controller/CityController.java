package com.demo.controller;


import com.demo.entity.City;
import com.demo.service.CityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Zeng
 * @since 2022-03-23
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    CityService cityService;

    @GetMapping("/all")
    @ApiOperation(value = "所有城市")
    List<City> cities() {
        return cityService.list();
    }

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/redis")
    @ApiOperation(value = "测试redis")
    String testRedis() {
        stringRedisTemplate.opsForValue().set("name", "曾盈盈");
        return stringRedisTemplate.opsForValue().get("name");
    }
}

