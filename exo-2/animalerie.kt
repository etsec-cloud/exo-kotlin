class Animalerie{
    var allAnimals = mutableListOf<Animal>()

    fun add(isWhat: Animal){
        allAnimals.add(isWhat)
    }

    fun affiche(){
        for (moyen in allAnimals) {
            moyen.quiSuisJe()
            moyen.parler()
            // println(i)
        }
    }
