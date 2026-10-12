package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignCenterHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                lineTo(10.0,20.0)
                curveTo(10.0,21.104570388793945,9.104569435119629,22.0,8.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(10.0,4.0)
                curveTo(10.0,2.895430564880371,9.104569435119629,2.0,8.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,16.0)
                lineTo(20.0,17.0)
                curveTo(20.0,18.104570388793945,19.104570388793945,19.0,18.0,19.0)
                lineTo(16.0,19.0)
                curveTo(14.895430564880371,19.0,14.0,18.104570388793945,14.0,17.0)
                lineTo(14.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.0,7.0)
                curveTo(14.0,5.900000095367432,14.899999618530273,5.0,16.0,5.0)
                lineTo(18.0,5.0)
                curveTo(19.104570388793945,5.0,20.0,5.895430564880371,20.0,7.0)
                lineTo(20.0,8.0)
            }
}

public val LucideIcons.All.AlignCenterHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignCenterHorizontal: ImageVector
    @Composable get() = AlignCenterHorizontalDefinition.asImageVector()
