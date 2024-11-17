fun main() {
 println("Этап 1 - Направление поезда")
 val r1 = Route("", "", 0)
 r1.route()
 println()

 println("Этап 2 - Продажа билетов")
 r1.Cashier()
 println()

// println("Этап 3 - Собрать состав")
// val train = Train()
// var count = 0
// var ostatok = r1.tickets
// while (ostatok != 0) {
//  train.createWagon()
//  println("Вагон №${count} вместимостью ${train.seats}")
//
//    count++
// }
}
