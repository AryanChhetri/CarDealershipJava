package com.mvc.bean;
 
public class GeneralManager extends Employee{
    int Manager_id;
    public GeneralManager(int m_id,int b_id,int e_id){
        super(b_id,e_id);
        this.Manager_id=m_id;
    }
}