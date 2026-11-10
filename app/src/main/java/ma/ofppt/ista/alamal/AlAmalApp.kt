package ma.ofppt.ista.alamal

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// Outil technique (hors programme) : depuis Android 15, l'écran s'affiche « bord à bord ». Ce code décale le
// contenu de chaque activité XML pour qu'il ne passe pas sous la barre d'état ni sous la barre de navigation.
// Les écrans Compose gèrent eux-mêmes ces marges.
class AlAmalApp : Application() {
    private val seancesSansOutil = setOf<String>()

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityStarted(activity: Activity) {
                if (activity !is AppCompatActivity) return
                // ma.ofppt.ista.alamal.tp.s05.MainActivity → « tp.s05 »
                val parties = activity.javaClass.name.removePrefix("ma.ofppt.ista.alamal.").split(".")
                if (parties.size > 2 && (parties[0] + "." + parties[1]) in seancesSansOutil) return
                val contenu = activity.findViewById<View>(android.R.id.content)
                ViewCompat.setOnApplyWindowInsetsListener(contenu) { v, insets ->
                    val barres = insets.getInsets(WindowInsetsCompat.Type.systemBars()
                        or WindowInsetsCompat.Type.ime())
                    v.setPadding(barres.left, barres.top, barres.right, barres.bottom)
                    insets
                }
                ViewCompat.requestApplyInsets(contenu)
            }
            override fun onActivityCreated(a: Activity, b: Bundle?) {}
            override fun onActivityResumed(a: Activity) {}
            override fun onActivityPaused(a: Activity) {}
            override fun onActivityStopped(a: Activity) {}
            override fun onActivitySaveInstanceState(a: Activity, b: Bundle) {}
            override fun onActivityDestroyed(a: Activity) {}
        })
    }
}
