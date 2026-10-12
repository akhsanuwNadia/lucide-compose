package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileScan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                lineTo(20.0,8.0)
                curveTo(20.001035690307617,7.360634803771973,19.74691390991211,6.747284889221191,19.29400062561035,6.296000003814697)
                lineTo(15.706000328063965,2.7079999446868896)
                curveTo(15.254555702209473,2.2538599967956543,14.64034652709961,1.9989595413208008,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,20.0)
                curveTo(4.0,21.104570388793945,4.895430564880371,22.0,6.0,22.0)
                lineTo(10.350000381469727,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                curveTo(14.895430564880371,14.0,14.0,14.895430564880371,14.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,22.0)
                curveTo(14.895430564880371,22.0,14.0,21.104570388793945,14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.0)
                curveTo(21.104570388793945,14.0,22.0,14.895430564880371,22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,22.0)
                curveTo(21.104570388793945,22.0,22.0,21.104570388793945,22.0,20.0)
            }
}

public val LucideIcons.All.FileScanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileScan: ImageVector
    @Composable get() = FileScanDefinition.asImageVector()
