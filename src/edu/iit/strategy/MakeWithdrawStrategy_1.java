package edu.iit.strategy;

import edu.iit.dataStorage.*;

public class MakeWithdrawStrategy_1 implements MakeWithdraw{



    @Override
    public void MakeWithdraw(DataStore ds) {
        ((DataStoreOne)ds).withdraw(((DataStoreOne)ds).temp_w);
    }
}
