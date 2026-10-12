package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrushCleaning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,22.0)
                lineTo(15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                curveTo(19.552284240722656,14.0,20.0,13.552285194396973,20.0,13.0)
                lineTo(20.0,12.0)
                curveTo(20.0,10.895430564880371,19.104570388793945,10.0,18.0,10.0)
                lineTo(15.0,10.0)
                curveTo(14.447714805603027,10.0,14.0,9.552285194396973,14.0,9.0)
                lineTo(14.0,4.0)
                curveTo(13.995076179504395,2.8989217281341553,13.101089477539062,2.0089242458343506,12.0,2.0089242458343506)
                curveTo(10.898910522460938,2.0089242458343506,10.004923820495605,2.8989217281341553,10.0,4.0)
                lineTo(10.0,9.0)
                curveTo(10.0,9.552285194396973,9.552285194396973,10.0,9.0,10.0)
                lineTo(6.0,10.0)
                curveTo(4.895430564880371,10.0,4.0,10.895430564880371,4.0,12.0)
                lineTo(4.0,13.0)
                curveTo(4.0,13.552285194396973,4.4477152824401855,14.0,5.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                lineTo(5.0,14.0)
                lineTo(3.0269999504089355,20.767000198364258)
                curveTo(2.9556310176849365,21.06487464904785,3.024714708328247,21.379026412963867,3.214463710784912,21.61948013305664)
                curveTo(3.404212713241577,21.85993194580078,3.6936960220336914,22.000160217285156,4.0,22.0)
                lineTo(20.0,22.0)
                curveTo(20.306304931640625,22.000160217285156,20.595787048339844,21.85993194580078,20.78553581237793,21.619478225708008)
                curveTo(20.975284576416016,21.379026412963867,21.044368743896484,21.06487464904785,20.972999572753906,20.767000198364258)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(9.0,18.0)
            }
}

public val LucideIcons.All.BrushCleaningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrushCleaning: ImageVector
    @Composable get() = BrushCleaningDefinition.asImageVector()
