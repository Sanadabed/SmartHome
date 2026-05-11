/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smarthome;

public interface Device {
 String getName();
    void turnOn();
    void turnOff();
    String getStatus();
    void print(String indent);   
}
