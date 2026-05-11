/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smarthome;
import java.util.ArrayList;
public class Room implements Device {
   private String name;
   private ArrayList<Device> devices;
   public Room(String name) {
       this.name = name;
       devices = new ArrayList<>();
   }
   public void addDevice(Device device) {
       devices.add(device);
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public void turnOn() {
       System.out.println("Turning ON room: " + name);
       for (Device d : devices) {
           d.turnOn();
       }
   }
   @Override
   public void turnOff() {
       System.out.println("Turning OFF room: " + name);
       for (Device d : devices) {
           d.turnOff();
       }
   }
   @Override
   public String getStatus() {
       return "Room contains " + devices.size() + " devices";
   }
   @Override
   public void print(String indent) {
       System.out.println(indent + "Room: " + name);
       for (Device d : devices) {
           d.print(indent + "   ");
       }
   }
}