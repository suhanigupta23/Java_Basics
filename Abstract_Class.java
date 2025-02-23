//ABSTRACT CLASSES CAN NOT BE DIRECTLY ACCESSED BY MAKING OBJECTS , BUT THEY CAN BE ACCESSED THROUGH THEIR CHILD CLASSES

abstract class anime{
    anime(){
        System.out.println("Animes are best");
    }
    public abstract void genre();
}
class OnePiece extends anime{
    OnePiece(){
        super();
    }
    public void genre(){
        System.out.println("One Piece is action");
    }
} 
class YourName extends anime{
    YourName(){
        super();
    }
    public void genre(){
        System.out.println("Your Name movie is rom-com");
    }
}
public class Abstract_Class
{
	 public static void main(String []args){
	     OnePiece a = new OnePiece();
	     YourName b= new YourName();
	     a.genre();
	     b.genre();
	 }
}
