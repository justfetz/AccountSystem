package edu.iit.accounts;

import edu.iit.abstractfactory.AbstractFactory;
import edu.iit.dataStorage.*;
import edu.iit.state.MDA_EFSM;

//IMPLEMENT THE INTERFACE
public class AccountOne implements Account {
    //implement the Account interface and all methods
    MDA_EFSM m;
    DataStore ds;

    public AccountOne(MDA_EFSM m, DataStoreOne ds) {
        this.m = m;
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "AccountOne{" +
                "m=" + m +
                ", ds=" + ds +
                '}';
    }
    //took awhile to figure this out
    //IDE casts the datastore from DataStoreOne and sets
    //currently not storing variable in temp vars (inoperable DataStore)

    public void open(int p, int y, int a) {
        ((DataStoreOne) ds).temp_p = p;
        ((DataStoreOne) ds).temp_y = y;
        ((DataStoreOne) ds).temp_a = a;
        //test temp y
        System.out.println(((DataStoreOne) ds).temp_y);

        //Move to Open S
        m.Open();
        m.setCurrentState((m.getIdleState()));
    }

    public void pin(int x) {
        if (x == ((DataStoreOne) ds).getId()) {
            if (((DataStoreOne) ds).getBalance() > 100)
                m.CorrectPinAboveMin();
            else m.CorrectPinBelowMin();
        } else m.IncorrectPin(1);
    }

    public void deposit(int d) {
        ((DataStoreOne) ds).temp_d = d;
        m.Deposit();
        ((DataStoreOne) ds).deposit(d);
        if (((DataStoreOne) ds).getBalance() > 100)
            m.AboveMinBalance();
        else m.BelowMinBalance();
    }

    public void withdraw(int w) {
        ((DataStoreOne) ds).temp_w = w;
        m.Withdraw();
        //100 is given in notes
        if (((DataStoreOne) ds).getBalance() > 100) {
            m.AboveMinBalance();
        } else {
            m.WithdrawBelowMinBalance();
        }
    }

    public void balance() {
        System.out.println(((DataStoreOne) ds).getBalance());
        m.Balance();
    }

    public void login(int y) {
        int temp = ((DataStoreOne) ds).getId();
        //testing variable
        System.out.println("temp store " + temp);

        if (y == temp) {
            m.Login();
        } else m.IncorrectLogin();
    }

    public void logout() {
        m.Logout();
        System.out.println("Moved to Logout State");
    }

    public void lock(int x) {
        if (((DataStoreOne) ds).temp_p == x) {
            m.Lock();
            System.out.print("Locked State");
        } else {
            m.IncorrectLock();
            System.out.println("Incorrect Lock.");
        }
    }

    public void unlock(int x) {
        if (x == ((DataStoreOne) ds).temp_p) {
            m.Unlock();
            if (((DataStoreOne) ds).getBalance() > 100) {
                m.AboveMinBalance();
                System.out.println("Unlock Successful");
            } else {
                m.BelowMinBalance();
                System.out.println("Unlock, Below Balance");
            }
        } else {
            m.IncorrectUnlock();
            System.out.println("Incorrect Unlock.");
        }
    }

    //generic helper if needed for account ops
    @Override
    public void createAccount() {

    }
}

/**
 * METHODS FROM THE MDA-EFSM POSTED ON BLACKBOARD
 **/
/*
* open (int p, int y, int a) {
// store p, y and a in temp data store
 ds->temp_p=p;
 ds->temp_y=y;
 ds->temp_a=a;
 m->Open();
}
pin (int x) {
 if (x==ds->pin) {
 if (ds->balance > 100)
 m->CorrectPinAboveMin ();
 else m->CorrectPinBelowMin();
 }
 else m->IncorrectPin(1)
}
deposit (int d) {
 ds->temp_d=d;
 m->Deposit();
 if (ds->balance>100)
 m->AboveMinBalance();
 else m->BelowMinBalance();
}
withdraw (int w) {
 ds->temp_w=w;
 m->withdraw();
 if ((ds->balance>100)
 m->AboveMinBalance();
 else m->WithdrawBelowMinBalance();
}
balance() {m->Balance();}
login (int y) {
 if (y==ds->uid)
 m->Login();
 else m->IncorrectLogin();
}
logout() {m->Logout();}
lock (int x) {
 if (ds->pin==x) m->Lock();
 else m->IncorrectLock();
}
unlock (int x) {
 if (x==ds->pin) {
 m->Unlock();
 if (ds->balance > 100)
 m->AboveMinBalance ();
 else m->BelowMinBalance();
 }
 else m->IncorrectUnlock();
}
Notice:
m: is a pointer to the MDA-EFSM object
ds: is a pointer to the Data Store DS-1 object
In the data store:
balance: contains the current balance
pin: contains the pin #
id: contains user id
    * */


