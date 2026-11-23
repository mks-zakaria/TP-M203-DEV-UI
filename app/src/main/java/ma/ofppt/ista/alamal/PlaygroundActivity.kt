package ma.ofppt.ista.alamal

import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.materialswitch.MaterialSwitch

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        // Etape 01 : checkBoxes
//        val imp = findViewById<CheckBox>(R.id.chkImpression)
//        val casque = findViewById<CheckBox>(R.id.chkCasque)
//        val scaneer = findViewById<CheckBox>(R.id.chkScanner)
//        val btn = findViewById<Button>(R.id.btnTotal)
//        val txtTotale = findViewById<TextView>(R.id.txtTotal)
//        btn.setOnClickListener {
//            var prix = 0
//            var options = 0
//            if (imp.isChecked) {
//                prix += 2
//                options++
//            }
//            if (casque.isChecked) {
//                prix += 2
//                options++
//            }
//            if (scaneer.isChecked) {
//                prix += 2
//                options++
//            }
//            txtTotale.text = "$options Options(s): $prix DH"
//        }

        // Etape 02 : radioButtons
//        val radioGroup = findViewById<RadioGroup>(R.id.grpForfait)
//        val txtForfait = findViewById<TextView>(R.id.txtForfait)
//        radioGroup.setOnCheckedChangeListener { group, id ->
//            when(id) {
//                R.id.rad30 -> txtForfait.text = "Forfait 30 min, 6 DH"
//                R.id.rad60 -> txtForfait.text = "Forfait 60 min, 10 DH"
//                R.id.rad120 -> txtForfait.text = "Forfait 18 min, 18 DH"
//            }
//        }


        val normalSwitch = findViewById<ToggleButton>(R.id.tglClim)
        val materialSwitch = findViewById<MaterialSwitch>(R.id.swSilence)
        val txtAffichage = findViewById<TextView>(R.id.txtEtat)

        normalSwitch.setOnCheckedChangeListener { _, ischecked ->
            if (ischecked)
                txtAffichage.text = "Climatisation On"
            else
                txtAffichage.text = "Climatisation Off"

        }

        materialSwitch.setOnCheckedChangeListener { _, ischecked ->
            if (ischecked)
                txtAffichage.text = "Mode silence: On"
            else
                txtAffichage.text = "Mode silence: Off"
        }
    }
}
