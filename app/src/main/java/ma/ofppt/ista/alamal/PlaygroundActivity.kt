package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

//        etape 01: checkbox
//        val chImp = findViewById<CheckBox>(R.id.chkImpression)
//        val chCasque = findViewById<CheckBox>(R.id.chkCasque)
//        val chScanner = findViewById<CheckBox>(R.id.chkScanner)
//        val bnTotale = findViewById<Button>(R.id.btnTotal)
//        val txtTotale = findViewById<TextView>(R.id.txtTotal)
//        bnTotale.setOnClickListener {
//            var prix = 0
//            var options = 0
//            if (chImp.isChecked) {
//                prix += 2
//                options++
//            }
//            if (chCasque.isChecked) {
//                prix += 2
//                options++
//            }
//            if (chScanner.isChecked) {
//                prix += 2
//                options++
//            }
//            txtTotale.text = "$options option(s): $prix DH "
//        }

        // Etape 02: radio buttons
//        val grp = findViewById<RadioGroup>(R.id.grpForfait)
//        val txtForfait = findViewById<TextView>(R.id.txtForfait)
//
//        grp.setOnCheckedChangeListener { group, id ->
//            when (id) {
//                R.id.rad30 -> txtForfait.text = "A payer : 6 DH"
//                R.id.rad60 -> txtForfait.text = "A payer : 10 DH"
//                R.id.rad120 -> txtForfait.text = "A payer : 18 DH"
//            }
//        }

        // etape 03 : les buttons switch
//        val toggleButton = findViewById<ToggleButton>(R.id.tglClim)
//        val materialSwitch = findViewById<MaterialSwitch>(R.id.swSilence)
//        val txtResultat = findViewById<TextView>(R.id.txtEtat)
//        toggleButton.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked)
//                txtResultat.text = "Clim : ON"
//            else
//                txtResultat.text = "Clim : OFF"
//        }
//        materialSwitch.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked)
//                txtResultat.text = "Mode Silencieux : ON"
//            else
//                txtResultat.text = "Mode Silencieux : OFF"
//        }


        val sp01 = findViewById<Spinner>(R.id.spPoste)
        val spTxt01 = findViewById<TextView>(R.id.txtPoste)

        sp01.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                spTxt01.text = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val postesDispo = mutableListOf("p1", "p2", "p3", "p4", "p5")

        val sp02 = findViewById<Spinner>(R.id.spPosteCode)
        val spTxt03 = findViewById<TextView>(R.id.txtPosteCode)

        val adaptatateur = ArrayAdapter(this, android.R.layout.simple_spinner_item, postesDispo)

        sp02.adapter = adaptatateur
        sp02.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                spTxt03.text = parent?.getItemAtPosition(position).toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                spTxt03.text = "Aucun poste choisi"
            }
        }
        val btnSp02 = findViewById<Button>(R.id.btnVider)
        btnSp02.setOnClickListener {
            adaptatateur.clear()
        }

    }

}
