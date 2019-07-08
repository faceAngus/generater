package com.angus.generater.service.impl;

import com.angus.generater.entity.Student;
import com.angus.generater.mapper.StudentMapper;
import com.angus.generater.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
