abstract class Transport{
abstract double calculateFare(double distance);
public void displayType(){
System.out.println("Transport System");
}
}

class Bus extends Transport{
double calculateFare(double distance){
return distance*5;
}
}

class Train extends Transport{
double calculateFare(double distance){
return distance*3;
}
}

public class TransportMain{
public static void main(String[] args){
Transport t;
t=new Bus();
t.displayType();
System.out.println(t.calculateFare(10));
t=new Train();
t.displayType();
System.out.println(t.calculateFare(10));
}
}