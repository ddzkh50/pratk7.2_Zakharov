
fun main(){
    try {
        var a: Double = readLine()!!.toDouble()
        var b: Double = readLine()!!.toDouble()
        var c: Double = readLine()!!.toDouble()

        if (a >= b && b >= c){
            a *= 2
            b += 2
            c *= 2
        }
        else {
            a = Math.abs(a)
            b = Math.abs(b)
            c = Math.abs(c)
        }
        println("A - $a, B - $b, C - $c")
    }catch(e:NumberFormatException){
        println("Ошибка")
    }
    }
