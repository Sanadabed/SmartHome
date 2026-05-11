/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarthome;

/**
 *
 * @author USER
 */

public class Door implements Device {
   private String name;
   private boolean isOpen;
   public Door(String name) {
       this.name = name;
       this.isOpen = false;
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public void turnOn() {
       isOpen = true;
       System.out.println("Door " + name + " is OPEN");
   }
   @Override
   public void turnOff() {
       isOpen = false;
       System.out.println("Door " + name + " is CLOSED");
   }
   @Override
   public String getStatus() {
       if (isOpen) {
           return "OPEN";
       } else {
           return "CLOSED";
       }
   }
   @Override
   public void print(String indent) {
       System.out.println(indent + "Door: " + name + " [" + getStatus() + "]");
   }
}
