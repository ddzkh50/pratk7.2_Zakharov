fun main(){
    try{
        var a: Double = readLine()!!.toDouble()
        var b: Double = readLine()!!.toDouble()
        var c: Double = readLine()!!.toDouble()
        while (a == 0.0 || b == 0.0 || c == 0.0){
            println("Числа не могут быть = 0")
            var a: Double = readLine()!!.toDouble()
            var b: Double = readLine()!!.toDouble()
            var c: Double = readLine()!!.toDouble()
        }
        if (a + b > c || a + c > b || b + c > a){
            var p = (a + b + c) / 2
            var s = Math.sqrt(p * (p - a) * (p - b) * (p - c))
            var P = a + b + c
            println("S - $s, P - $P")
        } else println("Отрезки не могут быть сторонами треугольника")
    }catch(e:NumberFormatException) { println("Ошибка") }
}