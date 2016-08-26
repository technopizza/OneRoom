/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneroom;

/**
 *
 * @author jconklin2391
 */
public class Room {
    //these are the clues which the user can use to aid in their guess
    private String roomName;

    public Room(String roomName, int storyNumber, String stuffInTheRoom, int numberOfWindows, int numberOfDoors) {
        this.roomName = roomName;
        this.storyNumber = storyNumber;
        this.stuffInTheRoom = stuffInTheRoom;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }
    
    private int storyNumber; //which story the room is on
    private String stuffInTheRoom;
    private int numberOfWindows;
    private int numberOfDoors;

    

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

   

    public int getStoryNumber() {
        return storyNumber;
    }

    public void setStoryNumber(int storyNumber) {
        this.storyNumber = storyNumber;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public String getStuffInTheRoom() {
        return stuffInTheRoom;
    }

    public void setStuffInTheRoom(String stuffInTheRoom) {
        this.stuffInTheRoom = stuffInTheRoom;
    }
    
}
