package com.mvc.bean;

public class Vehicle{
    int v_id, b_id;
    float cost, mileage;
    String Model_id;

    public Vehicle(int v_id,int b_id,float cost,float mileage,String m_id){
        this.v_id=v_id;
        this.b_id=b_id;
        this.cost=cost;
        this.mileage=mileage;
        this.Model_id=m_id;
    }

    public int getId() {
    	return v_id;
    }
}