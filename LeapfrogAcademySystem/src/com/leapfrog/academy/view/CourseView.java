/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.view;

import com.leapfrog.academy.entity.Course;
import com.leapfrog.academy.service.CourseService;
import com.leapfrog.academy.service.impl.CourseServiceImpl;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CourseView extends AbstractView {
     CourseService courseService=new CourseServiceImpl();

    public void menu(){
        System.out.println("================");
        System.out.println("1. Add Course");
        System.out.println("2. Show Courses");
        System.out.println("3. Back");
        System.out.println("Enter your choice[1-3]:");
    }

    @Override
    public void controller() {
        while(true){
            boolean back=false;
        menu();
        switch(input.nextInt()){
            case 1:
                add();
                break;
            case 2:
                showAll();
                break;
            case 3:
                back=true;
                break;
        }
        
        if(back){
            break;
        }
        
        }
        
    }
    
    private void add(){
        while(true){
        Course c=new Course();
        
        System.out.println("Enter Id:");
        c.setId(input.nextInt());
        System.out.println("Enter Name:");
        c.setName(input.next());
        System.out.println("Enter Description:");
        c.setDescription(input.next());
        System.out.println("Enter Fees:");
        c.setFees(input.nextDouble());
        System.out.println("Enter Status:");
        c.setStatus(input.nextBoolean());
        
        courseService.insert(c);
            System.out.println("Do you want to add more[Y/N]");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }
        }
        
    }
    
    private void showAll(){
        courseService.getAll().forEach(c->{
            System.out.println(c.toString());
        });
    }
    
}
