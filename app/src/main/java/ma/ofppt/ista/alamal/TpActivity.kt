package ma.ofppt.ista.alamal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Menu du MODE TP : un bouton par séance (liste SEANCES_TP dans Seances.kt).
class TpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val titre = findViewById<TextView>(R.id.titre_menu)
        titre.text = getString(R.string.titre_tp)
        val menu = findViewById<LinearLayout>(R.id.menu)
        for (seance in SEANCES_TP) {
            val bouton = Button(this)
            bouton.text = seance.first
            bouton.isAllCaps = false
            bouton.textSize = 16f
            bouton.setOnClickListener {
                startActivity(Intent(this, seance.second))
            }
            menu.addView(bouton)
        }
    }
}
