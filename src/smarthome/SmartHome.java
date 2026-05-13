/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;

import java.util.Scanner;

public class SmartHome {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        Device light1 = new Light("Living Room Light", 80);

        Device light2 = new Light("Bedroom Light", 50);

        Device ac = new AC("Master AC", 22);

        Device tv = new TV("Samsung UHD TV");

        Device door = new Door("Main Entrance");

        Room livingRoom = new Room("Living Room");

        Room bedRoom = new Room("Master Bedroom");

        Room wholeHouse = new Room("Smart Mansion");

        livingRoom.addDevice(light1);

        livingRoom.addDevice(tv);

        bedRoom.addDevice(light2);

        bedRoom.addDevice(ac);

        wholeHouse.addDevice(livingRoom);

        wholeHouse.addDevice(bedRoom);

        wholeHouse.addDevice(door);

        System.out.println("=== Smart Home System ===");

        wholeHouse.print("");

        while (true) {

            System.out.println("\n--- Control Menu ---");

            System.out.println("1. Turn ON whole house");

            System.out.println("2. Turn OFF whole house");

            System.out.println("3. Turn ON Living Room");

            System.out.println("4. Turn OFF Living Room");

            System.out.println("5. Turn ON Bedroom");

            System.out.println("6. Turn OFF Bedroom");

            System.out.println("7. Open/Close Main Door");

            System.out.println("8. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    wholeHouse.turnOn();

                    break;

                case 2:

                    wholeHouse.turnOff();

                    break;

                case 3:

                    livingRoom.turnOn();

                    break;

                case 4:

                    livingRoom.turnOff();

                    break;

                case 5:

                    bedRoom.turnOn();

                    break;

                case 6:

                    bedRoom.turnOff();

                    break;

                case 7:

                    door.turnOn();

                    break;

                case 8:

                    System.out.println("Exiting... Goodbye!");

                    scanner.close();

                    return;

                default:

                    System.out.println("Invalid option.");

            }

        }

    }

}
    
    

