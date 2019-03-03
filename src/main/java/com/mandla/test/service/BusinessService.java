package com.mandla.test.service;


import org.springframework.stereotype.Service;

@Service
public class BusinessService {


    public void displayNum(String num){

        System.out.println("Testing");
        if(num.equals("1234")){
            System.out.println("Success");
        }else{
            System.out.println("failure");
        }
    }
    
}
