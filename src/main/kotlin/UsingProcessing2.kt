import processing.core.PApplet

fun main() {
    PApplet.main("UsingProcessing2")
}

class UsingProcessing2 : PApplet() {
    var circleX:Float = 0f
    var circleY:Float = 0f
    var bounce:Boolean = false

    // identical use to draw in Prcessing IDE
    override fun draw() {


        background(50) // repaint the background every time
        ellipse(circleX, circleY, 24f, 24f)

        if ( (circleX > width) && !bounce) {
            bounce = true
        }else if ( ( 0 > circleX ) && bounce) {
            bounce = false
        }

        //   println(displayWidth)
        if (bounce) {
            circleX += -10

        } else {
            circleX += 10
        }


    }

    // method for setting the size of the window
    override fun settings() {
        size(640, 360)
        circleX = 300f//random(width.toFloat())
        circleY = random(height.toFloat())

    }

    // identical use to setup in Processing IDE except for size()
    override fun setup() {

    }

}