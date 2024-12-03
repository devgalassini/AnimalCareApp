package br.com.tecnology.galassini.animalcare.repository

import br.com.tecnology.galassini.animalcare.models.Animal


object AnimalRepository {
    private val animals = mutableListOf<Animal>()

    fun addAnimal(animal: Animal) {
        animals.add(animal)
    }

    fun getAnimals(): List<Animal> {
        return animals
    }

    fun getAnimal(index: Int): Animal? {
        return if (index in animals.indices) animals[index] else null
    }
}