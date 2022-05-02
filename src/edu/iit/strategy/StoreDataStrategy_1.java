package edu.iit.strategy;

import edu.iit.dataStorage.DataStore;
import edu.iit.dataStorage.DataStoreOne;

//Store variables
public class StoreDataStrategy_1 implements StoreData {

    @Override
    public void StoreData(DataStore ds) {
        ((DataStoreOne)ds).setPin(); //p
        ((DataStoreOne)ds).setId(); //y
        ((DataStoreOne)ds).setBalance(); //a
        System.out.println("You reached the Store Data Strategy");
    }
}
