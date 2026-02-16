fun main(){
    try {
        var x1: Double = readLine()!!.toDouble()
        var y1: Double = readLine()!!.toDouble()
        var x2: Double = readLine()!!.toDouble()
        var y2: Double = readLine()!!.toDouble()
        var R: Double = readLine()!!.toDouble()
        var P: Double = readLine()!!.toDouble()
        while (R <= 0 || P <= 0){
            println("R и P не могут быть <= 0")
            R = readLine()!!.toDouble()
            P = readLine()!!.toDouble()
        }

        if((x1 - P) * (x1 - P) + y1*y1 <= R*R && y1 >= 0 &&
            (x2 - P) * (x2 - P) + y2*y2 <= R*R && y2 >= 0){
            println("обе точки внутри полукруга")
        } else println("Не обе точки внутри полукруга")
    }catch(e:NumberFormatException) { println("Ошибка") }
}