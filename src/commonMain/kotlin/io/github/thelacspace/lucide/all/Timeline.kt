package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Timeline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(4.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                lineTo(4.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(4.010000228881836,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(4.010000228881836,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(4.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.413999557495117,13.413999557495117)
                curveTo(9.788985252380371,13.789098739624023,10.297609329223633,13.999886512756348,10.827999114990234,14.0)
                lineTo(19.0,14.0)
                curveTo(19.552284240722656,14.0,20.0,13.552285194396973,20.0,13.0)
                lineTo(20.0,11.0)
                curveTo(20.0,10.447714805603027,19.552284240722656,10.0,19.0,10.0)
                lineTo(10.82800006866455,10.0)
                curveTo(10.29761028289795,10.000113487243652,9.788985252380371,10.210901260375977,9.413999557495117,10.586000442504883)
                lineTo(8.0,12.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.413999557495117,21.413999557495117)
                curveTo(9.788985252380371,21.789098739624023,10.297609329223633,21.99988555908203,10.827999114990234,22.0)
                lineTo(19.0,22.0)
                curveTo(19.552284240722656,22.0,20.0,21.552284240722656,20.0,21.0)
                lineTo(20.0,19.0)
                curveTo(20.0,18.447715759277344,19.552284240722656,18.0,19.0,18.0)
                lineTo(10.82800006866455,18.0)
                curveTo(10.29761028289795,18.000112533569336,9.788985252380371,18.210901260375977,9.413999557495117,18.586000442504883)
                lineTo(8.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.413999557495117,5.414000034332275)
                curveTo(9.788985252380371,5.789098739624023,10.29761028289795,5.999886989593506,10.82800006866455,6.0)
                lineTo(19.0,6.0)
                curveTo(19.552284240722656,6.0,20.0,5.5522847175598145,20.0,5.0)
                lineTo(20.0,3.0)
                curveTo(20.0,2.4477152824401855,19.552284240722656,2.0,19.0,2.0)
                lineTo(10.82800006866455,2.0)
                curveTo(10.29761028289795,2.0001132488250732,9.788985252380371,2.2109010219573975,9.413999557495117,2.5859999656677246)
                lineTo(8.0,4.0)
                close()
            }
}

public val LucideIcons.All.TimelineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Timeline: ImageVector
    @Composable get() = TimelineDefinition.asImageVector()
