//ENCAPSULATION : data hiding + data abstraction
class A{
    private int value;   //data hiding
    
    public void setValue(int x){     //data abstraction
        value =x;
    }
    public int getValue(){
        return value;
        // return ++value;//increment karke dega
    }
}
class Encapsulation{
    public static void main(String args[]){
        A r= new A();
        // r.value = 100;    // not accessible as private variable
        // System.out.println(r.value);     //not possible as accessing outside the class of private varaible
    
        //WE USE DIRECT METHOD NAMES :
        r.setValue=(100);
        System.out.println(r.getValue());
    }
}
