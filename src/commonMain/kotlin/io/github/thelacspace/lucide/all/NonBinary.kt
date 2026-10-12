package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NonBinary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,4.0)
                lineTo(15.5,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,8.0)
                lineTo(15.5,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                curveTo(6.991987228393555,18.791654586791992,7.943225860595703,20.450651168823242,9.493522644042969,21.348798751831055)
                curveTo(11.043819427490234,22.2469482421875,12.956180572509766,22.2469482421875,14.506477355957031,21.348798751831055)
                curveTo(16.056774139404297,20.450651168823242,17.008012771606445,18.791654586791992,17.0,17.0)
                curveTo(17.008012771606445,15.208345413208008,16.056774139404297,13.549348831176758,14.506477355957031,12.651200294494629)
                curveTo(12.956180572509766,11.7530517578125,11.043819427490234,11.7530517578125,9.493522644042969,12.651200294494629)
                curveTo(7.943225860595703,13.549348831176758,6.991987228393555,15.208345413208008,7.0,17.0)
            }
}

public val LucideIcons.All.NonBinaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NonBinary: ImageVector
    @Composable get() = NonBinaryDefinition.asImageVector()
