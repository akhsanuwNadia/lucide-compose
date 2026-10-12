package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigUpDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,16.0)
                curveTo(14.552285194396973,16.0,15.0,15.552285194396973,15.0,15.0)
                lineTo(15.0,13.0)
                curveTo(15.0,12.447714805603027,15.447714805603027,12.0,16.0,12.0)
                lineTo(19.292999267578125,12.0)
                curveTo(19.57900047302246,12.00006103515625,19.836868286132812,11.827805519104004,19.946325302124023,11.563577651977539)
                curveTo(20.0557804107666,11.299349784851074,19.995264053344727,10.995203018188477,19.792999267578125,10.793000221252441)
                lineTo(12.853999137878418,3.8540000915527344)
                curveTo(12.62760066986084,3.627324104309082,12.320371627807617,3.499955415725708,11.999999046325684,3.499955415725708)
                curveTo(11.67962646484375,3.499955415725708,11.372397422790527,3.627324104309082,11.14599895477295,3.8540000915527344)
                lineTo(4.20599889755249,10.794000625610352)
                curveTo(4.004448413848877,10.996296882629395,3.9443843364715576,11.299980163574219,4.053750514984131,11.563770294189453)
                curveTo(4.163116455078125,11.827561378479004,4.420435905456543,11.999658584594727,4.70599889755249,12.000000953674316)
                lineTo(8.0,12.000000953674316)
                curveTo(8.552285194396973,12.000000953674316,9.0,12.447715759277344,9.0,13.000000953674316)
                lineTo(9.0,15.000000953674316)
                curveTo(9.000000953674316,15.552285194396973,9.447715759277344,16.0,10.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,20.0)
                lineTo(15.0,20.0)
            }
}

public val LucideIcons.All.ArrowBigUpDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigUpDash: ImageVector
    @Composable get() = ArrowBigUpDashDefinition.asImageVector()
