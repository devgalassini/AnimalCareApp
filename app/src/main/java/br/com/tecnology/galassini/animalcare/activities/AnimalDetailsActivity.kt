package br.com.tecnology.galassini.animalcare.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.tecnology.galassini.animalcare.R
import br.com.tecnology.galassini.animalcare.models.Golfinho
import br.com.tecnology.galassini.animalcare.repository.AnimalRepository

class AnimalDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_detail)

        val animalIndex = intent.getIntExtra("ANIMAL_INDEX", -1)
        val animal = AnimalRepository.getAnimal(animalIndex)

        if (animal != null) {
            val detailsTextView = findViewById<TextView>(R.id.animalInfoTextView)
            detailsTextView.text = animal.info() + "\nSom: ${animal.falar()}"

            if (animal is Golfinho) {
                // detailsTextView.append("\nAção: ${animal.nadar()}")
            }
        }
    }
}