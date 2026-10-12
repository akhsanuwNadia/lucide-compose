package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                curveTo(9.0,19.552284240722656,9.447714805603027,20.0,10.0,20.0)
                lineTo(14.0,20.0)
                curveTo(14.552285194396973,20.0,15.0,19.552284240722656,15.0,19.0)
                lineTo(15.0,13.0)
                curveTo(15.0,12.447714805603027,15.447714805603027,12.0,16.0,12.0)
                lineTo(19.292999267578125,12.0)
                curveTo(19.57900047302246,12.00006103515625,19.836868286132812,11.827805519104004,19.946325302124023,11.563577651977539)
                curveTo(20.0557804107666,11.299349784851074,19.995264053344727,10.995203018188477,19.792999267578125,10.793000221252441)
                lineTo(12.706998825073242,3.707000255584717)
                curveTo(12.316498756408691,3.3166186809539795,11.683499336242676,3.3166186809539795,11.292999267578125,3.707000255584717)
                lineTo(4.2069993019104,10.793000221252441)
                curveTo(4.004734992980957,10.995203018188477,3.9442176818847656,11.299349784851074,4.053674221038818,11.563577651977539)
                curveTo(4.163130760192871,11.827805519104004,4.420997619628906,12.00006103515625,4.7069993019104,12.0)
                lineTo(8.0,12.0)
                curveTo(8.552285194396973,12.0,9.0,12.447714805603027,9.0,13.0)
                close()
            }
}

public val LucideIcons.All.ArrowBigUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigUp: ImageVector
    @Composable get() = ArrowBigUpDefinition.asImageVector()
