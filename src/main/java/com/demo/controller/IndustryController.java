package com.demo.controller;


import com.demo.entity.Industry;
import com.demo.service.IndustryService;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/industry")
public class IndustryController {
    @Resource
    IndustryService industryService;

    @ApiOperation("所有行业")
    @GetMapping("/all")
    List<Industry> all() {
        return industryService.list();
    }
}

