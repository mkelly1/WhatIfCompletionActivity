import java.sql.SQLOutput;
import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args){
        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number : ");
        num1 = scan.nextInt();
        System.out.print("Enter the second number : ");
        num2 = scan.nextInt();
        int sum = num1 + num2;
        double average = (num1 + num2)/2;
        int product = num1 * num2;
        if(sum > 200){
            System.out.println("Product: "+product+" Sum: *"+sum+" Average: "+average );
        }
        else{
            System.out.println("Product: "+product+" Sum: "+sum+" Average: "+average );
        }
    }
}
