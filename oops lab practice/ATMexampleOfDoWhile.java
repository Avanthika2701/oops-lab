import java.util.*;
class ATMexampleOfDoWhile
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);
int option;
int password;
do
{
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Balance");
System.out.println("0. Exit");
System.out.println("Choose your option:");
option = sc.nextInt();
if(option==1)
{
System.out.println("5000 ruppees deposited.");
}
else if(option==2)
{
System.out.println("500 ruppees withdrawn.");
}
else if(option==3)
{
System.out.println("Enter your password to check your balance:");
do
{
System.out.println("Enter the password:");
password = sc.nextInt();
if(password!= 2701)
{
System.out.println("Opps! The password you have entered is wrong!");
}
}
while(password!=2701);
System.out.println("Your balance is 30000 ruppees!");
}
}
while(option!=0);
System.out.println("ATM session ended!");
}
}