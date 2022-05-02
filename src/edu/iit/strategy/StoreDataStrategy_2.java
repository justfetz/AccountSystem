package edu.iit.strategy;

import edu.iit.dataStorage.*;

//Store Variables
public class StoreDataStrategy_2 implements StoreData {

    @Override
    public void StoreData(DataStore ds) {
        ((DataStoreTwo)ds).setPin();
        ((DataStoreTwo)ds).setId();
        ((DataStoreTwo)ds).setBalance();
        System.out.println("You reached the Store Data Strategy");
    }
}
