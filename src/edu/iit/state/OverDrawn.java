package edu.iit.state;

public class OverDrawn implements State {

    public OverDrawn(MDA_EFSM m) {
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
        m.setCurrentState(m.getOverDrawn());
    }

    @Override
    public void Deposit() {
    m.Deposit();
    m.p.MakeDeposit();
    m.setCurrentState(m.getS1State());
    }

    @Override
    public void Balance() {
        //Display Balance available from OP
        m.p.DisplayBalance();
        m.setCurrentState(m.getOverDrawn());
    }

    @Override
    public void Suspend() {

    }

    @Override
    public void Activate() {

    }

    @Override
    public void Lock() {

    }

    @Override
    public void Withdraw() {
        m.p.NoFundsMsg();
        m.setCurrentState(m.getOverDrawn());
    }

    @Override
    public void AboveMinBalance() {

    }

    @Override
    public void NoFunds() {

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
