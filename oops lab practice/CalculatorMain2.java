class Calculator {
public int add(int a,int b){
return a+b;
}
protected void display(){
System.out.println("This is Calculator class");
}
private void show(){
System.out.println("Private method in Calculator");
}
public void accessPrivate(){
show();
}
}

class AdvancedCalculator extends Calculator {
public int add(int a,int b){
return a+b+10;
}
protected void display(){
System.out.println("This is AdvancedCalculator class");
}
public void show(){
System.out.println("Show method in AdvancedCalculator");
}
}

public class CalculatorMain2 {
public static void main(String[] args){
Calculator c=new Calculator();
AdvancedCalculator ac=new AdvancedCalculator();
Calculator ref=new AdvancedCalculator();
System.out.println(c.add(5,3));
c.display();
c.accessPrivate();
System.out.println(ac.add(5,3));
ac.display();
ac.show();
System.out.println(ref.add(5,3));
ref.display();
}
}