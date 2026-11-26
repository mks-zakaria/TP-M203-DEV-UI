package ma.ofppt.ista.alamal

import android.os.Bundle

import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

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
//
//          // etape 04 : Les spinners
//        val sp01 = findViewById<Spinner>(R.id.spPoste)
//        val spTxt01 = findViewById<TextView>(R.id.txtPoste)
//
//        sp01.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                spTxt01.text = parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//        }
//
//        val postesDispo = mutableListOf("p1", "p2", "p3", "p4", "p5")
//
//        val sp02 = findViewById<Spinner>(R.id.spPosteCode)
//        val spTxt03 = findViewById<TextView>(R.id.txtPosteCode)
//
//        val adaptatateur = ArrayAdapter(this, android.R.layout.simple_spinner_item, postesDispo)
//        sp02.adapter = adaptatateur
//        val btnSp02 = findViewById<Button>(R.id.btnVider)
//        btnSp02.setOnClickListener {
//            adaptatateur.clear()
//        }
//        sp02.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//                spTxt03.text = parent?.getItemAtPosition(position).toString()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                spTxt03.text = "Aucun poste choisi"
//            }
//        }
        // fin des spinners
        // etape 05 le menu contextuel
//        val a = findViewById<TextView>(R.id.txtPoste3)
//        registerForContextMenu(a)
        // fin de menu contextuell
            // casting entre les type de base + cree
           // types de casting
        // menu daction + context
        val txtRes = findViewById<TextView>(R.id.txtResa)
        txtRes.setOnLongClickListener {
            startSupportActionMode(RapRes())

            true
        }
    }


//    // menu doptions
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.s02_menu_principal, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val txtMenu = findViewById<TextView>(R.id.txtMenu)
//        when (item.itemId) {
//            R.id.menu_tarifs -> txtMenu.text = "La tarif est : 10DH / h"
//            R.id.menu_aide -> txtMenu.text = "Appeler 08090709 ppour demander laide !"
//            R.id.menu_apropos -> txtMenu.text = "Bienvenue au cybercafe !!"
//        }
//        return true
//    }
//

    // comment changer le comportement par default dun menu
    // contextuelle (creation et selection des elements )
    // comment lier une vue (TextView) avec un menu contextuel


    // menu contxtuelle
//    override fun onCreateContextMenu(
//        menu: ContextMenu?,
//        v: View?,
//        menuInfo: ContextMenu.ContextMenuInfo?
//    ) {
//        menuInflater.inflate(R.menu.s02_menu_poste, menu)
//    }
//
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        val txtContexte = findViewById<TextView>(R.id.txtContexte)
//        if (item.itemId == R.id.poste_prolonger)
//            txtContexte.text = "Poste prolongee avec succeess!!"
//        else
//            txtContexte.text = "Poste Libérer avec succeess!!"
//        return true
//    }
    // fin de menu contextuelle
}


class RapRes(): ActionMode.Callback {
    override fun onActionItemClicked(
        mode: ActionMode?,
        item: MenuItem?
    ): Boolean {
      val txt = findViewById
    }
    override fun onCreateActionMode(
        mode: ActionMode?,
        menu: Menu?
    ): Boolean {
        mode?.menuInflater?.inflate(R.menu.s02_menu_action, menu)
        mode?.title = "1 reservation"
        return true
    }
    override fun onDestroyActionMode(mode: ActionMode?) {
        return
    }
    override fun onPrepareActionMode(
        mode: ActionMode?,
        menu: Menu?
    ): Boolean {
        return false
    }
}
