package edu.iit.state;

public interface State {

    //certain operations only available from certain states
    //req to be able to call all methods at all times.
    //if you cannot perform an operation from a certain state
    //software should still invoke function and warn user.
    void Open();
    void Login();
    void Logout();
    void IncorrectLogin();
    void IncorrectPin(int max);
    void CorrectPinAboveMin();
    void IncorrectLock();
    void Deposit();
    void Balance();
    void Suspend();
    void Activate();
    void Lock();
    void Withdraw();
    void AboveMinBalance();
    void NoFunds();
    void Close();
    void Unlock();
    void IncorrectUnlock();
    void WithdrawBelowMinBalance();
    void BelowMinBalance();
    void CorrectPinBelowMin();

}
