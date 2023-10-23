package tester;
import java.util.Scanner;
import code.Bank;
public class BankTester {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank[] customer=new Bank[10];
//	System.out.println("enter name,email,accountno,balance");
//	Bank B1=new Bank(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
//	System.out.println("enter name,email,accountno,balance");
//	Bank B2=new Bank(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
	 int ch;
	 int i=0, accountno;
	 
	do {
		System.out.println("0.add customer 1.display account details  2.withdrawl  3.diposit  4.money transfer  5.exit::");
	    ch=sc.nextInt();
	    switch (ch)
	    {
	    case 0:
	    	if(i<customer.length)
	    	{
	    		System.out.println("enter name,email,accountno,balance");
	    		Bank clint=new Bank(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
	    		customer[i]=clint;
	    		i++;
	    	}
	    	else
	    		System.out.println("SORRY Bank is full.");
	    	break;
	    case 1:
	    	
	    	Bank Ob;
	    	System.out.println("accountno=");
	    	accountno=sc.nextInt();
	    	for(Bank bo:customer)//int j=0;j<customer.length;j++)
	    	{
	    		
	    	if(accountno==bo.getAccountno())
	    	{
	    		System.out.println(bo);
	    		break;
	    	}
	    
	    	}
	    	break;
	    	/*
	    	 for(int j=0;j<customer.length;j++)
	    	{
	    		
	    	if(accountno==customer[j].getAccountno())
	    	{
	    		System.out.println(customer[j]);
	    		break;
	    	}
	    
	    	}
	    	break;
	    	*/
	    	
	    case 2:
	    	System.out.println("enter accountno:");
	    	accountno=sc.nextInt();
	    	for(Bank WA:customer)
	    	{
	    		if(WA.getAccountno()==accountno)
	    		{
	    		System.out.println("enter ammount want to withdrawl:");
	    		WA.withdrawl(sc.nextDouble());
	    		break;
	    		}
	    	}
	    	break;
	    	
	    case 3:
	    	
	    	System.out.println("enter acoountno:");
	    	accountno=sc.nextInt();
	    	for(Bank AA:customer)
	    	{
	    		if(AA.getAccountno()==accountno)
	    		{
	    			System.out.println("enter ammount want to add:");
	    			AA.credit(sc.nextDouble());
	    			break;
	    		}
	    	}
	    	
	    	break;
 	
	    case 4:
	    	int saccno,raccno;
	    	System.out.println("enetr ammount,sender accountno,reciver accountno");
	    	double amnt=sc.nextDouble();
	    	saccno=sc.nextInt();
	    	raccno=sc.nextInt();
	    	for(int p=0;p<10;p++)
	    	{
	    		if(customer[p].getAccountno()==saccno)
	    		{
			    	for(int j=0;j<10;j++)
			    	{
			    		if(customer[j].getAccountno()==raccno)
			    		{
			    			
			    			Bank.transfer(amnt,customer[p],customer[j]);
			    			System.out.println("found match");
			    			break;
			    		}
			    		
			    	}
			    	
			    	break;
	    		}

	    	}
	    	
	    	break;
 	
	    default :
	    	System.out.println("enter valid option:");
	    }
	
	
	}while(ch!=5);
	}

}
