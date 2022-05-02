package edu.iit.strategy;

import edu.iit.dataStorage.*;

//balance
public class DisplayBalanceStrategy_2 implements DisplayBalance {

    @Override
    public void DisplayBalance(DataStore ds) {
        System.out.println(((DataStoreTwo)ds).getBalance());

    }
}
