package br.com.tecnology.galassini.animalcare.models

class Golfinho(nome: String, idade: Int) : Animal(nome, idade, "Marinho") {
    override fun falar(): String {
        return "Cli Cli Cli!"
    }
}