class Student{
private String name;
private int roll;
private int marks;
public void setName(String name){
this.name=name;
}
public void setRoll(int roll){
this.roll=roll;
}
public void setMarks(int marks){
if(marks>=0 && marks<=100){
this.marks=marks;
}
}
public String getName(){
return name;
}
public int getRoll(){
return roll;
}
public int getMarks(){
return marks;
}
}

public class StudentMain{
public static void main(String[] args){
Student s=new Student();
s.setName("Avanthi");
s.setRoll(1);
s.setMarks(95);
System.out.println(s.getName());
System.out.println(s.getRoll());
System.out.println(s.getMarks());
}
}