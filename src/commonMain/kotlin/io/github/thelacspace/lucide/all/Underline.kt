package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Underline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,4.0f)
                lineTo(6.0f,10.0f)
                curveTo(6.0147724f,13.303234f,8.6967325f,15.9732275f,12.0f,15.9732275f)
                curveTo(15.3032675f,15.9732275f,17.985228f,13.303234f,18.0f,10.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(20.0f,20.0f)
            }
}

public val LucideIcons.All.UnderlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Underline: ImageVector
    @Composable get() = UnderlineDefinition.asImageVector()
