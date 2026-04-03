package obrilotrade.com.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = OrangeAccent,
    onPrimary = OnPrimary,
    secondary = NavyPrimaryLight,
    onSecondary = OnPrimary,
    tertiary = OrangeAccentLight,
    background = NavyDarkBg,
    surface = NavyDarkSurface,
    onBackground = NavyDarkOnSurface,
    onSurface = NavyDarkOnSurface,
    error = ErrorRed,
    outline = MutedText,
)

private val LightColorScheme = lightColorScheme(
    primary = NavyPrimary,
    onPrimary = OnPrimary,
    primaryContainer = NavyPrimaryLight,
    onPrimaryContainer = OnPrimary,
    secondary = OrangeAccent,
    onSecondary = OnPrimary,
    secondaryContainer = OrangeAccentLight,
    onSecondaryContainer = OnPrimary,
    tertiary = NavyPrimaryLight,
    onTertiary = OnPrimary,
    background = BackgroundLight,
    onBackground = OnSurfacePrimary,
    surface = SurfaceWhite,
    onSurface = OnSurfacePrimary,
    onSurfaceVariant = MutedText,
    outline = DividerColor,
    error = ErrorRed,
)

@Composable
fun ProductAppRBLDRTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
