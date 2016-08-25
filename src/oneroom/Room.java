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
    private int roomName;
    private int floorArea; //floorspace
    private int storyNumber; //which story the room is on
    private int numberOfWindows;
    private int numberOfDoors;

    public Room(int floorArea, int storyNumber, int numberOfWindows, int numberOfDoors) {
        this.floorArea = floorArea;
        this.storyNumber = storyNumber;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getRoomName() {
        return roomName;
    }

    public void setRoomName(int roomName) {
        this.roomName = roomName;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(int floorArea) {
        this.floorArea = floorArea;
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
    
}
