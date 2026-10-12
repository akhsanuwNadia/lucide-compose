package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trophy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,14.65999984741211)
                lineTo(10.0,17.0)
                curveTo(10.0,17.552284240722656,9.552285194396973,18.0,9.0,18.0)
                curveTo(7.895430564880371,18.0,7.0,18.895429611206055,7.0,20.0)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.65999984741211)
                lineTo(14.0,17.0)
                curveTo(14.0,17.552284240722656,14.447714805603027,18.0,15.0,18.0)
                curveTo(16.104570388793945,18.0,17.0,18.895429611206055,17.0,20.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.916000366210938,10.0)
                lineTo(19.5,10.0)
                curveTo(20.880712509155273,10.0,22.0,8.880711555480957,22.0,7.5)
                lineTo(22.0,5.0)
                curveTo(22.0,4.4477152824401855,21.552284240722656,4.0,21.0,4.0)
                lineTo(18.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,22.0)
                lineTo(20.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                curveTo(6.014772415161133,12.303234100341797,8.696732521057129,14.973227500915527,12.0,14.973227500915527)
                curveTo(15.303267478942871,14.973227500915527,17.985227584838867,12.303234100341797,18.0,9.0)
                lineTo(18.0,3.0)
                curveTo(18.0,2.4477152824401855,17.552284240722656,2.0,17.0,2.0)
                lineTo(7.0,2.0)
                curveTo(6.4477152824401855,2.0,6.0,2.4477152824401855,6.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.084000110626221,10.0)
                lineTo(4.5,10.0)
                curveTo(3.119288206100464,10.0,2.0,8.880711555480957,2.0,7.5)
                lineTo(2.0,5.0)
                curveTo(2.0,4.4477152824401855,2.4477152824401855,4.0,3.0,4.0)
                lineTo(6.0,4.0)
            }
}

public val LucideIcons.All.TrophyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trophy: ImageVector
    @Composable get() = TrophyDefinition.asImageVector()
