import kotlin.math.sqrt

fun main(){
    try{
        var k: Double = readLine()!!.toDouble()
        var a: Double = readLine()!!.toDouble()
        var b: Double = readLine()!!.toDouble()
        var x1: Double = 0.0
        var x2: Double = 0.0
        var x: Double = 0.0
        var d = a * a - 4 * b
        if(d > 0){
            x1 = (-a + sqrt(d)) / 2
            x2 = (-a - sqrt(d)) / 2
        }
        else if (d == 0.0){
            x = -a / 2
        } else println("Уравнение не имеет действительных корней")
        when{
            x1 in -k..k && x2 in -k..k -> println("Корни попадают в интервал")
            x in -k..k -> println("Корень попадают в интервал")
            else -> println("Корни не попадают в интервал")
        }
    }catch(e:NumberFormatException) { println("Ошибка") }
}