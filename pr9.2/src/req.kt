package poezd

open class Req(
    var punkt: String,
    var date: String,
    var time: String
) {
    open fun ShowReq(){
        println("Заявка: пункт назначения $punkt, дата: $date, время: $time")
    }
}

class PassReq(
    punkt: String,
    date: String,
    time: String,
    var name: String
) :Req(punkt,date,time){
    override fun ShowReq(){
        println("Заявка: Пассажир: $name,пункт назначения $punkt, дата: $date, время: $time")
    }
}
