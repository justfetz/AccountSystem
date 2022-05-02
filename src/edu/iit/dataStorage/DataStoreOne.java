package edu.iit.dataStorage;

public class DataStoreOne extends DataStore {
    //read from temporary fields
    public int temp_p;
    public int temp_y;
    public int temp_a;
    public int temp_d;
    public int temp_w;

    public int pin;
    public int balance;
    public int id;

    //DataStoreOne stores variables directly in Account Operations
    //no contructor
    //set fields as the program progresses
    //public DataStoreOne() {

        //this.temp_p = temp_p;
        //this.temp_y = temp_y;
        //this.temp_a = temp_a;
        //this.pin = pin;
        //this.balance = balance;
        //this.temp_d = temp_d;
        //this.temp_w = temp_w;
        //this.id = id;
    //}
    /*
    public void setTemp_p(int i) {
        temp_p = i;
    }
    public int getTemp_p() {
        return temp_p;
    }


    public void setTemp_y(int x) {
        temp_y = x;
        System.out.println("input " + x);
        System.out.println("temp_y" + temp_y);
    }
    public int getTemp_y() {
        System.out.println("temp_y " + temp_y);
        return temp_y;
    }
    public int getTemp_d() {
        return temp_d;
    }
    public void setTemp_d(int temp_d) {

        this.temp_d = temp_d;
    }

    public int getTemp_w() {
        return temp_w;
    }
    public void setTemp_w(int temp_w) {
        this.temp_w = temp_w;
    }


    public void setTemp_a(int a) {
        temp_a = a;
    }
    public int getTemp_a() {
        return temp_a;
    }
*/
    public int getPin() {
        return pin;
    }
    public int setPin() {
        pin = temp_p;
        return pin;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance() {
        balance = temp_a;
        System.out.println("temp_a =" + temp_a);
        System.out.println("Balance: " + balance);
        System.out.println("Get Balance" + getBalance());
        System.out.println("ID: " + getId());
    }


    public int getId() {
        return id;
    }
    public void setId() {
        id = temp_y;
        System.out.println(getId());
    }

    public void deposit(int d) {
        this.balance += d;
    }

    public void withdraw(int w) {
        this.balance -= w;
    }

    public void penalty(int pen) {
        this.balance -= pen;
    }


}
