package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RugbyBall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,7.0)
                lineTo(17.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.34000015258789,2.138000011444092)
                curveTo(8.403120994567871,2.9298512935638428,2.9298512935638428,8.403120994567871,2.138000011444092,15.34000015258789)
                curveTo(1.781000018119812,18.280000686645508,2.1419999599456787,20.259000778198242,2.943000078201294,21.05699920654297)
                curveTo(3.741000175476074,21.856998443603516,5.7210001945495605,22.2189998626709,8.66100025177002,21.86199951171875)
                curveTo(15.597159385681152,21.069807052612305,21.069807052612305,15.597159385681152,21.86199951171875,8.66100025177002)
                curveTo(22.2189998626709,5.7210001945495605,21.857999801635742,3.741000175476074,21.05699920654297,2.943000316619873)
                curveTo(20.25899887084961,2.143000364303589,18.27899932861328,1.7810003757476807,15.339999198913574,2.138000249862671)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,13.0)
                lineTo(11.0,17.0)
            }
}

public val LucideIcons.All.RugbyBallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RugbyBall: ImageVector
    @Composable get() = RugbyBallDefinition.asImageVector()
