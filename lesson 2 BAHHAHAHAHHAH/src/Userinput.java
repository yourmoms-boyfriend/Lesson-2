import java.util.Scanner; //import scanner object

public class Userinput { //create user input class


    public static void main(String[] args){ //create main method
        Scanner scanner = new Scanner(System.in); //create scanner object
        //to take user input

        String.out.println("Enter a String: "); //print out string to prompt user to put an input
        String input = scanner.nextLine(); //storing user insput as a string variable

        System.out.println(input); //print out user input

        scanner.close(); //close the scanner
    }
}