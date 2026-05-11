/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarthome;
public class TV implements Device {
   private String name;
   private boolean isOn;
   private int channel;
   public TV(String name) {
       this.name = name;
       this.isOn = false;
       this.channel = 1;
   }
   @Override
   public String getName() {
       return name;
   }
   @Override
   public void turnOn() {
       isOn = true;
       System.out.println("TV " + name + " is ON");
   }
   @Override
   public void turnOff() {
       isOn = false;
       System.out.println("TV " + name + " is OFF");
   }
   @Override
   public String getStatus() {
       if (isOn) {
           return "ON";
       } else {
           return "OFF";
       }
   }
   @Override
   public void print(String indent) {
       System.out.println(indent + "TV: " + name + " [" + getStatus() + "]");
   }
}
