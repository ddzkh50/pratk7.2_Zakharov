fun main(){
    try {
        var k: Int = readLine()!!.toInt()
        var l: Int = readLine()!!.toInt()
        var n: Int = readLine()!!.toInt()
        var m: Int = readLine()!!.toInt()

        if (l % k == 0 && n % k == 0 && m % k == 0){
            println("K - делитель всех чисел")
        } else println("К - не делитель всех чисел")
    }catch(e:NumberFormatException){
        println("Ошибка")
}}