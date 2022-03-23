package com.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.City;
import com.demo.mapper.CityMapper;
import com.demo.service.CityService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zeng
 * @since 2022-03-23
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

}
