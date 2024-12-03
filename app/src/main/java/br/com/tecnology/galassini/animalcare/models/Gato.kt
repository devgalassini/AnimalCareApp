package br.com.tecnology.galassini.animalcare.models

class Gato(nome: String, idade: Int) : Animal(nome, idade, "Doméstico") {
    override fun falar(): String {
        return "Miau!"
    }
}