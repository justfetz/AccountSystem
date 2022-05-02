package edu.iit.state;

import edu.iit.strategy.DisplayBalance;

public class Ready implements State {

    MDA_EFSM m;

    public Ready(MDA_EFSM m) {
        this.m = m;
    }

    @Override
    public void Open() {

    }

    @Override
    public void Login() {

    }

    @Override
    public void Logout() {
        m.setCurrentState(m.getIdleState());
    }

    @Override
    public void IncorrectLogin() {

    }

    @Override
    public void IncorrectPin(int max) {

    }

    @Override
    public void CorrectPinAboveMin() {

    }

    @Override
    public void IncorrectLock() {
        m.p.IncorrectLockMsg();
        m.setCurrentState(m.getReadyState());
    }

    @Override
    public void Deposit() {
        m.p.MakeDeposit();
        m.setCurrentState(m.getReadyState());
    }

    @Override
    public void Balance() {
        m.Balance();
        m.p.DisplayBalance();
    }

    @Override
    public void Suspend() {
        m.setCurrentState(m.getSuspended());
    }

    @Override
    public void Activate() {

    }

    @Override
    public void Lock() {
        m.setCurrentState(m.getLockedState());
    }

    @Override
    public void Withdraw() {
        m.p.MakeWithdraw();
        m.setCurrentState(m.getS1State());
    }

    @Override
    public void AboveMinBalance() {

    }

    @Override
    public void NoFunds() {
        m.p.NoFundsMsg();
        m.setCurrentState(m.getReadyState());
    }

    @Override
    public void Close() {

    }

    @Override
    public void Unlock() {

    }

    @Override
    public void IncorrectUnlock() {

    }

    @Override
    public void WithdrawBelowMinBalance() {

    }

    @Override
    public void BelowMinBalance() {

    }

    @Override
    public void CorrectPinBelowMin() {

    }
}
