class Route() {

    var listCities = mutableListOf<String>("Омск", "Москва", "СПб", "Иркутск", "Бийск", "Барнаул", "Новосибирск",
        "Набережные Челны", "Казань", "Калининград", "Великий Новгород", "Пермь", "Архангельская", "Сочи", "Адлер", "Геленджик",
        "Екатеринбург", "Красноярск", "Мурманск")

    fun route () {
        var start = listCities.random()
        listCities.remove(start)
        var end = listCities.random()
        println("Маршрут ${start} - ${end}")
    }
}