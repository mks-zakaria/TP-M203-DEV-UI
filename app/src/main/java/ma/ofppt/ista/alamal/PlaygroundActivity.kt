package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        val chImp = findViewById<CheckBox>(R.id.chkImpression)
        val chCasque = findViewById<CheckBox>(R.id.chkCasque)
        val chScanner = findViewById<CheckBox>(R.id.chkScanner)
        val bnTotale = findViewById<Button>(R.id.btnTotal)
        val txtTotale = findViewById<TextView>(R.id.txtTotal)
        bnTotale.setOnClickListener {
            var prix = 0
            var options = 0
            if (chImp.isChecked) {
                prix += 2
                options++
            }
            if (chCasque.isChecked) {
                prix += 2
                options++
            }
            if (chScanner.isChecked) {
                prix += 2
                options++
            }
            txtTotale.text = "$options option(s): $prix DH "
        }
    }
}
