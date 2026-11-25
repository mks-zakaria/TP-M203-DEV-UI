package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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
//
//
//        val normalSwitch = findViewById<ToggleButton>(R.id.tglClim)
//        val materialSwitch = findViewById<MaterialSwitch>(R.id.swSilence)
//        val txtAffichage = findViewById<TextView>(R.id.txtEtat)
//
//        normalSwitch.setOnCheckedChangeListener { _, ischecked ->
//            if (ischecked)
//                txtAffichage.text = "Climatisation On"
//            else
//                txtAffichage.text = "Climatisation Off"
//
//        }
//
//        materialSwitch.setOnCheckedChangeListener { _, ischecked ->
//            if (ischecked)
//                txtAffichage.text = "Mode silence: On"
//            else
//                txtAffichage.text = "Mode silence: Off"
//        }

//        etape 04: les spinners
//        val sp01 = findViewById<Spinner>(R.id.spPoste)
//        val txtPost = findViewById<TextView>(R.id.txtPoste)
//
//        sp01.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                val tempText = parent?.getItemAtPosition(position).toString()
//                txtPost.text = "Vous avez choisi : $tempText"
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//        }
//        // 00 acceder au elements par id
//        val sp02 = findViewById<Spinner>(R.id.spPosteCode)
//        val txtPost02 = findViewById<TextView>(R.id.txtPosteCode)
//        // 01 liste des choix  Poste01 Poste02 Poste03
//        val postes = mutableListOf("Poste01", "Poste02", "Poste03")
//        val lstPosteFromRessources = resources.getStringArray(R.array.s02_postes).toList()
//        // 02 declarer un adaptateur et adapter la liste
//        val adaptateur01 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, postes)
//        val adaptateur02 = ArrayAdapter(
//            this,
//            android.R.layout.simple_spinner_dropdown_item,
//            lstPosteFromRessources
//        )
//        // 03 utiliser ladaptateur dans le spinner
//        sp02.adapter = adaptateur01
//        // 05 changer le text en fonction du spinner
//        sp02.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                txtPost02.text = parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                txtPost02.text = "Aucun poste choici"
//            }
//        }
//        // 04 on click listener dans la button vider la liste
//        val btnVider = findViewById<Button>(R.id.btnVider)
//        btnVider.setOnClickListener {
//            adaptateur01.clear()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.s02_menu_action, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val t = findViewById<TextView>(R.id.txtMenu)
        t.setOnLo
        when (item.itemId) {
            R.id.menu_tarifs -> t.text = "Voialaaa les tarifs !!"
            R.id.menu_aide -> t.text = "Appelez 070809019 pour laide"
            R.id.menu_apropos -> t.text = "Nous sommes CyberCafe"
        }
        return true
    }
}
