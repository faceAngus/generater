package com.angus.generater.service.impl;

import com.angus.generater.entity.Test;
import com.angus.generater.mapper.TestMapper;
import com.angus.generater.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Angus
 * @since 2019-07-08
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
