package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                curveTo(20.552284240722656,10.0,21.0,9.552285194396973,21.0,9.0)
                lineTo(21.0,6.0)
                curveTo(21.0,5.4477152824401855,20.552284240722656,5.0,20.0,5.0)
                lineTo(17.5,5.0)
                curveTo(17.185243606567383,4.999999523162842,16.88885498046875,4.851805686950684,16.700000762939453,4.599999904632568)
                lineTo(15.80000114440918,3.3999998569488525)
                curveTo(15.611146926879883,3.148193836212158,15.314757347106934,2.999999523162842,15.0,3.0)
                lineTo(13.0,3.0)
                curveTo(12.447714805603027,3.0,12.0,3.4477152824401855,12.0,4.0)
                lineTo(12.0,9.0)
                curveTo(12.0,9.552285194396973,12.447714805603027,10.0,13.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,21.0)
                curveTo(20.552284240722656,21.0,21.0,20.552284240722656,21.0,20.0)
                lineTo(21.0,17.0)
                curveTo(21.0,16.447715759277344,20.552284240722656,16.0,20.0,16.0)
                lineTo(17.100000381469727,16.0)
                curveTo(16.72705078125,15.995123863220215,16.38780975341797,15.783098220825195,16.220001220703125,15.449999809265137)
                lineTo(15.80000114440918,14.59999942779541)
                curveTo(15.640448570251465,14.234410285949707,15.278887748718262,13.998610496520996,14.880001068115234,13.999999046325684)
                lineTo(13.0,13.999999046325684)
                curveTo(12.447714805603027,13.999999046325684,12.0,14.447713851928711,12.0,14.999999046325684)
                lineTo(12.0,20.0)
                curveTo(12.0,20.552284240722656,12.447714805603027,21.0,13.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                curveTo(3.0,6.104569435119629,3.895430564880371,7.0,5.0,7.0)
                lineTo(8.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,16.0)
                curveTo(3.0,17.104570388793945,3.895430564880371,18.0,5.0,18.0)
                lineTo(8.0,18.0)
            }
}

public val LucideIcons.All.FolderTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderTree: ImageVector
    @Composable get() = FolderTreeDefinition.asImageVector()
