package com.mvc.bean;

public class Customer{
    
    String address,name;
    int custid;
    public int empid;
    double budget;
    String phnum;
    public int b_id;
    
    public Customer(String  name,String addr,int c_id,int b_id,double budget,String phnum){
        this.address=addr;
        this.name=name;
        this.custid=c_id;
        this.budget=budget;
        this.phnum=phnum;
        this.b_id=b_id;
    }

    public void set_eid(int eid) {
    	this.empid=eid;
    }
    public String getphnum() {
    	return phnum;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}