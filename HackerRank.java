import java.util.Scanner;

public class HackerRank {
    public static void main (String[]args){
        //java loops II
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        for (int i=0;i<q;i++){
            int a=s.nextInt();
            int b= s.nextInt();
            int n=s.nextInt();
            for(int j=0;j<n;j++){
                a = a+ ((int)Math.pow(2,j)*b);
                System.out.println(a);
            }
            System.out.println();
        }

    }
    
}
