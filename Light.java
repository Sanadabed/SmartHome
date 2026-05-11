/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarthome;

/**
 *
 * @author USER
 */
public class Light implements Device {

     private String name;
    private boolean isOn;
    private int brightness;
    
    public Light(String name) {
        this.name = name;
        this.isOn = false;
        this.brightness = 100;
    }
    
    public Light(String name, int brightness) {
        this.name = name;
        this.isOn = false;
        this.brightness = brightness;
    }
    
    @Override
    public String getName() { return name; }
    
    @Override
    public void turnOn() {
        isOn = true;
    System.out.println("[LIGHT] " + name + " is ON (Brightness: " + brightness + "%)");
    }
    
    @Override
    public void turnOff() {
        isOn = false;
    System.out.println("[LIGHT] " + name + " is OFF");
    }
    
    @Override
    public String getStatus() { return isOn ? "ON" : "OFF"; }
    
    @Override
    public void print(String indent) {
        System.out.println(indent + "[LIGHT] " + name + " [" + getStatus() + "]");
    }
}
