package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Whistle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,6.0)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,6.0)
                curveTo(21.552284240722656,6.0,22.0,6.4477152824401855,22.0,7.0)
                lineTo(22.0,9.0)
                curveTo(22.0,9.552285194396973,21.552284240722656,10.0,21.0,10.0)
                lineTo(15.324999809265137,10.0)
                curveTo(16.660341262817383,12.815146446228027,15.974241256713867,16.17401123046875,13.64185905456543,18.239967346191406)
                curveTo(11.309476852416992,20.305925369262695,7.8923563957214355,20.58157730102539,5.258975028991699,18.91619873046875)
                curveTo(2.625593423843384,17.250818252563477,1.4099634885787964,14.045363426208496,2.276790142059326,11.052572250366211)
                curveTo(3.1436169147491455,8.059781074523926,5.8842034339904785,6.000197887420654,9.0,6.0)
                close()
            }
}

public val LucideIcons.All.WhistleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Whistle: ImageVector
    @Composable get() = WhistleDefinition.asImageVector()
