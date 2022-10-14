import kotlin.math.pow

open class Point (_CoordX:Double, _CoordY:Double){
    var X:Double
    var Y:Double
    init{
        X = _CoordX
        Y = _CoordY
    }
    open fun Print(){
        println("Координаты точки: \n" +
                "X = $X\n" +
                "Y = $Y")
    }
}

class  Colored_Point (_CoordX: Double, _CoordY: Double, _color: String) :Point (_CoordX,_CoordY){
    var color: String
    init {
        color = _color
    }

    override fun Print() {
        super.Print()
        println ("Цвет точки = $color")
    }
}

class Line(_PointOne:Point, _PointTwo: Point ){
    var pointOne:Point
    var pointTwo:Point
    val length :Double
    init {
        pointOne = _PointOne
        pointTwo = _PointTwo
        length = (Math.sqrt((pointTwo.X + pointOne.Y).pow(2) + (pointTwo.Y + pointOne.X).pow(2)))
    }
    open fun PrintInfo (){
        println("Первая точка\n ${pointOne.Print()} ")
        println("Вторая точка\n ${pointTwo.Print()}")
        println("Длина отрезка = $length")
    }

}

fun main(args: Array<String>) {

    var Point1: Point = Point(_CoordX = 7.0, _CoordY = 9.0)
    Point1.Print()

    var ColorPont:Colored_Point = Colored_Point(_CoordX = 4.0, _CoordY = 6.0, _color = "Черный")
    ColorPont.Print()

    var Line1:Line = Line(Point(_CoordX = 12.0, _CoordY = 3.0), Point(_CoordX = 8.0, _CoordY = 6.0 ))
    Line1.PrintInfo()
}