import java.util.*;

public class Complete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number > 10) {
            System.out.println("Number is greater than 10.");
        }
        else if (number == 10){
            System.out.println("Number is equal to 10");
        }
        else
        {
            System.out.println("Number is less than 10.");
        }

        System.out.println("Application finished.");
    }
}
