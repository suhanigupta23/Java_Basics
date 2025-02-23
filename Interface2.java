interface Client
{
    void webdesign();   //public + abstract
    void webdeveloper();   //public + abstract
}
abstract class Tech1 implements Client
{
    @Override          //only one task compelted by tech1  , so becomes abstract class
    void webdesign()
    {
            System.out.println("Green, top menu, three dot button");
    }
}
abstract class Tech2 implements Tech1  // uske aage se hi kaam continue karega Tech2
{
    @Override 
    void webdeveloper()
    {
        System.out.println("HTML, CSS, JS")
    }
}

class Interface2{
    public static void main(String []args){
        Tech2 r= new Tech2();
        r.webdesign();
        r.webdeveloper();
    }
}

