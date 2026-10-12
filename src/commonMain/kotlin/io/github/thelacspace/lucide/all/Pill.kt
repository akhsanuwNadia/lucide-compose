package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pill") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5f,20.5f)
                lineTo(20.5f,10.5f)
                curveTo(21.771563f,9.25386f,22.275963f,7.420855f,21.82096f,5.699604f)
                curveTo(21.365955f,3.978353f,20.021646f,2.6340444f,18.300396f,2.1790404f)
                curveTo(16.579145f,1.7240363f,14.74614f,2.2284377f,13.5f,3.5f)
                lineTo(3.5f,13.5f)
                curveTo(2.2284377f,14.74614f,1.7240363f,16.579145f,2.1790404f,18.300396f)
                curveTo(2.6340444f,20.021646f,3.978353f,21.365955f,5.699604f,21.82096f)
                curveTo(7.420855f,22.275963f,9.25386f,21.771563f,10.5f,20.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,8.5f)
                lineTo(15.5f,15.5f)
            }
}

public val LucideIcons.All.PillDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pill: ImageVector
    @Composable get() = PillDefinition.asImageVector()
