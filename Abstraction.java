//As there are different developer for different programming language 
// We take abstract method , as nothing to write in the specific main method but while extending we can write different deveopler for different prgramming language.
// ABSTRACTION
abstract class Programming{
    public abstract void Developer();
}
class HTML extends Programming
{
    @Override
    public void Developer()
    {
        System.out.println("Tim Berners Lee");
    } 
}
class Java extends Programming
{
    @Override
    public void Developer
    {
        System.out.println("James Gosling");
    } 
}

//NOTE : if any method ko override nhi kiya hei to, of the super class then us pure class (sub class , child class) ko abstract karna padta hei 
class Abstraction{
    public static void main(String args[])
    {
        HTML h= new HTML();
        h.Developer();
        Java j=new Java();
        j.Developer();
           
        //BOTH THESE GIVE THE SAME RESULT : 
        // Programming h= new HTML();
        // h.Developer();
        // Programming j=new Java();
        // j.Developer(); 
    }
}
