interface customer 
{
    int amt =5; //public +static +final
    void purchase();  //public + abstract
}
class Seller implements customer{
    @Override
    public void purchase(){
        //amt =7; this can not be done , as the value of int is final now
        System.out.println("Customer needs "+amt+ " kg rice");
    }
}
class Check
{
    public static void main(String args[])
    {
        customer c= new seller();
        c.purchase();
        System.out.println(customer.amt); //static 
    }
}
