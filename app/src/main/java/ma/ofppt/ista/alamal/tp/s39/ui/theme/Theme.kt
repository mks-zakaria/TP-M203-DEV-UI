package ma.ofppt.ista.alamal.tp.s39.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

// region couleurs
val VertAlAmal = Color(0xFF1B7F3B)
val VertClair = Color(0xFFD7F0DE)
val Orange = Color(0xFFE67E22)
val BleuNuit = Color(0xFF1F2A44)

private val Couleurs = lightColorScheme(
    primary = VertAlAmal,
    onPrimary = Color.White,
    primaryContainer = VertClair,
    onPrimaryContainer = BleuNuit,
    secondary = Orange,
    onSecondary = Color.White,
    background = Color(0xFFF7F9F7),
    surface = Color.White,
    onSurface = BleuNuit
)
// endregion

// Tailles de texte agrandies (lisibles sur une capture réduite)
private val Base = Typography()
private val Textes = Typography(
    headlineMedium = Base.headlineMedium.copy(fontSize = 30.sp),
    titleLarge = Base.titleLarge.copy(fontSize = 26.sp),
    titleMedium = Base.titleMedium.copy(fontSize = 22.sp),
    bodyLarge = Base.bodyLarge.copy(fontSize = 20.sp, lineHeight = 28.sp),
    bodyMedium = Base.bodyMedium.copy(fontSize = 18.sp, lineHeight = 24.sp),
    labelLarge = Base.labelLarge.copy(fontSize = 18.sp)
)

// region theme
@Composable
fun AlAmalTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = Couleurs,
        typography = Textes,
        content = content
    )
}
// endregion
