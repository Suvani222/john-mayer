import java.lang.reflect.Array;
import java.util.Scanner;

public class ToDoList {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String userName;
        String TodoList;

        // System.out.println("pls enter ur userName");
        // Scanner s = new Scanner(System.in);
        // userName = s.next();
        // System.out.println("hello + userName");
        // System.out.println("would u like to create ur first todo list?");
        // String userAns = s.next();
        // if (userAns.equals("yes")) {
        // System.out.println("u are welcome to ur todo manager app");
        // }
        int choice = -1;
        String[] tasks = new String[10];
        Scanner input = new Scanner(System.in);
        System.out.println("here are the options:");
        System.out.println("1. enter ur tasks");
        System.out.println("2. remove ur tasks");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("u can add upto 10 tasks");
                System.out.println("also,enter how many tasks would u like to add");
                int taskSize = input.nextInt();
                for (int i = 0; i < taskSize; i++) {

                    System.out.println("enter ur task " + (i + 1));
                    tasks[i] = input.next();
                }
                System.out.println("your todo list is:");
                for (int i = 0; i < tasks.length; i++) {
                    if (tasks[i] != null) {
                        String taskID = "# "+(i + 1);
                        System.out.println("todo: " + tasks[i] + " "+taskID);
                    }
                }
                System.out.println("to delete the todo provide the todo id ");
                Scanner numIn = new Scanner(System.in);
                int index = numIn.nextInt();
                tasks[index - 1] = null;
                // if(index==0){
                // System.out.println("1 is removed");
                // }
                // if(index==1){
                // System.out.println("2 is removed");
                // }
                // if(index==3){
                // System.out.println("3 is removed");
                // }
                // if(index==4){
                // System.out.println("4 is removed");
                // }
                // if(index==5){
                // System.out.println("5 is removed");
                // }
                // if(index==6){
                // System.out.println("6 is removed");
                // }
                // if(index==7){
                // System.out.println("7 is removed");
                // }
                // if(index==8){
                // System.out.println("8 is removed");
                // }
                // if(index==9){
                // System.out.println("9 is removed");
                // }
                // if(index==10){
                // System.out.println("10 is removed");
                // }

                // print out undeleted tasks
                System.out.println("### undeleted tasks");
                for (int i = 0; i < tasks.length; i++) {
                    if (tasks[i] != null) {
                        System.out.println("todo " + tasks[i]);
                    }
                }

        }

        // for(int i = removeIndex; i<tasks.length -1; i++){
        // tasks[i]= tasks[i+1];

    }
}
