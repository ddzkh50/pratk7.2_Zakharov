import kotlin.math.*
fun main(){
    try{
        var x: Double = readLine()!!.toDouble()
        if (x == 0.0) println("х не может быть равне 0")
        else{
            val e = E
            var answ: Double = (sqrt(abs(x)) * ln(x.pow(2))) / (-5 / 4*x + e.pow(x/2))
            println("Ответ: ${"%.5f.".format(answ)}")
        }

    }
    catch(e:NumberFormatException){
        println("Ошибка")
    }
}