import java.util.*;
class game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=7;
        int guess=0;
        int count=0;
        System.out.println("Guess the number between 1 and 10:");
        while(guess!=number){
            System.out.println("Enter your guess:");
            count++;
            guess=sc.nextInt();
            if(guess>number){
                System.out.println("your guess is too high try again");
            }
            else if(guess<number){
                System.out.println("your guess is too low try again");
            }
            else{
                System.out.println("You Guess the number: " + number);
            }

        }
        System.out.println("Enter total attempts:"+count);
    }
    
}