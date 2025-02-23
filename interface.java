//interface
//THIS SOURCE CODE WILL NOT BE VISIBLE TO THE CLIENT , THIS WILL BE ONLY VISIBLE TO THE DEVEOPLERS
//DEVEOPLERS GIVE THIS TO THE CLIENT AND ONLY THE INPUT, OUTPUT IS VISIBLE TO THE CLIENT
import java.util.*;
interface client{
    void input();      //public + abstract
    void output();     //public + abstract
}

class Ekasu implements client
{
    String name;
    double sal;
    public void input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Username: ");
        name = scn.nextLine();
        
        System.out.println("Enter the salary: ");
        sal =scn.nextDouble();
    }
    public void output(){
        System.out.println(name+ " "+sal);
    }
    public static void main(String []args){
        client c= new EKasu();
        c.input(); 
        c.output();
    }
}
