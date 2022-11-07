public class Tree {
    String type="sal";
    String color= "green";
    int height= 20;
    
    public static boolean windMotion=false;
    
    public static void moving(){
        windMotion=true;
    }
    public static void motionless(){
        windMotion=false;
    }
    public static void print (String msg){
        System.out.println(msg);
    }
    public static void main(String[]args){
        Tree t = new Tree();
        Tree.print(t.type);
        Tree.print(t.color);
       System.out.println(t.height);

       t.moving();
       System.out.println(t.windMotion);
    }

    
}
