import kotlin.math.*
fun main(){
    try{
        var a: Double = readLine()!!.toDouble()
        var b: Double = readLine()!!.toDouble()
        var c: Double = readLine()!!.toDouble()

        while (a <= 0.0 || b <= 0.0 || c <= 0.0){
            println("Ни одна сторона не может быть <= 0")
            a = readLine()!!.toDouble()
            b = readLine()!!.toDouble()
            c = readLine()!!.toDouble()
        }

        var p: Double = (a + b + c) / 2
        var h: Double = (2 / a) * (sqrt(p * (p-a) * (p-b) * (p-c)))
        var m: Double = sqrt(2 * b.pow(2) * 2 * c.pow(2) - a.pow(2)) / 2
        var B: Double = (2 * sqrt(b*c*p*(p-a))) / b+c

        println("Высота к стороне а - ${"%.2f.".format(h)}")
        println("Медиана к стороне а - ${"%.2f.".format(m)}")
        println("Биссектриса угл А - ${"%.2f.".format(B)}")
    }
    catch(e:NumberFormatException){
        println("Ошибка")
    }
}