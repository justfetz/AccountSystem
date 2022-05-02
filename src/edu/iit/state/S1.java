package edu.iit.state;

public class S1 implements State {

    MDA_EFSM m;

    public S1(MDA_EFSM m) {
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

    }

    @Override
    public void AboveMinBalance() {
        m.setCurrentState(m.getReadyState());
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
        m.p.Penalty();
        m.setCurrentState(m.getOverDrawn());
    }

    @Override
    public void BelowMinBalance() {
        m.setCurrentState(m.getOverDrawn());
    }

    @Override
    public void CorrectPinBelowMin() {

    }
}
