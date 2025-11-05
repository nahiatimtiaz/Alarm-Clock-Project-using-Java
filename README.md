🕒 Java Alarm Clock

A simple console-based **Alarm Clock** built in Java using IntelliJ IDEA.  
The program lets the user set a custom alarm time, displays a live countdown, and plays a sound when the alarm goes off.


🚀 Features

- Allows user to **input a time** in 24-hour format (HH:MM).  
- Continuously shows the **remaining time** until the alarm.  
- Plays an **alarm sound** when the target time is reached.  
- The sound **continues to play** until the user presses **Enter** to stop it.  
- Includes a custom **UserException** class for handling invalid input.



🧩 Files

| File | Description |
|------|--------------|
| `Main.java` | Contains the main logic for setting and running the alarm clock. |
| `UserException.java` | Custom exception class used for handling user input errors. |

 💻 How It Works

1. The program asks the user to enter an alarm time (24-hour format).  
2. It validates the input — if invalid, it throws a `UserException`.  
3. Once a valid time is entered, the program shows a **real-time countdown** updating every second.  
4. When the system time matches the alarm time, a **sound starts playing**.  
5. The sound continues until the user presses **Enter** to stop it.


## 🧠 Concepts Used

- Exception Handling  
- Loops and Conditionals  
- Time and Date manipulation (`LocalTime` class)  
- Thread Sleep for timing updates  
- Sound playback in Java (`Clip` or `AudioSystem`)


## ⚙️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/Alarm-Clock-Java.git
````

2. Open it in **IntelliJ IDEA** or any Java IDE.
3. Run `Main.java`.
4. Enter your desired alarm time and watch the countdown begin!

---

## 🖋️ Author

**Nahiat Imtiaz Nabiha**
A beginner Java learner exploring hands-on projects to strengthen programming concepts 💫


## 🧰 Future Improvements

* Add a GUI version using JavaFX.
* Allow multiple alarms.
* Add an option to choose a custom alarm sound.

## 🙏 Acknowledgment
This project was inspired by a tutorial from Bro Code on YouTube
I followed his guide to build the core logic, and added my own feature where the alarm sound keeps repeating until the user presses Enter.

⭐ If you like this project, don’t forget to give it a **star** on GitHub!

