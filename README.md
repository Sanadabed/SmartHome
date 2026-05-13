# Smart Home System – Composite Pattern

## Project Idea
A smart home control system that allows users to control individual devices (light, AC, TV, door) or entire rooms with a single command. The system uses the **Composite Pattern** to treat devices and groups uniformly.

## Features
- Control single device (light, AC, TV, door)
- Control entire room (all devices in a room)
- Display hierarchical structure (rooms and their devices)
- Easy to add new devices or new rooms
- Each device shows its status (ON/OFF/OPEN/CLOSED)

## Design Pattern Used
**Composite Pattern** – Treats individual devices (Leaf) and rooms (Composite) the same way through the Device interface.

## How to Run

### Prerequisites
- Java JDK 17 or higher

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/Sanadabed/SmartHome.git
cd SmartHome

# 2. Compile the code
javac src/smarthome/*.java

# 3. Run the program
java -cp src smarthome.SmartHomeApp
============================================================
   SMART HOME SYSTEM - Composite Pattern                    
============================================================

=== Home Structure ===
Room: First Floor
   Room: Living Room
      [LIGHT] Living Room Light [OFF]
      [AC] Living Room AC [OFF]
      [TV] Living Room TV [OFF]
   Room: Bedroom
      [LIGHT] Bedroom Light [OFF]
      [AC] Bedroom AC [OFF]
   Door: Main Door [CLOSED]

=== Testing Individual Device ===
[LIGHT] Living Room Light is ON (Brightness: 80%)

=== Testing Room (Composite) ===
Turning ON all devices in Bedroom...
[LIGHT] Bedroom Light is ON
[AC] Bedroom AC is ON

=== Testing Floor ===
Turning ON all devices in First Floor...
[LIGHT] Living Room Light is ON
[AC] Living Room AC is ON
[TV] Living Room TV is ON
[LIGHT] Bedroom Light is ON
[AC] Bedroom AC is ON
Door Main Door is OPEN

✅ Smart Home System running successfully!
