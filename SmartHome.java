/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;

/**
 *
 * @author USER
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room livingRoom = new Room("Living Room");
TV tv = new TV("Samsung");
Door door = new Door("Main Door");
Light light = new Light("Main Light");
AC ac = new AC("LG AC");
livingRoom.addDevice(tv);
livingRoom.addDevice(door);
livingRoom.addDevice(light);
livingRoom.addDevice(ac);
livingRoom.turnOn();
livingRoom.print("");
    }
    
}
