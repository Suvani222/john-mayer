import java.util.ArrayList;
import java.util.Scanner;
public class Prime {
    public static void main(String[]args){
        checkingPrime(1,100);
    }
    public static ArrayList <Integer> checkingPrime (int start,int end){
        ArrayList<Integer> Pm = new ArrayList<Integer>(); 

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to check if it is prime");
        int n = sc.nextInt();
        boolean prime = true;

    int i= 2;
    while (i<=n/2){
        if(n%2==0){
        prime=false;
    }
    i++;
}
    System.out.println(prime);
    return null;
}
}
