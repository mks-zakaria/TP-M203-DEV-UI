package ma.ofppt.ista.alamal

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

// MODE COURS (Playground) : écran VIDE pour tester en direct les exemples montrés en cours.
// Écrivez le layout dans res/layout/activity_playground.xml et le code Kotlin ci-dessous, dans onCreate.
class PlaygroundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playground)

        val btn = findViewById<Button>(R.id.btnEntrer)
        val txtPrenom = findViewById<EditText>(R.id.edtPrenom)
        val txtAffichage = findViewById<TextView>(R.id.txtSalut)
        val btnFloat = findViewById<FloatingActionButton>(R.id.fabNouveau)


        btn.setOnClickListener {
            if (txtPrenom.text.toString().trim().isEmpty()){
                txtPrenom.error = "Entrer votre prenom !!"
                txtPrenom.requestFocus()
            }
        }
    }

}
