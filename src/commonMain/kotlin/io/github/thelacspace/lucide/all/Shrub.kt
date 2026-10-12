package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrub") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,16.827999114990234)
                curveTo(11.999886512756348,16.297609329223633,11.789098739624023,15.788985252380371,11.413999557495117,15.413999557495117)
                lineTo(9.5,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,14.5)
                lineTo(12.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,8.800000190734863)
                curveTo(19.392181396484375,10.172999382019043,20.540149688720703,13.000044822692871,19.782413482666016,15.652118682861328)
                curveTo(19.02467918395996,18.30419158935547,16.556455612182617,20.098039627075195,13.800000190734863,20.0)
                lineTo(10.0,20.0)
                curveTo(7.187168598175049,19.809030532836914,4.818140983581543,17.826539993286133,4.134358882904053,15.091410636901855)
                curveTo(3.4505763053894043,12.356281280517578,4.607957363128662,9.4921875,7.0,8.0)
                curveTo(7.01231050491333,5.247304439544678,9.24727725982666,3.022310733795166,12.0,3.022310733795166)
                curveTo(14.75272274017334,3.022310733795166,16.987689971923828,5.247304439544678,17.0,8.0)
                close()
            }
}

public val LucideIcons.All.ShrubDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrub: ImageVector
    @Composable get() = ShrubDefinition.asImageVector()
