package com.angus.generater.service.impl;

import com.angus.generater.entity.Users;
import com.angus.generater.mapper.UsersMapper;
import com.angus.generater.service.IUsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
