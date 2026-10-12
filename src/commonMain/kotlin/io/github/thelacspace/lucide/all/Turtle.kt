package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Turtle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(14.0,14.0)
                lineTo(14.0,17.0)
                curveTo(14.0,17.552284240722656,14.447714805603027,18.0,15.0,18.0)
                lineTo(17.0,18.0)
                curveTo(17.552284240722656,18.0,18.0,17.552284240722656,18.0,17.0)
                lineTo(18.0,14.0)
                curveTo(18.012819290161133,11.133352279663086,16.4908390045166,8.478958129882812,14.010363578796387,7.0419206619262695)
                curveTo(11.529888153076172,5.604883670806885,8.470111846923828,5.604883670806885,5.989636421203613,7.0419206619262695)
                curveTo(3.5091612339019775,8.478958129882812,1.9871798753738403,11.133352279663086,2.0,14.0)
                lineTo(2.0,17.0)
                curveTo(2.0,17.552284240722656,2.4477152824401855,18.0,3.0,18.0)
                lineTo(5.0,18.0)
                curveTo(5.5522847175598145,18.0,6.0,17.552284240722656,6.0,17.0)
                lineTo(6.0,14.0)
                lineTo(8.0,10.0)
                lineTo(12.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.820000171661377,7.900000095367432)
                lineTo(8.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.180000305175781,7.900000095367432)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.93000030517578,10.0)
                lineTo(20.0,10.0)
                curveTo(21.101078033447266,10.004923820495605,21.99107551574707,10.898910522460938,21.99107551574707,12.0)
                curveTo(21.99107551574707,13.101089477539062,21.101078033447266,13.995076179504395,20.0,14.0)
                lineTo(2.0,14.0)
            }
}

public val LucideIcons.All.TurtleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Turtle: ImageVector
    @Composable get() = TurtleDefinition.asImageVector()
