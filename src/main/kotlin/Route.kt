
class Route() {
    var startPoint: String = ""
    var endPoint: String = ""
    var tickets: Int = 0
    var listCities = mutableListOf<String>("Омск", "Москва", "СПб", "Иркутск", "Бийск", "Барнаул", "Новосибирск",
        "Набережные Челны", "Казань", "Калининград", "Великий Новгород", "Пермь", "Архангельск", "Сочи", "Адлер", "Геленджик",
        "Екатеринбург", "Красноярск", "Мурманск")

    fun route () {
        startPoint = listCities.random()
        listCities.remove(startPoint)
        endPoint = listCities.random()
        println("Маршрут: (${startPoint} - ${endPoint})")
    }
    fun Cashier(){
         tickets = (5..201).random()
        println("Продано билетов на данный маршрут - ${tickets}")
    }
}