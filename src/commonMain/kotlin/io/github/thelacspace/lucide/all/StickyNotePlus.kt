package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNotePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(15.0f,8.0f)
                curveTo(15.0f,8.552285f,15.447715f,9.0f,16.0f,9.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                lineTo(18.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.356f)
                lineTo(21.0f,9.0f)
                curveTo(21.00157f,8.359942f,20.747406f,7.745774f,20.294f,7.294f)
                lineTo(16.706001f,3.706f)
                curveTo(16.254227f,3.2525935f,15.6400585f,2.99843f,15.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(12.355f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,18.0f)
                lineTo(15.0f,18.0f)
            }
}

public val LucideIcons.All.StickyNotePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNotePlus: ImageVector
    @Composable get() = StickyNotePlusDefinition.asImageVector()
