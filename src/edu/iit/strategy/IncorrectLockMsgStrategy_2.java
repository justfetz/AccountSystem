package edu.iit.strategy;

//Bad Lock
public class IncorrectLockMsgStrategy_2 implements IncorrectLockMsg {
    @Override
    public void IncorrectLockMsg() {
        System.out.println("Incorrect Lock Acct. Two");
    }
}
