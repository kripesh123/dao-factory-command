/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.service.impl;

import com.leapfrog.academy.dao.StudentDAO;
import com.leapfrog.academy.dao.impl.StudentDAOImpl;
import com.leapfrog.academy.entity.Student;
import com.leapfrog.academy.service.StudentService;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentServiceImpl implements StudentService {
    
    private StudentDAO studentDAO;
    
    public StudentServiceImpl(){
        studentDAO=new StudentDAOImpl();
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
    public int insert(Student t) {
        return studentDAO.insert(t);
    }

    @Override
    public int update(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }

    @Override
    public List<Student> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
