import processing.core.PApplet

fun main() {
    PApplet.main("UsingProcessing2")
}

class UsingProcessing2 : PApplet() {
    var circleX:Float = 0f
    var circleY:Float = 0f

    // identical use to draw in Prcessing IDE
    override fun draw() {
        background(50) // repaint the background every time
        ellipse(circleX, 180f, 24f, 24f)

        circleX += 1
     //   println(displayWidth)

    }

    // method for setting the size of the window
    override fun settings() {
        size(640, 360)
        circleX = width.toFloat() / 2// With need to be AFTER size() to work, W/2 center of screen
        println(circleX)
    }

    // identical use to setup in Processing IDE except for size()
    override fun setup() {

    }

}