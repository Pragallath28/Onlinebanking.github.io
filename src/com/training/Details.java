package com.training;

import java.rmi.*;

public interface Details extends Remote
{
    public int open(String username,String password,double amount,String address,String phone) throws RemoteException;
    public String withdraw(int acno,String uname,String pwd,int amt) throws RemoteException;
    public String deposit(int acno,String uname,String pwd,int amt) throws RemoteException;
    public String transfer(int acno,String uname,String pwd,int tacno,int amt) throws RemoteException;
    public String close(int acno,String uname,String pass)  throws RemoteException;
    public String balance(int acno,String uname,String pass) throws RemoteException;
}