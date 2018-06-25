package com.ilidan.service.impl;

import com.ilidan.base.service.impl.BaseServiceImpl;
import com.ilidan.dao.StudentDao;
import com.ilidan.domain.Student;
import com.ilidan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ilidan_Y
 * @Package com.ilidan.service.impl
 * @Description:
 * @date 2018/6/24
 * @Modified by:
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
        super.setBaseDao(this.studentDao);
    }

}
