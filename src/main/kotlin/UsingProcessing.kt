import processing.core.PApplet

fun main() {
    PApplet.main("UsingProcessing")
}

class UsingProcessing : PApplet() {
    var circleX:Float = 0f
    var circleY:Float = 0f
    var direccionX:Int=1
    var direccionY:Int=1
    val speed:Int= 5
    val ballSize=30f
    var mousePress: Boolean=true


    override fun draw() {

        if (mousePress) {
            background(50) // repaint the background every time
        }

        ellipse(circleX, circleY, ballSize, ballSize)

        direccionX = limitbox(circleX, width, direccionX)

        direccionY = limitbox(circleY, height, direccionY)

        circleX += speed * direccionX

        circleY += speed * direccionY

    }

    override fun mousePressed() {
        if (mousePress) {
            mousePress = !mousePress
        } else {
            mousePress = !mousePress
        }
    }

    private fun limitbox(coordX:Float, limite:Int, direction:Int): Int {
        if ((coordX > limite) && direction == 1) {
            return direction * -1
        } else if ((0 > coordX) && direction == -1) {
            return direction * -1
        }
        return direction
    }

    // method for setting the size of the window
    override fun settings() {
        size(640, 360)
      //  size(200, 300)
        circleX = random(width.toFloat())
        circleY = random(height.toFloat())

    }

    // identical use to setup in Processing IDE except for size()
    override fun setup() {
        background(50)
    }

}