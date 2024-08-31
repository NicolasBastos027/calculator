import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int confirm = 0;

        while(confirm != 9){
            System.out.print("- - Calculator - -\n\n"); 
            System.out.print("1 - Division\n");
            System.out.print("2 - Multiply\n");
            System.out.print("3 - Plus\n");
            System.out.print("4 - Minus\n");
            System.out.print("9 - Exit\n");
        System.out.print("What sentence do you like execute:");
            int validation = scanner.nextInt();

            if(validation == 9){
                break;
            }
            if(validation == 1){
                System.out.print("Write the firts number:");
                float num = scanner.nextInt();
                System.out.print("\nwrite the last one:");
                float num2 = scanner.nextInt();
                System.out.print("\nResult:" + (num/num2) + "\n");
            }
            if(validation == 2){
                System.out.print("Write the firts number:");
                float num = scanner.nextInt();
                System.out.print("\nwrite the last one:");
                float num2 = scanner.nextInt();
                System.out.print("\nResult:" + (num*num2) + "\n");
            }
            if(validation == 3){
                System.out.print("Write the firts number:");
                float num = scanner.nextInt();
                System.out.print("\nwrite the last one:");
                float num2 = scanner.nextInt();
                System.out.print("\nResult:" + (num+num2) + "\n");
            }
            if(validation == 4){
                System.out.print("Write the firts number:");
                float num1 = scanner.nextInt();
                System.out.print("\nwrite the last one:");
                float num2 = scanner.nextInt();
                System.out.print("\nResult:" + (num1 -num2) + "\n");


            }
            System.out.println("Do you like to continue? (1- continue | 9- exit)");
            confirm = scanner.nextInt();
        }
    }

}
