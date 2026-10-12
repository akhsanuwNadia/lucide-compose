package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(7.0,17.0)
                curveTo(4.247304439544678,16.987689971923828,2.022310733795166,14.75272274017334,2.022310733795166,12.0)
                curveTo(2.022310733795166,9.24727725982666,4.247304439544678,7.01231050491333,7.0,7.0)
                lineTo(9.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,7.0)
                lineTo(17.0,7.0)
                curveTo(18.791654586791992,6.991987228393555,20.450651168823242,7.943225860595703,21.348798751831055,9.493522644042969)
                curveTo(22.2469482421875,11.043819427490234,22.2469482421875,12.956180572509766,21.348798751831055,14.506477355957031)
                curveTo(20.450651168823242,16.056774139404297,18.791654586791992,17.008012771606445,17.0,17.0)
                lineTo(15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(16.0,12.0)
            }
}

public val LucideIcons.All.Link2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link2: ImageVector
    @Composable get() = Link2Definition.asImageVector()
