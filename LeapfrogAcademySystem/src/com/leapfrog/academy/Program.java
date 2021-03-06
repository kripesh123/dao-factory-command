/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy;

import com.leapfrog.academy.view.AbstractView;
import com.leapfrog.academy.view.ViewFactory;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Program {

    public static void menu(){
        System.out.println("=============================");
        System.out.println(" Welcome to Leapfrog Academy");
        System.out.println("=============================");
        
        System.out.println("1. Courses");
        System.out.println("2. Students");
        System.out.println("3. Facilitators");
        System.out.println("4. Exit");
        System.out.println("Enter your Choice[1-4]:");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            menu();
            AbstractView view=ViewFactory.get(input.next());
            if(view!=null){
                view.setInput(input);
                view.controller();
            }
            else{
                System.out.println("Invalid Choice please enter again");
            }
        }
    }
    
}
