import processing.core.PApplet

fun main() {
    PApplet.main("UsingProcessing2")
}

class UsingProcessing2 : PApplet() {
    var circleX:Float = 0f
    var circleY:Float = 0f

    // identical use to draw in Prcessing IDE
    override fun draw() {
        circleX = random(width.toFloat())
        circleY = random(height.toFloat())

        background(50) // repaint the background every time
        ellipse(circleX, circleY, 24f, 24f)

        circleX += 1
     //   println(displayWidth)

    }

    // method for setting the size of the window
    override fun settings() {
        size(640, 360)


    }

    // identical use to setup in Processing IDE except for size()
    override fun setup() {

    }

}