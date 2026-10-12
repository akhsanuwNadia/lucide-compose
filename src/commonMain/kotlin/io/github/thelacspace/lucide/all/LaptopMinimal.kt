package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LaptopMinimal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,4.0)
                lineTo(19.0,4.0)
                curveTo(20.104570388793945,4.0,21.0,4.895430564880371,21.0,6.0)
                lineTo(21.0,14.0)
                curveTo(21.0,15.104569435119629,20.104570388793945,16.0,19.0,16.0)
                lineTo(5.0,16.0)
                curveTo(3.895430564880371,16.0,3.0,15.104569435119629,3.0,14.0)
                lineTo(3.0,6.0)
                curveTo(3.0,4.895430564880371,3.895430564880371,4.0,5.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(22.0,20.0)
            }
}

public val LucideIcons.All.LaptopMinimalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LaptopMinimal: ImageVector
    @Composable get() = LaptopMinimalDefinition.asImageVector()
