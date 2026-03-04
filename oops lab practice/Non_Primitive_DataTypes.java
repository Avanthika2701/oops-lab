class Non_Primitive_DataTypes
{
public static void main(String[] args){
String name = "Avanthika";
int[] marks = {90, 90, 90};
Student s = new Student();
s.id = 110;
s.display();
System.out.println("Name: " + name);
System.out.println("Marks:");
for (int m : marks){
System.out.println(m);
}
}
}
class Student{
int id;
void display(){
System.out.println("Student ID: " + id);
}
}