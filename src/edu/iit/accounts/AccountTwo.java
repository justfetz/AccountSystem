package edu.iit.accounts;

import edu.iit.state.MDA_EFSM;
import edu.iit.dataStorage.*;
//tried to use getters and setters for account 2
public class AccountTwo implements Account {

    MDA_EFSM m;
    DataStore ds;

    @Override
    public void createAccount() {

    }

    public AccountTwo(MDA_EFSM m, DataStore ds) {
        this.m = m;
        this.ds = ds;
    }

    public void OPEN(int p, int y, float a) {
// store p, y and a in temp data store
        ((DataStoreTwo) ds).setTemp_p(p);
        ((DataStoreTwo) ds).setTemp_y(y);
        ((DataStoreTwo) ds).setTemp_a(a);
        m.Open();
    }


    public void PIN(int x) {
        if (x == ((DataStoreTwo) ds).getPin())
            m.CorrectPinAboveMin();
        else m.IncorrectPin(5);
    }

    public void DEPOSIT(float d) {
        ((DataStoreTwo) ds).setTemp_d(d);
        m.Deposit();
    }

    public void WITHDRAW(float w) {
        ((DataStoreTwo) ds).setTemp_w(w);
        if (((DataStoreTwo) ds).getBalance() > 0) {
            m.Withdraw();
            m.AboveMinBalance();
        } else {
            m.NoFunds();
        }
    }

    public void BALANCE() {
        System.out.println(((DataStoreTwo)ds).getBalance());
        m.Balance();
    }

    public void LOGIN(int y) {
        if (y == ((DataStoreTwo) ds).getTemp_y())
            m.Login();
        else m.IncorrectLogin();
    }

    public void LOGOUT() {
        m.Logout();
    }

    public void suspend() {
        m.Suspend();
    }

    public void activate() {
        m.Activate();
    }

    public void close() {
        m.Close();
    }


/**METHODS FROM THE project site**/
    /*
    * OPEN (int p, int y, float a) {
// store p, y and a in temp data store
 ds->temp_p=p;
 ds->temp_y=y;
 ds->temp_a=a;
 m->Open();
}
PIN (int x) {
 if (x==ds->pin)
 m->CorrectPinAboveMin ();
 else m->IncorrectPin(2)
}
DEPOSIT (float d) {
 ds->temp_d=d;
 m->Deposit();
}
WITHDRAW (float w) {
 ds->temp_w=w;
 if (ds->balance>0)
 m->Withdraw();
 m-> AboveMinBalance()
 else m->NoFunds();
}
BALANCE() {m->Balance();}
LOGIN (int y) {
 if (y==ds->uid)
 m->Login();
 else m->IncorrectLogin();
}
LOGOUT() {m->Logout();}
suspend () {
 m->Suspend();
}
activate () {
 m->Activate();
}
close () {
 m->Close();
}
Notice:
m: is a pointer to the MDA-EFSM object
ds: is a pointer to the Data Store DS-2 object
In the data store:
balance: contains the current balance
pin: contains the pin #
id: contains user id
    * */
}
