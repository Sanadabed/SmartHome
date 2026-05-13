/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarthome;

/**
 *
 * @author USER
 */
public class AC implements Device {
  private String name;
private boolean isOn;
private int temperature;

public AC(String name) {
    this.name = name;
    this.isOn = false;
    this.temperature = 22;
}

public AC(String name, int temperature) {
    this.name = name;
    this.isOn = false;
    this.temperature = temperature;
}

public void setTemperature(int temp) {
    this.temperature = temp;
    if (isOn) System.out.println("[AC] " + name + " temperature set to " + temp + "C");
}

@Override
public String getName() { 
    return name; 
}

@Override
public void turnOn() {
    isOn = true;
    System.out.println("[AC] " + name + " is ON at " + temperature + "C");
}

@Override
public void turnOff() {
    isOn = false;
    System.out.println("[AC] " + name + " is OFF");
}

@Override
public String getStatus() { 
    return isOn ? "ON (" + temperature + "C)" : "OFF"; 
}

@Override
public void print(String indent) {
    System.out.println(indent + "[AC] " + name + " [" + getStatus() + "]");
}  
}

