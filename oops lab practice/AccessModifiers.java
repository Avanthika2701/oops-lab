class AccessDemo{
private int privateVar = 10;
int defaultVar = 20;
protected int protectedVar = 30;
public int publicVar = 40;
private void privateMethod(){
System.out.println("Private Method: " + privateVar);
}
void defaultMethod(){
System.out.println("Default Method: " + defaultVar);
}
protected void protectedMethod(){
System.out.println("Protected Method: " + protectedVar);
}
public void publicMethod(){
System.out.println("Public Method: " + publicVar);
}
public void accessPrivate(){
privateMethod();
}
}

public class AccessModifiers{
public static void main(String[] args){
AccessDemo obj = new AccessDemo();
System.out.println("Default Variable: " + obj.defaultVar);
System.out.println("Protected Variable: " + obj.protectedVar);
System.out.println("Public Variable: " + obj.publicVar);
obj.accessPrivate();
obj.defaultMethod();
obj.protectedMethod();
obj.publicMethod();
}
}