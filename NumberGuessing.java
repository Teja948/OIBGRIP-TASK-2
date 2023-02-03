
import java.util.Scanner;
public class NumberGuessing{
    public static void guess() {
        Scanner sc = new Scanner(System.in);
        int r=(int)(Math.random()*50)+1;
        System.out.println("*** A Random Number Is Generated Between 1 and 50 ***");
        System.out.println("Enter The Value In How Many Chances You Can Guess That Number :");
        int c = sc.nextInt();
        int points=0;
        int total=0;
        int i;
        for(i=1;i<=c;i++) {
            System.out.println("Your "+i+" Chance, Guess the number : ");
            int g=sc.nextInt();
            if(g>r) {
                System.out.println("Your Guessed Number "+g+" is \'Greater than\' Original Number");
            }
            else if(g<r) {
                System.out.println("Your Guessed Number "+g+" is \'Less than\' Original Number");
            }
            else if(g==r) {
                if(i<=5) {
                    points=10;
               }
               else if(i>=6 && i<=15) {
                    points=5;
               }
               else {
                   points=3;
               }
                total+=points;
                System.out.println("Congartulions !! You Have Guessed the right  number\n Your Score is : "+total);
                break;
            }
        }if(i>=c)
        {
            System.out.println("SORRY!!! You Lost the game,please try again\t");
            System.out.println("SCORE : 0 and the number is : "+ r);
        }

    }
    public static void main(String[] args) {
        System.out.println("Task-2 :Number Guessing Game");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Lets begin the game : Yes/No");
        String s=sc1.nextLine();
        while(s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("y"))
        {
            NumberGuessing.guess();
            System.out.println("Do you want to continue the game Yes/No or Y/N?");
            s=sc1.nextLine();
        }
    }
}