package com.mvc.bean;
 
public class Accountant extends Employee{
    int [] cust_id = new int[100];
    
    Accountant(int b_id,int e_id,int [] cid){
        super(b_id, e_id);
        this.cust_id=cid;
    }
    
   
}