/*
    Task 1: Design a class when JUnit tests are available.
    Your task is to design the actual class Pen.
    Here is a skeleton for the Pen class:

    public class Pen {
        public enum Color {
            RED("red"), GREEN("green"), BLUE("blue");
            private final String color;
            Color(String color) { this.color = color; };
            @Override public String toString() { return color; }
        }

        // your code here
    }
*/

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    // your code here
    private Color currentColor;
    private boolean capOn;

    public Pen() {
        this(Color.RED); // default color is red
    }

    public Pen(Color color) {
        this.currentColor = color;
        this.capOn = true; // cap is on by default
    }

    public void capOff() {
        this.capOn = false;
    }

    public void capOn() {
        this.capOn = true;
    }

    public void changeColor(Color newColor) {
        if (this.capOn) {
            this.currentColor = newColor;
        }
    }

    public String draw() {
        if (this.capOn) {
            return "";
        } else {
            return "Drawing " + this.currentColor.toString();
        }
    }
}
