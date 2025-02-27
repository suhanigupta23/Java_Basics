//INTERFACE STATIC AND DEFAULT METHODS INSIDE INTERFACE
interface A
  {
    void a1(); //public + abstract
    void a2(); //public + abstract

    //JDK 1.8 new rule that static+default methods can be added in interface
    default void a3(){
      System.out.println("May override, may not the implementing classes");
    }
    public static void a4(){
      System.out.println("Can not override interface static methods");
    }
  }
//Sub class ko karna padega implement the methods inside interface A otherwise the class implemented will also become abstract.
class B implements A
  {
    public void a1()
    {
      System.out.println("Class B a1()");
    }
    public void a2()
    {
      System.out.println("Class B a2()");
    }
    // @Override
    // public static void Show(){
    //   System.out.println("Errors");
    // }
    // CAN NOT BE OVERRIDEN , STATIC CLASS, THIS CODE IS INCORRECT
  }
class C implements A
  {
    public void a1()
    {
      System.out.println("Class C a1()");
    }
    public void a2()
    {
      System.out.println("Class C a2()");
    }
  }
class Interface_JDK1.8
  {
    public static void main(String []args){
      B b= new B();
      b.a1(); b.a2(); b.a3();
      //b.Show();  //INCORRECT AS SHOW IS STATIC METHOD
      C c= new C();
      c.a1(); c.a2();
    }
  }

//MAIN METHOD CAN BE ALSO BE IN INTERFACE CLASS AS WELL, AS IT IS ALSO STATIC.
