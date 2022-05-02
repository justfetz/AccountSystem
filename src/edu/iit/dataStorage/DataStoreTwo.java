package edu.iit.dataStorage;

import javax.xml.crypto.Data;

public class DataStoreTwo extends DataStore {

    int temp_y;
    int temp_p;
    float temp_d;
    float temp_w;
    float temp_a;

    int pin;
    float balance;
    int id;


    //empty constructor
    public DataStoreTwo(/*float temp_a, int temp_y, int temp_p, float temp_d, float temp_w, int pin, float balance, int id*/) {
        //this.temp_a = temp_a;
        //this.temp_y = temp_y;
        //this.temp_p = temp_p;
        //this.temp_d = temp_d;
        //this.temp_w = temp_w;
        //this.pin = pin;
        //this.balance = balance;
        //this.id = id;
    }

    public float getTemp_a() {
        return temp_a;
    }

    public void setTemp_a(float temp_a) {
        this.temp_a = temp_a;
    }

    public int getTemp_y() {
        return temp_y;
    }

    public void setTemp_y(int temp_y) {
        this.temp_y = temp_y;
    }

    public int getTemp_p() {
        return temp_p;
    }

    public void setTemp_p(int temp_p) {
        this.temp_p = temp_p;
    }

    public float getTemp_d() {
        return temp_d;
    }

    public void setTemp_d(float temp_d) {
        this.temp_d = temp_d;
    }

    public float getTemp_w() {
        return temp_w;
    }

    public void setTemp_w(float temp_w) {
        this.temp_w = temp_w;
    }

    public int getPin() {
        return pin;
    }

    public float setPin() {
        pin = temp_p;
        return pin;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance() {
        balance = temp_a;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = temp_y;
    }

    public void deposit(float d) {
        this.balance += d;
    }

    public void withdraw(float w) {
        this.balance -= w;
    }
    public void penalty(float pen) {
        this.balance -= pen;
    }

}
