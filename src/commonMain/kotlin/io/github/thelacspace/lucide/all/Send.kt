package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Send") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.53600025177002,21.68600082397461)
                curveTo(14.613804817199707,21.879907608032227,14.803976058959961,22.00499153137207,15.01284122467041,21.99964141845703)
                curveTo(15.221707344055176,21.994293212890625,15.405224800109863,21.859636306762695,15.473000526428223,21.66200065612793)
                lineTo(21.972999572753906,2.6620006561279297)
                curveTo(22.038333892822266,2.4811172485351562,21.993213653564453,2.2787694931030273,21.857221603393555,2.142778158187866)
                curveTo(21.72123146057129,2.006786584854126,21.518882751464844,1.9616667032241821,21.33799934387207,2.027000665664673)
                lineTo(2.3379993438720703,8.527000427246094)
                curveTo(2.1403636932373047,8.594776153564453,2.0057075023651123,8.778294563293457,2.0003578662872314,8.987159729003906)
                curveTo(1.9950079917907715,9.196024894714355,2.1200926303863525,9.38619613647461,2.3139994144439697,9.464000701904297)
                lineTo(10.243999481201172,12.644001007080078)
                curveTo(10.750566482543945,12.846816062927246,11.152273178100586,13.24779987335205,11.355998992919922,13.754000663757324)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.854000091552734,2.1470000743865967)
                lineTo(10.914000511169434,13.086000442504883)
            }
}

public val LucideIcons.All.SendDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Send: ImageVector
    @Composable get() = SendDefinition.asImageVector()
