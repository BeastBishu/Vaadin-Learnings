package org.vaadin.example;

import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class ButtonFunction implements Serializable {
    public String btnFunction(String name){
        if(name==null || name.isEmpty()){
            return "you have no name.";
        }else{
            return "hello "+ name;
        }
    }
}
