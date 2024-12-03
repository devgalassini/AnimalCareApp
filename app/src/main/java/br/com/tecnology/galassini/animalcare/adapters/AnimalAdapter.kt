package br.com.tecnology.galassini.animalcare.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import br.com.tecnology.galassini.animalcare.R
import br.com.tecnology.galassini.animalcare.models.Animal
import br.com.tecnology.galassini.animalcare.models.Cachorro
import br.com.tecnology.galassini.animalcare.models.Gato
import br.com.tecnology.galassini.animalcare.models.Golfinho

class AnimalAdapter(private val context: Context, private val animals: List<Animal>) : BaseAdapter() {

    override fun getCount(): Int {
        return animals.size
    }

    override fun getItem(position: Int): Any {
        return animals[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item_animal, parent, false)

        val animal = animals[position]

        // Referências aos widgets no layout personalizado
        val animalImageView = view.findViewById<ImageView>(R.id.animalImageView)
        val animalNameTextView = view.findViewById<TextView>(R.id.animalNameTextView)
        val animalTypeTextView = view.findViewById<TextView>(R.id.animalTypeTextView)

        // Configurar os valores
        animalNameTextView.text = animal.nome
        animalTypeTextView.text = animal.tipo

        // Definir imagem com base no tipo do animal
        val imageResId = when (animal) {
            is Cachorro -> R.drawable.ic_cachorro
            is Gato -> R.drawable.ic_gato
            is Golfinho -> R.drawable.ic_golfinho
            else -> R.drawable.ic_loading
        }
        animalImageView.setImageResource(imageResId)

        return view
    }
}