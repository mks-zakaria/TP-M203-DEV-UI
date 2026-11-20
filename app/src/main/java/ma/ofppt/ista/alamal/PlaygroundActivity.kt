package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)


    val txtPrenom = findViewById<EditText>(R.id.txtPrenom)
    val txtSalut = findViewById<TextView>(R.id.txtSalut)
    val btnEntrer = findViewById<Button>(R.id.btnEntrer)
    val btnFloating = findViewById<FloatingActionButton>(R.id.fabNouveau)

    btnEntrer.setOnClickListener{
        if (txtPrenom.text.toString().isEmpty()){
            txtPrenom.error = "Entrer votre nom SVP !!"
            txtPrenom.requestFocus()
        }else
        txtSalut.text =  "Bonjour ${txtPrenom.text}, Vous pouvez utiliser le poste n3"
    }

        btnFloating.setOnClickListener{
            txtSalut.text = ""
            txtPrenom.setText(null)
            txtPrenom.clearFocus()
            txtPrenom.setError(null)
        }

    }
}
