import java.utill.Scanner;

public class Conditionals {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //This is an if statement
        if (input.equal("Hello")) {

            System.out.println("Goodbye");

        } else {

            System.out.println("Not a valid command");
        }

        if (input.equals("Are you gay bro?")){
            System.out.println("yes bro..");
        }

        scanner.close();
    }