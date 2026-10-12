package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(7.0,17.0)
                curveTo(4.247304439544678,16.987689971923828,2.022310733795166,14.75272274017334,2.022310733795166,12.0)
                curveTo(2.022310733795166,9.24727725982666,4.247304439544678,7.01231050491333,7.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,7.0)
                lineTo(17.0,7.0)
                curveTo(18.89385986328125,7.0,20.62517547607422,8.070012092590332,21.472135543823242,9.763932228088379)
                curveTo(22.319095611572266,11.457852363586426,22.136316299438477,13.484911918640137,21.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.Link2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link2Off: ImageVector
    @Composable get() = Link2OffDefinition.asImageVector()
