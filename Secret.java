import java.util.Scanner;

class Secret {

    public static void main (String[] args) {
        //Variable Declarations
        Scanner sc = new Scanner(System.in);
        String answer   = "";

        //Get input and evaluate
        System.out.print("What is the password? ");
        answer = sc.nextLine();
        if ("dragon".equals(answer)) {
            System.out.println("Correct! My secret is: I am Batman.");
        } else {
            System.out.println("Incorrect Password! My secret is still safe...");
        }
    }
}
