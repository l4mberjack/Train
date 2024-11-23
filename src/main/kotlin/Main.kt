fun main() {
    var start = true
    while(start) {
        start = false
        println("Этап 1 - Направление поезда")
        val r1 = Route()
        r1.route()
        println()

        println("Этап 2 - Продажа билетов")
        r1.Cashier()
        println()

        println("Этап 3 - Собрать состав")
        val train = Train()
        var count = 0
        var ostatok = r1.tickets

        while (ostatok > 0) {
            train.createWagon()
            println("Вагон №${count + 1} вместимостью ${train.seats} прицеплен")
            ostatok -= train.seats
            count++
        }
        println()
        println("Этап 4 - Отправить поезд")
        println("Поезд ${r1.startPoint} - ${r1.endPoint}, состоящий из ${count} вагонов отправлен")

        println()
        println("Хотите продолжить?\n EXIT - выйти из программы \n Иначе - отправить поезд")
        var choose = readln().toString().trim()
        if (choose != "EXIT")
            start = true
        else
            return
    }
}

