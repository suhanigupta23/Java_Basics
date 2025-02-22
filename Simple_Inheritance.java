//SIMPLE INHERITANCE
class Student{
    protected int roll,marks;
    String name;
    //private class if made can not be extended.
    //Protectep can be extended 
    protected void input(){
        System.out.println("Enter roll, name and marks: ");
    }
}
class Simple_Inheritance extends Student {
    void disp(){
            roll=1; name = "Ekasu"; marks=94;
        System.out.println(roll+ " "+name+" "+marks);
       }
    public static void main(String [] args){
        Simple_Inheritance m = new Simple_Inheritance();
        m.input(); //input called line
        m.disp();
    }
}
