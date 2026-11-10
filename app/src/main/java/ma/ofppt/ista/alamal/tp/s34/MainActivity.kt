package ma.ofppt.ista.alamal.tp.s34

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

// TP S34 — écran MainActivity : à vous de jouer
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("TP S34 — MainActivity : à vous de jouer")
        }
    }
}
