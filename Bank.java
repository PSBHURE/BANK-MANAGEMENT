/* create BankAccount   aaplication for operations like withdraw ,
 * deposite  and moneyTransfer.
Create menu drive program for bank operations..
,balance,email...*/
package code;

public class Bank {
private String name,email;
private int accountno;
private double balance,ammount;
public Bank(String name,String email, int accountno, double balance) {
	super();
	this.name = name;
	this.email=email;
	this.accountno = accountno;
	this.balance = balance;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountno() {
	return accountno;
}
public double getBalance() {
	return balance;
}
public void credit(double ammount)
{
	balance=balance+ammount;
}
public void withdrawl(double ammount)
{
	balance=balance-ammount;
}
public static void transfer(double ammount,Bank SE,Bank RE)
{
	double sebal=SE.getBalance();
	double rebal=RE.getBalance();
	SE.setBalance(sebal-ammount);
	RE.setBalance(rebal+ammount);
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setAmmount(double ammount) {
	this.ammount = ammount;
}
@Override
public String toString() {
	return "name=" + name +" ,email="+email+ " ,accountno=" + accountno + " ,balance=" + balance;
}

}
