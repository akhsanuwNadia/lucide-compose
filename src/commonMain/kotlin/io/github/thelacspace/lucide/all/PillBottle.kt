package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PillBottle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                lineTo(14.0f,11.0f)
                curveTo(13.447715f,11.0f,13.0f,11.447715f,13.0f,12.0f)
                lineTo(13.0f,17.0f)
                curveTo(13.0f,17.552284f,13.447715f,18.0f,14.0f,18.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,7.0f)
                lineTo(6.0f,20.0f)
                curveTo(6.0f,21.10457f,6.8954306f,22.0f,8.0f,22.0f)
                lineTo(16.0f,22.0f)
                curveTo(17.10457f,22.0f,18.0f,21.10457f,18.0f,20.0f)
                lineTo(18.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,2.0f)
                lineTo(19.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,7.0f)
                lineTo(19.0f,7.0f)
                lineTo(5.0f,7.0f)
                lineTo(4.0f,7.0f)
                lineTo(4.0f,2.0f)
                lineTo(5.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.PillBottleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PillBottle: ImageVector
    @Composable get() = PillBottleDefinition.asImageVector()
