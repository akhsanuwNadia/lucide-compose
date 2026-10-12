package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BottleWine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                curveTo(10.0,2.4477152824401855,10.447714805603027,2.0,11.0,2.0)
                lineTo(13.0,2.0)
                curveTo(13.552285194396973,2.0,14.0,2.4477152824401855,14.0,3.0)
                lineTo(14.0,5.0)
                curveTo(14.0,6.298221588134766,14.421067237854004,7.561423301696777,15.199999809265137,8.600000381469727)
                lineTo(15.800000190734863,9.40000057220459)
                curveTo(16.578933715820312,10.438577651977539,17.0,11.70177936553955,17.0,13.0)
                lineTo(17.0,21.0)
                curveTo(17.0,21.552284240722656,16.552284240722656,22.0,16.0,22.0)
                lineTo(8.0,22.0)
                curveTo(7.4477152824401855,22.0,7.0,21.552284240722656,7.0,21.0)
                lineTo(7.0,13.0)
                curveTo(7.0,11.701778411865234,7.421067237854004,10.438576698303223,8.199999809265137,9.399999618530273)
                lineTo(8.800000190734863,8.59999942779541)
                curveTo(9.578932762145996,7.561422348022461,10.0,6.298221111297607,10.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,13.0)
                lineTo(13.0,13.0)
                curveTo(12.447714805603027,13.0,12.0,13.447714805603027,12.0,14.0)
                lineTo(12.0,17.0)
                curveTo(12.0,17.552284240722656,12.447714805603027,18.0,13.0,18.0)
                lineTo(17.0,18.0)
            }
}

public val LucideIcons.All.BottleWineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BottleWine: ImageVector
    @Composable get() = BottleWineDefinition.asImageVector()
