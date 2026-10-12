package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlassWater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.116000175476074,4.104000091552734)
                curveTo(5.086545467376709,3.8223202228546143,5.177913665771484,3.541361093521118,5.367417335510254,3.3308863639831543)
                curveTo(5.556920528411865,3.1204118728637695,5.826784610748291,3.0001635551452637,6.110000133514404,3.0)
                lineTo(17.889999389648438,3.0)
                curveTo(18.17340850830078,3.000133991241455,18.443450927734375,3.1205174922943115,18.63298797607422,3.331221342086792)
                curveTo(18.822526931762695,3.5419249534606934,18.91375732421875,3.823157548904419,18.88399887084961,4.105000019073486)
                lineTo(17.190000534057617,20.209999084472656)
                curveTo(17.082515716552734,21.22801971435547,16.223678588867188,22.000539779663086,15.199999809265137,22.0)
                lineTo(8.800000190734863,22.0)
                curveTo(7.772500038146973,22.005678176879883,6.907873153686523,21.231836318969727,6.800000190734863,20.209999084472656)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(7.777777671813965,10.666666984558105,10.222222328186035,10.666666984558105,12.0,12.0)
                curveTo(13.777777671813965,13.333333015441895,16.22222137451172,13.333333015441895,18.0,12.0)
            }
}

public val LucideIcons.All.GlassWaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlassWater: ImageVector
    @Composable get() = GlassWaterDefinition.asImageVector()
