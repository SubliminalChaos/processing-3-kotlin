import processing.core.PApplet

fun main() {
    PApplet.main("UsingProcessing2")
}

class UsingProcessing2 : PApplet() {
    // method for setting the size of the window
    override fun settings() {
        size(640, 360)
    }

    // identical use to setup in Processing IDE except for size()
    override fun setup() {}

    // identical use to draw in Prcessing IDE
    override fun draw() {
        line(100f, 50f, 600f, 250f)
        rect(225f, 225f, 50f, 50f)
        ellipse(mouseX.toFloat(), mouseY.toFloat(), 25f, 25f)
    }


}