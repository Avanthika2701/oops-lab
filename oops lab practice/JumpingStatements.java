public class JumpingStatements{
public static void main(String[] args){
System.out.println("Demonstrating break statement:");
for(int i = 1; i <= 5; i++){
if(i == 4){
break;
}
System.out.println(i);
}
System.out.println("\nDemonstrating continue statement:");
for(int i = 1; i <= 5; i++){
if(i == 3){
continue;
}
System.out.println(i);
}
System.out.println("\nDemonstrating return statement:");
showMessage();
}
public static void showMessage(){
System.out.println("Before return");
if(true){
return;
}
System.out.println("This line will not execute");
}
}