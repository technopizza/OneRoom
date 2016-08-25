/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneroom;

import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class GuessingGame {
    
    static Scanner scanner = new Scanner(System.in);
    
    void presentOptions(){ //presents player with their options
        System.out.println("1. What is the floorspace of this room?");
        System.out.println("2. Which floor am I on?");
        System.out.println("3. How many windows does this room have?");
        System.out.println("4. How many doors does this room have?");
        System.out.println("5. Make my guess.");
    }
    
    int getUserChoice(Scanner s){ //grabs user's input
        int userChoice;
        boolean loop = true; //used for error-checking loop
        while(loop){
          try{ //error checking to make sure player enters int
             userChoice = s.nextInt();
                       }
          catch(Exception e){
              System.out.println("Please choose a valid option.");
          }
          if(userChoice < 1 || userChoice > 5){
            System.out.println("Please choose a valid option.");
            
        }
          else{
              loop =false;
          }
        }
        return userChoice;
    }
    
    void giveUserClue(int userChoice){ //prints the clue based on the user's choice
        if(userChoice < 1 || userChoice > 5){
            System.out.println("Please choose a valid option.");
            return;
        }
        else{
            
        }
    }
    
    void gameLoop (){ // method to run the actual game part
        System.out.println("You walk into a room. Can you guess where you are?");
        String userChoiceString; //variable to store the raw input of which number the user chose
        while(true){
            presentOptions();
            userChoiceString = getUserChoice(scanner);
            
        }
        
        
    }
}
