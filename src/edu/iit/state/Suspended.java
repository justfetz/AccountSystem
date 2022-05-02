package edu.iit.state;

public class Suspended implements State {

    public Suspended(MDA_EFSM m) {
        this.m = m;
    }

    MDA_EFSM m;

    @Override
    public void Open() {

    }

    @Override
    public void Login() {

    }

    @Override
    public void Logout() {

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

    }

    @Override
    public void Deposit() {

    }

    @Override
    public void Balance() {
        m.p.DisplayBalance();
        m.setCurrentState(m.getSuspended());
    }

    @Override
    public void Suspend() {

    }

    @Override
    public void Activate() {
        m.setCurrentState(m.getReadyState());
    }

    @Override
    public void Lock() {

    }

    @Override
    public void Withdraw() {

    }

    @Override
    public void AboveMinBalance() {

    }

    @Override
    public void NoFunds() {

    }

    @Override
    public void Close() {
        m.setCurrentState(m.getIdleState());
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
