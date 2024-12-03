package br.com.tecnology.galassini.animalcare.models

// Classes concretas
class Cachorro(nome: String, idade: Int) : Animal(nome, idade, "Doméstico") {
    override fun falar(): String {
        return "Au Au!"
    }
}