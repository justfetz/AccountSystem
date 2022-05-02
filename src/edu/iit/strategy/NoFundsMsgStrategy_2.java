package edu.iit.strategy;

public class NoFundsMsgStrategy_2 implements NoFundsMsg {
    @Override
    public void NoFundsMsg() {
        System.out.println("You are broke homey, Acct. Two");
    }
}
