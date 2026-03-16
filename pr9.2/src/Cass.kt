import poezd.PassReq as R
import poezd.ExpressTrain as T

fun main(){
    try {
        println("Введите номер поезда:")
        val number = readLine()!!.toInt()

        println("Введите начальную станцию:")
        val start = readLine()!!.toString()

        println("Введите конечную:")
        val end = readLine()!!.toString()

        println("Введите цену:")
        val price = readLine()!!.toDouble()

        println("Введите скорость:")
        val speed = readLine()!!.toInt()

        val train = T(number, start, end, price, speed)

        println("\nВведите пункт назначению")
        var punkt = readLine()!!.toString()

        println("\nВведите дату")
        var date = readLine()!!.toString()

        println("\nВведите время")
        var time = readLine()!!.toString()

        println("\nВведите имя пассажира")
        var name = readLine()!!.toString()

        val request = R(punkt, date, time, name)

        println("Заявка пассажира:")
        request.ShowReq()

        println("Информация о поезде:")
        train.ShowInfo()

        if (punkt == train.end){
            println("\nПоезд найден")
            println("К оплате: ${train.price}")
        } else {
            println("\nНа этой станции нет поезда")
        }
    }
    catch (e: Exception){}

}