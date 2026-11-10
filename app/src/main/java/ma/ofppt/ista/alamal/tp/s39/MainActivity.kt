package ma.ofppt.ista.alamal.tp.s39

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

// TP S39 — écran MainActivity : à vous de jouer
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("TP S39 — MainActivity : à vous de jouer")
        }
    }
}
