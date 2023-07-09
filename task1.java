/**
 * hello
 */

import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        // stores actual and guess number
        int ans, guess;
  
          // maximum value is 100
        final int MAX = 100;
  
        // takes input using scanner
        Scanner in = new Scanner(System.in);
  
        // Random instance
        Random rand = new Random();
  
        
  
        // correct answer
        ans = rand.nextInt(MAX) + 1;

       final int turn =6;
       int i;
       int choice=1;
       int round=1;

       do
       {
  
        System.out.println("you have 6 turns to guess the correct number.");
        // loop until the guess is correct
         for( i=0;i<turn;i++){

           
            System.out.println(
                "Guess a number between 1 and 100: ");
  
            // guess value
            guess = in.nextInt();
  
            // if guess is greater than actual
            if (guess > ans) {
                System.out.println("Too high, try again");
            }
  
            // if guess is less than actual
            else if (guess < ans) {
                System.out.println("Too low, try again");
            }
  
            // guess is equal to actual value
            else {
  
                System.out.println(
                    "Yes, you guessed the number.");
  
                break;
            }
        }
        if(i>5)
        {
            System.out.println("you ran out of turns");
            System.out.println("do you want to play again??");
            System.out.println("enter 1 to play again or enter 0 to exit the game.");
            Scanner o = new Scanner(System.in);
            choice = o.nextInt();
            round++;
        }
        else{
            choice=0;
        }  

    }while(choice!=0);

    if(round==1)
    {
        if(i==0)
        {
            System.out.println("your score is 100");

        }

        if(i==1)
        {
            System.out.println(" your score is 90");
            
        }

        if(i==2)
        {
            System.out.println(" your score is 80");
            
        }

        if(i==3)
        {
            System.out.println(" your score is 70");
            
        }
        if(i==4)
        {
            System.out.println(" your score is 60");
            
        }
        if(i==5)
        {
            System.out.println(" your score is 50");
            
        }

    }

    else if(round==2)
    {
        if(i==0)
        {
            System.out.println("your score is 90");

        }

        if(i==1)
        {
            System.out.println(" your score is 80");
            
        }

        if(i==2)
        {
            System.out.println(" your score is 70");
            
        }

        if(i==3)
        {
            System.out.println(" your score is 60");
            
        }
        if(i==4)
        {
            System.out.println(" your score is 50");
            
        }
        if(i==5)
        {
            System.out.println(" your score is 40");
            
        }

    }
    else if(round>2){
        System.out.println("your score is 30");
    }

        System.exit(0);
    }
}