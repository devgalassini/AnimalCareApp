package br.com.tecnology.galassini.animalcare.activities

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import br.com.tecnology.galassini.animalcare.R
import br.com.tecnology.galassini.animalcare.adapters.AnimalAdapter
import br.com.tecnology.galassini.animalcare.repository.AnimalRepository

class AnimalListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_list)

        val animalListView = findViewById<ListView>(R.id.animalListView)
        val adapter = AnimalAdapter(this, AnimalRepository.getAnimals())
        animalListView.adapter = adapter

        // Clique em item para abrir detalhes
        animalListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, AnimalDetailsActivity::class.java)
            intent.putExtra("ANIMAL_INDEX", position)
            startActivity(intent)
        }
    }
}