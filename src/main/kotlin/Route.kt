
class Route(var startPoint: String, var endPoint: String, var tickets: Int) {

    var listCities = mutableListOf<String>("Омск", "Москва", "СПб", "Иркутск", "Бийск", "Барнаул", "Новосибирск",
        "Набережные Челны", "Казань", "Калининград", "Великий Новгород", "Пермь", "Архангельская", "Сочи", "Адлер", "Геленджик",
        "Екатеринбург", "Красноярск", "Мурманск")

    fun route () {
        var start = listCities.random()
        listCities.remove(start)
        var end = listCities.random()
        println("Маршрут: (${start} - ${end})")
    }
    fun Cashier(){
        val tickets = (5..201).random()
        println("Продано билетов на данный маршрут - ${tickets}")
    }
}