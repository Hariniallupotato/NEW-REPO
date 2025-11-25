import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
    }
}

 Updated upstream

//dev2 code

public class Main {
  public static void main(String[] args) {
=======
new code added without pull the code

public class Main {
  public static void main(String[] args) {
    // This is a comment
>>>>>>> Stashed changes
    System.out.println("Hello World");
  }
}
