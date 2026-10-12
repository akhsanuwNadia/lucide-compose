package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.832f,8.445f)
                curveTo(12.65856f,8.185135f,12.373632f,8.021265f,12.061797f,8.002032f)
                curveTo(11.749962f,7.9828005f,11.447058f,8.110417f,11.243f,8.347f)
                lineTo(9.168f,11.445f)
                curveTo(8.943801f,11.781036f,8.943801f,12.218963f,9.168f,12.554999f)
                lineTo(11.168f,15.554999f)
                curveTo(11.353474f,15.833155f,11.665679f,16.000223f,12.0f,16.000223f)
                curveTo(12.334322f,16.000223f,12.646527f,15.833155f,12.832001f,15.554999f)
                lineTo(14.832001f,12.554999f)
                curveTo(15.0562f,12.218963f,15.0562f,11.781036f,14.832001f,11.445f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(17.0f,2.0f)
                lineTo(19.0f,2.0f)
                lineTo(19.0f,22.0f)
                lineTo(17.0f,22.0f)
                lineTo(7.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(5.0f,2.0f)
                lineTo(7.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.PlayingCardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCard: ImageVector
    @Composable get() = PlayingCardDefinition.asImageVector()
