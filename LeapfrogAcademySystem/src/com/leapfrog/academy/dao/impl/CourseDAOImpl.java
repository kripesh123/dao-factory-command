/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.dao.impl;

import com.leapfrog.academy.dao.CourseDAO;
import com.leapfrog.academy.entity.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CourseDAOImpl implements CourseDAO {
    private List<Course> courseList;
    
    public CourseDAOImpl(){
        courseList=new ArrayList<>();
    }
    
    public CourseDAOImpl(List<Course> courseList){
        this.courseList=courseList;
    }

    @Override
    public int insert(Course t) {
        courseList.add(t);
        return 1;
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
        return courseList;
    }

    @Override
    public List<Course> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void export(String fileName, String content)throws IOException {
        
        FileWriter writer=new FileWriter(new File(fileName));
        writer.write(content);
        writer.close();
    }

    @Override
    public void loadFromFile(String fileName) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(new File(fileName)));
        String line="";
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        
        reader.close();
    }
    
}
