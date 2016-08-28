/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneroom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class GuessingGame {
    //declaration of global variables.
    Scanner scanner;
    Random random = new Random();
    Room classroom; 
    Room hotelRoom; 
    Room kitchen;
    Room gym; 

    public GuessingGame() {
        
         scanner = new Scanner(System.in);
     random = new Random();
     //initialization of each room. Need to research if there is a more elegant way to procedurally create rooms
     // as opposed to what I am doing here, which is just manually creating a few
     classroom = new Room("classroom", 1, "desks", 2, 1);
     hotelRoom = new Room("hotel", 8, "beds", 1, 1);
     kitchen = new Room("kitchen", 1, "appliances", 2, 0);
     gym = new Room("gym", 1, "weights", 0, 2);
        
    }

    
    
    void presentOptions() { //presents player with their options
        System.out.println("1. Which floor am I on?");
        System.out.println("2. How many windows does this room have?");
        System.out.println("3. How many doors does this room have?");
        System.out.println("4. What is in this room?");
        System.out.println("5. Make my guess.");
    }

    int getUserChoice(Scanner s) { //grabs user's input
        int userChoice;

        userChoice = s.nextInt();

        return userChoice;
    }

    boolean makeGuess(Room room, Scanner s) { //method that facilitates user making their guess of which room theyre in
        String userChoice;
        userChoice = s.next();
        if (userChoice.trim().toLowerCase().equals(room.getRoomName())) {//if player's guess matches the room name, returns true
            return true;
        } else {
            return false;
        }
    }

    void giveFeedback(int userChoice, Room room) { //prints the clue/tells the user if they guessed correctly based on the user's choice
        //matching up each response with its number option

        if (userChoice == 1) {
            System.out.println("This room is on floor " + room.getStoryNumber() + ".");
        } else if (userChoice == 2) {
            System.out.println("This room has " + room.getNumberOfWindows() + " window(s).");
        } else if (userChoice == 3) {
            System.out.println("This room has " + room.getNumberOfDoors() + " door(s).");
        } else if (userChoice == 4) {
            System.out.println("This room has " + room.getStuffInTheRoom() + " in it.");
        }

    }

    void runGame() { // method to run the actual game
        Room[] roomOptions = new Room[4]; //set up the possible guess options - probably need a more elegant way to do this 
        roomOptions[0] = classroom;
        roomOptions[1] = hotelRoom;
        roomOptions[2] = kitchen;
        roomOptions[3] = gym;
        Room correctRoom = roomOptions[random.nextInt(roomOptions.length - 1)]; //the correct answer, randomly chosen
        System.out.println("You walk into a room. Can you guess where you are?");

        int userChoiceInt; //variable to store which number the user chose
        while (true) { //choice loop, allows player to keep guessing/get clues
            presentOptions(); //displays the players options for thier next command
            userChoiceInt = getUserChoice(scanner); // grab input

            if (userChoiceInt < 1 || userChoiceInt > 5) { //error handling
                System.out.println("Please choose a valid option.");
            } else if (userChoiceInt == 5) { //check and see if the user is ready to make their guess
                boolean guessedCorrectly = makeGuess(correctRoom, scanner);
                if(guessedCorrectly){
                    System.out.println("You guessed correctly. You win!");
                    return; //end the game if player has won
                }
                else{
                    System.out.println("You guessed incorrectly. Try again.");
                }
            } else {
                giveFeedback(userChoiceInt, correctRoom); //displays the clue
            }

        }
    }
}
