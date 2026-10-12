package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignCenterVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,9.104569435119629,2.0,8.0)
                lineTo(2.0,6.0)
                curveTo(2.0,4.900000095367432,2.9000000953674316,4.0,4.0,4.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                lineTo(20.0,10.0)
                curveTo(21.104570388793945,10.0,22.0,9.104569435119629,22.0,8.0)
                lineTo(22.0,6.0)
                curveTo(22.0,4.895430564880371,21.104570388793945,4.0,20.0,4.0)
                lineTo(16.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,20.0)
                lineTo(7.0,20.0)
                curveTo(5.895430564880371,20.0,5.0,19.104570388793945,5.0,18.0)
                lineTo(5.0,16.0)
                curveTo(5.0,14.899999618530273,5.900000095367432,14.0,7.0,14.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(17.0,14.0)
                curveTo(18.104570388793945,14.0,19.0,14.895430564880371,19.0,16.0)
                lineTo(19.0,18.0)
                curveTo(19.0,19.104570388793945,18.104570388793945,20.0,17.0,20.0)
                lineTo(16.0,20.0)
            }
}

public val LucideIcons.All.AlignCenterVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignCenterVertical: ImageVector
    @Composable get() = AlignCenterVerticalDefinition.asImageVector()
