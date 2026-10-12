package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pilcrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,4.0f)
                lineTo(13.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,4.0f)
                lineTo(17.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,4.0f)
                lineTo(9.5f,4.0f)
                curveTo(7.022574f,4.0110793f,5.0200796f,6.022549f,5.0200796f,8.5f)
                curveTo(5.0200796f,10.97745f,7.022574f,12.98892f,9.5f,13.0f)
                lineTo(13.0f,13.0f)
            }
}

public val LucideIcons.All.PilcrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pilcrow: ImageVector
    @Composable get() = PilcrowDefinition.asImageVector()
