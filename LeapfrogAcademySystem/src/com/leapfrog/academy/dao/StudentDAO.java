/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.dao;

import com.leapfrog.academy.entity.Student;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public interface StudentDAO extends GenericDAO<Student> {
    void export(String fileName,String content) throws IOException;
    void loadFromFile(String fileName)throws IOException;    
}
