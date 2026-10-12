package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lightbulb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                curveTo(15.2f,13.0f,15.7f,12.3f,16.5f,11.5f)
                curveTo(17.5f,10.6f,18.0f,9.3f,18.0f,8.0f)
                curveTo(17.985228f,4.6967654f,15.3032675f,2.026773f,12.0f,2.026773f)
                curveTo(8.6967325f,2.026773f,6.0147724f,4.6967654f,6.0f,8.0f)
                curveTo(6.0f,9.0f,6.2f,10.2f,7.5f,11.5f)
                curveTo(8.2f,12.2f,8.8f,13.0f,9.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                lineTo(15.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(14.0f,22.0f)
            }
}

public val LucideIcons.All.LightbulbDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lightbulb: ImageVector
    @Composable get() = LightbulbDefinition.asImageVector()
