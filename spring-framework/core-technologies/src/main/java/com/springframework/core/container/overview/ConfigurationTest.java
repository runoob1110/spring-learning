package com.springframework.core.container.overview;

import com.springframework.core.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：panleilei
 * @description
 * @modified By：
 * @version:
 * @date ：Created in 2023/9/8 16:27
 */
public class ConfigurationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
