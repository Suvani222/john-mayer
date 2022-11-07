import java.util.Scanner;
public class Practice{
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        String ans = "don't know why";
        System.out.println("what's ue favorite norah jones song?");
        String UserAns = s.nextLine();
        if (UserAns.equals(ans)){
            System.out.println("yay! u won");
        }
        else{
            System.out.println("wrong");
        }

    }
}