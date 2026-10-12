package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigDownDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                curveTo(14.552285194396973,8.0,15.0,8.447714805603027,15.0,9.0)
                lineTo(15.0,11.0)
                curveTo(15.0,11.552285194396973,15.447714805603027,12.0,16.0,12.0)
                lineTo(19.292999267578125,12.0)
                curveTo(19.57900047302246,11.99993896484375,19.836868286132812,12.172194480895996,19.946325302124023,12.436422348022461)
                curveTo(20.0557804107666,12.700650215148926,19.995264053344727,13.004796981811523,19.792999267578125,13.206999778747559)
                lineTo(12.853999137878418,20.145999908447266)
                curveTo(12.62760066986084,20.372676849365234,12.320371627807617,20.500043869018555,11.999999046325684,20.500043869018555)
                curveTo(11.67962646484375,20.500043869018555,11.372397422790527,20.372676849365234,11.14599895477295,20.145999908447266)
                lineTo(4.20599889755249,13.205999374389648)
                curveTo(4.004448413848877,13.003703117370605,3.9443843364715576,12.700019836425781,4.053750514984131,12.436229705810547)
                curveTo(4.163116455078125,12.172438621520996,4.420435905456543,12.000341415405273,4.70599889755249,11.999999046325684)
                lineTo(8.0,11.999999046325684)
                curveTo(8.552285194396973,11.999999046325684,9.0,11.552284240722656,9.0,10.999999046325684)
                lineTo(9.0,9.0)
                curveTo(9.0,8.447714805603027,9.447714805603027,8.0,10.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,4.0)
                lineTo(15.0,4.0)
            }
}

public val LucideIcons.All.ArrowBigDownDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigDownDash: ImageVector
    @Composable get() = ArrowBigDownDashDefinition.asImageVector()
