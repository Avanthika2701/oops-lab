import java.util.Scanner;
public class DataOperations{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks obtained in subject 1:");
int m1 = sc.nextInt();
System.out.println("Enter the marks obtained in subject 2:");
int m2 = sc.nextInt();
System.out.println("Enter the marks obtained in subject 3:");
int m3 = sc.nextInt();
int addition = m1 + m2 + m3;
int subtraction = m1 - m2;
int multiplication = m1 * m2 * m3;
int division = m1 / m2;
int modulo = m1 % m3;
double avg = addition / 3.0;
int bonus = 5;
bonus++;
bonus--;
boolean isEqual = m1 == m2;
boolean isGreater = m1 > m2;
boolean isNotEqual = m1 != m2;
boolean pass = (m1 >= 40 && m2 >= 40 && m3 >= 40);
boolean distinction = (avg > 75 || m1 >= 90);
boolean fail = !pass;
System.out.println("Total marks: " + addition);
System.out.println("Average marks: " + avg);
System.out.println("Difference: " + subtraction);
System.out.println("Product: " + multiplication);
System.out.println("Quotient: " + division);
System.out.println("Modulo operation result: " + modulo);
System.out.println("Bonus: " + bonus);
System.out.println("m1 > m2: " + isGreater);
System.out.println("m1 == m2: " + isEqual);
System.out.println("m1 != m2: " + isNotEqual);
if(pass){
System.out.println("Status: PASS");
}
else{
System.out.println("Status: FAIL");
}
if(distinction){
System.out.println("Distinction awarded.");
}
else{
System.out.println("No distinction awarded.");
}
sc.close();
}
}