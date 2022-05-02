package edu.iit.strategy;

import edu.iit.dataStorage.DataStore;
import edu.iit.dataStorage.DataStoreTwo;

public class MakeWithdrawStrategy_2 implements MakeWithdraw{

    @Override
    public void MakeWithdraw(DataStore ds) {
        ((DataStoreTwo)ds).withdraw(((DataStoreTwo)ds).getTemp_w());
    }
}
