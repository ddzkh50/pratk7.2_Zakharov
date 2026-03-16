package poezd

open class Train (
    var number: Int,
    var start: String,
    var end: String,
    var price: Double
        ){
    open fun ShowInfo(){
        println("Поезд №$number: из $start идет в $end; цена - $price")
    }
}
class ExpressTrain(
    number: Int,
    start: String,
    end: String,
    price: Double,
    var speed: Int
) : Train(number,start,end,price) {
    override fun ShowInfo() {
        println("Эксперсс поезд №$number: из $start идет в $end; цена - $price")
    }
}
