package edu.iit.strategy;

import edu.iit.dataStorage.*;

//balance
public class DisplayBalanceStrategy_1 implements DisplayBalance{

    @Override
    public void DisplayBalance(DataStore ds) {
        System.out.println(((DataStoreOne)ds).getBalance());
    }
}
