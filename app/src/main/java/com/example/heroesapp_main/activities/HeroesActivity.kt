import android.content.Intent
import android.os.Bundle
import android.util.Log  // Asegúrate de importar Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp_main.R
import com.example.heroesapp_main.activities.HeroDetailActivity
import com.example.heroesapp_main.adapters.HeroAdapter
import com.example.heroesapp_main.models.Hero

class HeroesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes)

        val heroesRecyclerView = findViewById<RecyclerView>(R.id.heroes_recycler_view)
        heroesRecyclerView.layoutManager = LinearLayoutManager(this)

        val publisherId = intent.getIntExtra("publisherId", -1)

        // Agrega este log para verificar el valor de publisherId
        Log.d("HeroesActivity", "Publisher ID: $publisherId")

        val heroes = getHeroesForPublisher(publisherId)

        // Agrega este log para verificar el tamaño de la lista de héroes
        Log.d("HeroesActivity", "Lista de héroes: " + heroes.size)

        val adapter = HeroAdapter(heroes) { hero ->
            // Navegar a la pantalla de detalles del héroe
            val intent = Intent(this, HeroDetailActivity::class.java)
            intent.putExtra("heroName", hero.name)
            intent.putExtra("heroDescription", hero.description)
            intent.putExtra("heroImage", hero.image)
            startActivity(intent)
        }
        heroesRecyclerView.adapter = adapter
    }

    private fun getHeroesForPublisher(publisherId: Int): List<Hero> {
        return if (publisherId == 1) {
            listOf(
                Hero(1, "Iron Man", "Genius billionaire", "url_imagen", 1),
                Hero(2, "Doctor Strange", "Master of mystic arts", "https://www.pngall.com/wp-content/uploads/11/Doctor-Strange-PNG-Clipart.png", 1),
                Hero(3, "Captain America", "Super soldier", "https://www.pngwing.com/en/free-png-yjomq", 1),
                Hero(4, "Thor", "God of Thunder", "https://example.com/thor_image.png", 1),
                Hero(5, "Spider-Man", "Friendly neighborhood superhero", "https://example.com/spiderman_image.png", 1),
            )
        } else {
            listOf(
                Hero(6, "Batman", "Dark Knight", "url_imagen", 2),
                // Agrega los demás héroes de DC aquí
            )
        }
    }
}

