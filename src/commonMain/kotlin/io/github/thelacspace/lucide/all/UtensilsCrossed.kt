package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UtensilsCrossed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(13.7f,4.3f)
                curveTo(12.556571f,5.466531f,12.556571f,7.3334694f,13.7f,8.5f)
                lineTo(15.5f,10.3f)
                curveTo(16.66653f,11.443429f,18.53347f,11.443429f,19.7f,10.3f)
                lineTo(22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(3.3f,3.3f)
                curveTo(2.4937365f,4.0899734f,2.0393875f,5.1712313f,2.0393875f,6.3f)
                curveTo(2.0393875f,7.428769f,2.4937365f,8.510027f,3.3f,9.3f)
                lineTo(10.6f,16.6f)
                curveTo(11.3f,17.300001f,12.6f,17.300001f,13.400001f,16.6f)
                lineTo(15.0f,15.0f)
                close()
                moveTo(15.0f,15.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.1f,21.8f)
                lineTo(8.5f,15.499999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(12.0f,12.0f)
            }
}

public val LucideIcons.All.UtensilsCrossedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UtensilsCrossed: ImageVector
    @Composable get() = UtensilsCrossedDefinition.asImageVector()
