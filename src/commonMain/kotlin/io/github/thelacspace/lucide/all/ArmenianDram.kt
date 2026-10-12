package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArmenianDram") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,10.0f)
                lineTo(19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,14.0f)
                lineTo(19.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,20.0f)
                lineTo(17.0f,10.0f)
                curveTo(16.985228f,6.6967654f,14.3032675f,4.026773f,11.0f,4.026773f)
                curveTo(7.6967325f,4.026773f,5.0147724f,6.6967654f,5.0f,10.0f)
            }
}

public val LucideIcons.All.ArmenianDramDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArmenianDram: ImageVector
    @Composable get() = ArmenianDramDefinition.asImageVector()
