/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.dao.impl;

import com.leapfrog.academy.dao.StudentDAO;
import com.leapfrog.academy.entity.Student;
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
public class StudentDAOImpl implements StudentDAO {
    private List<Student> courseList;
    
    public StudentDAOImpl(){
        courseList=new ArrayList<>();
    }
    
    public StudentDAOImpl(List<Student> courseList){
        this.courseList=courseList;
    }

    @Override
    public int insert(Student t) {
        courseList.add(t);
        return 1;
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
        return courseList;
    }

    @Override
    public List<Student> search(String param) {
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
