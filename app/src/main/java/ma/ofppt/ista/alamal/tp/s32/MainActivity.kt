package ma.ofppt.ista.alamal.tp.s32

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

// TP S32 — écran MainActivity : à vous de jouer
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("TP S32 — MainActivity : à vous de jouer")
        }
    }
}
