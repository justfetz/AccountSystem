package edu.iit.strategy;

import edu.iit.dataStorage.DataStoreOne;

//Id is bad
public class IncorrectIDMsgStrategy_1 implements IncorrectIDMsg {


    @Override
    public void IncorrectIDMsg() {
        System.out.println("Incorrect ID Acct. One");
    }
}
