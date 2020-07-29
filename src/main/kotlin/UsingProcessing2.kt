import processing.core.PApplet

fun main() {
    PApplet.main("UsingProcessing2")
}

class UsingProcessing2 : PApplet() {
    var circleX:Float = 50.0f

    // method for setting the size of the window
    override fun settings() {
        size(640, 360)
    }

    // identical use to setup in Processing IDE except for size()
    override fun setup() {

    }

    // identical use to draw in Prcessing IDE
    override fun draw() {
        background(50) // repaint the background every time
        ellipse(circleX, 180f, 24f, 24f)

        circleX += 1

    }


}