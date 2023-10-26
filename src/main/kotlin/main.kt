fun main() {
    val likes = 611
val op = 100
    when  {
        likes % 10 == 1 && likes % 100 != 11 -> println("Понравилось $likes человеку")
        likes % 100 == 11 -> println("Понравилось $likes людям")

        else -> println ("Понравилось $likes людям")
    }


}
