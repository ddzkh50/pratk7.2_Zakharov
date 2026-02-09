import kotlin.math.pow
fun main(){
    try{
        println("Введите число")
        var x: Double = readLine()!!.toDouble()
        println("Введите знаминатель")
        var l: Double = readLine()!!.toDouble()
        println("Введите первый номер")
        var k: Int = readLine()!!.toInt()
        println("Введите второй номер")
        var p: Int = readLine()!!.toInt()
        while (k < 1 || p < 2 || k >= p){
            if (k >= p){
                println("Первый номер должен быть меньше второго")
                k = readLine()!!.toInt()
                p = readLine()!!.toInt()
            }
            if (k < 1 || p < 2){
                println("Номера не могут быть отрицательными или равны 0")
                k = readLine()!!.toInt()
                p = readLine()!!.toInt()
            }
        }
        var sum: Double = 0.0
        sum += x * l.pow(k)
        sum += x * l.pow(p)
        println("$k номер + $p номер = $sum")
    }
    catch(e:NumberFormatException){
        println("Ошибка")
    }
}