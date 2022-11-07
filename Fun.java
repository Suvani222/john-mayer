
/* 1******
   123***
   1234**
   12345*
   123456
*/
public class Fun{

    public static void main (String[]args){
        /*  1.   for (int i=1;i<=6;i++){
                for (int j=1;j<=i;j++){
                 System.out.println(j);
            }
                  for (int k=6;k>i;k--){
                System.out.print("*");

            }
                      System.out.println();
                }*/

            /*  2. 12345&
                   1234&&
                   123&&&
                   12&&&&
                   1&&&&&
                   &&&&&&   */

              for(int i=1;i>=1;i--){
                for (int j=1;j<i;j++){
                    System.out.println(j);
                }
                for (int k=6;k>=i;k--){
                    System.out.print("&");
                }
                System.out.println();
              }     


       
    }
     
}