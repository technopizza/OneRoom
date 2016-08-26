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
    
    Room classroom = new Room("classroom", 1, "desks", 2, 1);
    Room hotelRoom = new Room("hotel room", 8, "beds", 1, 1);
    Room kitchen = new Room("kitchen", 1, "appliances", 2, 0);
    Room gym = new Room("gym", 1, "weights", 0, 2);

      
    
    void presentOptions() { //presents player with their options
        System.out.println("1. Which floor am I on?");
        System.out.println("2. How many windows does this room have?");
        System.out.println("3. How many doors does this room have?");
        System.out.println("4. What is in this room?");
        System.out.println("5. Make my guess.");
    }

    String getUserChoice(Scanner s) { //grabs user's input
        String userChoice;
        
        userChoice = s.next();

        return userChoice;
    }

    void makeGuess() {
        String userChoice = getUserChoice(scanner);
        
    }

    void giveFeedback(int userChoice, Room room) { //prints the clue/tells the user if they guessed correctly based on the user's choice
        //matching up each response with its number option
        
        if (userChoice == 1) {
            System.out.println("This room is on floor " + room.getStoryNumber() + ".");
        } else if (userChoice == 2) {
            System.out.println("This room has " + room.getNumberOfWindows() + " window(s).");
        } else if (userChoice == 3) {
            System.out.println("This room has " + room.getNumberOfDoors() + " door(s).");
        }
        else if (userChoice == 4) {
            System.out.println("This room has " + room.getStuffInTheRoom() + " in it.");
        }

    }

    void gameLoop() { // method to run the actual game part
        System.out.println("You walk into a room. Can you guess where you are?");
        String userChoiceString; //variable to store the raw input of which number the user chose
        int userChoiceInt; //variable to store which number the user chose
        while (true) {
            presentOptions();
            userChoiceString = getUserChoice(scanner);
            
            if (userChoiceInt < 1 || userChoiceInt > 5) {
              System.out.println("Please choose a valid option.");
            } else if (userChoiceInt == 5){

            }
            else{
                
            }

        }
    }
}
