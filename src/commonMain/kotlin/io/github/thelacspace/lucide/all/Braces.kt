package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Braces") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(7.0,3.0)
                curveTo(5.895430564880371,3.0,5.0,3.895430564880371,5.0,5.0)
                lineTo(5.0,10.0)
                curveTo(5.0,11.104569435119629,4.104569435119629,12.0,3.0,12.0)
                curveTo(4.104569435119629,12.0,5.0,12.895430564880371,5.0,14.0)
                lineTo(5.0,19.0)
                curveTo(5.0,20.100000381469727,5.900000095367432,21.0,7.0,21.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(17.0,21.0)
                curveTo(18.104570388793945,21.0,19.0,20.104570388793945,19.0,19.0)
                lineTo(19.0,14.0)
                curveTo(19.0,12.899999618530273,19.899999618530273,12.0,21.0,12.0)
                curveTo(19.895429611206055,12.0,19.0,11.104569435119629,19.0,10.0)
                lineTo(19.0,5.0)
                curveTo(19.0,3.895430564880371,18.104570388793945,3.0,17.0,3.0)
                lineTo(16.0,3.0)
            }
}

public val LucideIcons.All.BracesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Braces: ImageVector
    @Composable get() = BracesDefinition.asImageVector()
