import processing.core.PApplet;

public class UsingProcessing extends PApplet {

    // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
    }

    // method for setting the size of the window
    public void settings(){
        size(640, 360);
    }

    // identical use to setup in Processing IDE except for size()
    public void setup(){

    }

    // identical use to draw in Prcessing IDE
    public void draw(){

        line(100, 50, 600, 250);
        rect(225, 225, 50, 50);
        ellipse(mouseX, mouseY, 25, 25);
    }
}