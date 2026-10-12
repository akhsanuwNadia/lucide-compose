package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Utensils") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,2.0f)
                lineTo(3.0f,9.0f)
                curveTo(3.0f,10.1f,3.9f,11.0f,5.0f,11.0f)
                lineTo(9.0f,11.0f)
                curveTo(10.104569f,11.0f,11.0f,10.104569f,11.0f,9.0f)
                lineTo(11.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.0f)
                lineTo(21.0f,2.0f)
                curveTo(18.238577f,2.0f,16.0f,4.2385764f,16.0f,7.0f)
                lineTo(16.0f,13.0f)
                curveTo(16.0f,14.1f,16.9f,15.0f,18.0f,15.0f)
                lineTo(21.0f,15.0f)
                close()
                moveTo(21.0f,15.0f)
                lineTo(21.0f,22.0f)
            }
}

public val LucideIcons.All.UtensilsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Utensils: ImageVector
    @Composable get() = UtensilsDefinition.asImageVector()
