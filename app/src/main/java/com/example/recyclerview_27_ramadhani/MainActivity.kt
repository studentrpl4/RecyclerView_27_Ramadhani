package com.example.recyclerview_27_ramadhani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCALABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manhwaList = listOf<Manhwa>(
            Manhwa(
                R.drawable.manhwatog,
                "Tower Of God",
                "Harta, kuasa, dan dendam.. Semua yang kamu inginkan, ada di sini!"
            ),
            Manhwa(
                R.drawable.manhwall,
                "Loser Life",
                "Kalau waktu bisa kuputar kembali.. dan kalau saja aku bisa kembali ke masa SMA saat semua ini dimulai.. Akan kubuat kamu merasakan penderitaan yang kualami!!\" Jang Ancheol yang selalu mengganggu teman-teman waktu SMA, mendadak kembali ke masa lalu dengan tubuh Kim Jinwoo yang dulu ia ganggu. Bagaimana nasib Jang Ancheol yang menjadi Kim Jinwoo!? Apakah dia bisa keluar dari situasi ini?!"
            ),
            Manhwa(
                R.drawable.manhwasl,
                "Solo Leveling",
                "bercerita seputar petualangan Sung Jin-Woo. Awalnya ia adalah seorang hunter lemah dengan peringkat paling rendah (E-rank). Begitu lemahnya ia, sehingga mendapat julukan “The World's Weakest” dari hunter lainnya."
            ),
            Manhwa(
                R.drawable.manhwawb,
                "Wind Breaker",
                "Jahyun, seorang murid teladan di sekolah yang senang bersepeda sendirian. Namun, karena kemampuannya yang hebat dalam bersepeda, ia terus berhadapan dengan crew sepeda di sekitarnya. Drama jalanan tentang remaja-remaja yang memimpikan kebebasan!"
            ),
            Manhwa(
                R.drawable.manhwatgohs,
                "The God Of High School",
                "Turnamen untuk mencari anak SMA paling tangguh!"
            ),
            Manhwa(
                R.drawable.manhwalsm,
                "Lookism",
                "Cowok ini punya 2 wujud! Pilih yang mana ya..?"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_manhwa)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ManhwaAdapter(this, manhwaList){
            val intent = Intent(this, DetailManhwaActivity::class.java)
            intent.putExtra(INTENT_PARCALABLE, it)
            startActivity(intent)

        }
    }
}