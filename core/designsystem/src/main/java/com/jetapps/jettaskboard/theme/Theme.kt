package com.jetapps.jettaskboard.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = md_theme_dark_background,
    primaryVariant = md_theme_dark_surface,
    secondary = SecondaryColor,
    background = md_theme_dark_background,
    surface = md_theme_dark_surface,
    error = md_theme_dark_error,
    onPrimary = md_theme_dark_onBackground,
    onSecondary = md_theme_dark_onSurfaceVariant,
    onBackground = md_theme_dark_onBackground,
    onSurface = md_theme_dark_onSurface,
    onError = md_theme_dark_onError
)

private val LightColorPalette = lightColors(
    primary = md_theme_light_surface,
    primaryVariant = md_theme_light_background,
    secondary = SecondaryColor,
    background = md_theme_light_background,
    surface = md_theme_light_surface,
    error = md_theme_light_error,
    onPrimary = md_theme_light_onBackground,
    onSecondary = md_theme_light_onSurfaceVariant,
    onBackground = md_theme_light_onBackground,
    onSurface = md_theme_light_onSurface,
    onError = md_theme_light_onError
)

@Composable
fun JtbTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable
    () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
