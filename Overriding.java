class shape{
    void show(){
        System.out.println("Can't say shape type");
    }
}
class square extends shape{
    //vaise likhne kizaroorat nhi par pata lagane ke liye likh dete hei Override
    @Override        //taki pata rhe ki override hei 
    void show(){
        System.out.println("Square");
    }
}
class traingle {
    @Override
    void show(){
        // super.show();   //used when we have to print the message of the shape class as well
        System.out.println("Triangle");
    }
}
class Overriding{
    public static void main(String args[]){
        shape r= new square();
        //ref of object is the class and new of subclass
        //both way can work square r= new square(); also works
        r.show();
    }
}
