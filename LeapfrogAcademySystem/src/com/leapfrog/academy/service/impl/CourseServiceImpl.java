/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.service.impl;

import com.leapfrog.academy.dao.CourseDAO;
import com.leapfrog.academy.dao.impl.CourseDAOImpl;
import com.leapfrog.academy.entity.Course;
import com.leapfrog.academy.service.CourseService;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CourseServiceImpl implements CourseService {
    
    private CourseDAO CourseDAO;
    
    public CourseServiceImpl(){
        CourseDAO=new CourseDAOImpl();
    }
    
    
    @Override
    public void export(String fileName, String content) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadFromFile(String fileName) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Course t) {
        return CourseDAO.insert(t);
    }

    @Override
    public int update(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Course> getAll() {
        return CourseDAO.getAll();
    }

    @Override
    public List<Course> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
