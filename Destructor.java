public class Destructor
 {
     public void finalize()
     {
        System.out.println("object is destroyed by the garbage collector ");

    }
    public static void main (String[]args)
    {
        Destructor d = new Destructor();
       // d.finalize();
        d=null;
        System.gc();
        //activating a garbage collector.
        System.out.println("Inside the main() method");

    }
    
}
