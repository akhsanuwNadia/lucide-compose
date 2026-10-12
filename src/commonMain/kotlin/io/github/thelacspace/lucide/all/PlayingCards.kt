package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.832f,8.445f)
                curveTo(14.65856f,8.185135f,14.373632f,8.021265f,14.061797f,8.002032f)
                curveTo(13.749962f,7.9828005f,13.447058f,8.110417f,13.243f,8.347f)
                lineTo(11.168f,11.445f)
                curveTo(10.943801f,11.781036f,10.943801f,12.218963f,11.168f,12.554999f)
                lineTo(13.168f,15.554999f)
                curveTo(13.353474f,15.833155f,13.665679f,16.000223f,14.0f,16.000223f)
                curveTo(14.334322f,16.000223f,14.646527f,15.833155f,14.832001f,15.554999f)
                lineTo(16.832f,12.554999f)
                curveTo(17.0562f,12.218963f,17.0562f,11.781036f,16.832f,11.445f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.18f,20.827f)
                lineTo(2.1799998f,9.827f)
                curveTo(1.7238082f,8.821823f,2.168242f,7.637113f,3.1729999f,7.1799994f)
                lineTo(7.0f,5.44f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(19.0f,2.0f)
                lineTo(21.0f,2.0f)
                lineTo(21.0f,22.0f)
                lineTo(19.0f,22.0f)
                lineTo(9.0f,22.0f)
                lineTo(7.0f,22.0f)
                lineTo(7.0f,2.0f)
                lineTo(9.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.PlayingCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCards: ImageVector
    @Composable get() = PlayingCardsDefinition.asImageVector()
