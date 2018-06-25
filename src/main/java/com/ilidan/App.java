package com.ilidan;

import com.ilidan.domain.Student;
import com.ilidan.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    private ApplicationContext context = null;

    private StudentService studentService;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Before
    public void initProject() {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.studentService = context.getBean(StudentService.class);
    }

    @Test
    public void testSaveStudent() {
        Student student = new Student();
        student.setStudentName("kevin");
        student.setScore(125.5);
        studentService.save(student);
    }

    @Test
    public void testGetById() {
        Student student = studentService.getById(1L);
        System.out.println(student.toString());
    }

    @Test
    public void testLoadById(){
        Student student = studentService.getById(1L);
        System.out.println(student.toString());
    }

    @Test
    public void testUpdate(){
        Student student = studentService.getById(2L);
        student.setScore(147.5);
        studentService.update(student);
    }

    @Test
    public void testDeleteStudent(){
        studentService.deleteById(1L);
    }

}
