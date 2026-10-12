package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Siren") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(7.0,12.0)
                curveTo(6.991987228393555,10.208345413208008,7.943225860595703,8.549348831176758,9.493522644042969,7.651200771331787)
                curveTo(11.043819427490234,6.753052234649658,12.956180572509766,6.753052234649658,14.506477355957031,7.651200771331787)
                curveTo(16.056774139404297,8.549348831176758,17.008012771606445,10.208345413208008,17.0,12.0)
                lineTo(17.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                curveTo(5.0,21.552284240722656,5.4477152824401855,22.0,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(18.552284240722656,22.0,19.0,21.552284240722656,19.0,21.0)
                lineTo(19.0,20.0)
                curveTo(19.0,18.895429611206055,18.104570388793945,18.0,17.0,18.0)
                lineTo(7.0,18.0)
                curveTo(5.895430564880371,18.0,5.0,18.895429611206055,5.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.5,4.5)
                lineTo(18.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.928999900817871,4.928999900817871)
                lineTo(5.63599967956543,5.63599967956543)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,18.0)
            }
}

public val LucideIcons.All.SirenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Siren: ImageVector
    @Composable get() = SirenDefinition.asImageVector()
