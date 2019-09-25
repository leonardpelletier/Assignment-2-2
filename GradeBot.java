import java.util.Scanner;

class GradeBot {
    public static void main (String[] args) {
        //100-86: A 85-73: B 72-67: C+ 66-60: C 59-50: C- 49-0: F
        //Variables
        Scanner sc = new Scanner(System.in);
        double outof = 0;
        double score = 0;
        double percent = 0;

        //Input
        System.out.print("What was your test out of? ");
        outof = sc.nextDouble();
        System.out.print("What mark did you get? ");
        score = sc.nextDouble();

        //Evaluate
        if (score > outof || score == 0 || score < 0) {
            System.out.println("Silly human, that's not possible. Quit joking around.");
        } else {
            percent = 100 * (score / outof);
            if (percent >= 86) {
                System.out.println("That's an A. Great work!");
            } else if (percent >= 73) {
                System.out.println("That's a B. Good job.");                
            } else if (percent >= 67) {
                System.out.println("That's a C+. Not bad.");
            } else if (percent >= 60) {
                System.out.println("That's a C ... you passed, but you can do better!");
            } else if (percent >= 50) {
                System.out.println("That's a C- ... study harder!");                
            } else {
                System.out.println("That's an F. You failed, but don't give up.");
            }

        }
    }
}
