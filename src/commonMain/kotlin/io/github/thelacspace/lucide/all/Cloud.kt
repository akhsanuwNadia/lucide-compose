package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cloud") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.5,19.0)
                lineTo(9.0,19.0)
                curveTo(5.395700454711914,18.999074935913086,2.381267786026001,16.26140594482422,2.0343050956726074,12.673845291137695)
                curveTo(1.6873422861099243,9.086284637451172,4.121279716491699,5.821688652038574,7.658602237701416,5.130077838897705)
                curveTo(11.195924758911133,4.438467502593994,14.68019962310791,6.54594612121582,15.710000038146973,10.0)
                lineTo(17.5,10.0)
                curveTo(19.112489700317383,9.992788314819336,20.6055850982666,10.84890365600586,21.41391944885254,12.244170188903809)
                curveTo(22.222253799438477,13.639437675476074,22.222253799438477,15.360562324523926,21.41391944885254,16.755828857421875)
                curveTo(20.6055850982666,18.15109634399414,19.112489700317383,19.007211685180664,17.5,19.0)
                close()
            }
}

public val LucideIcons.All.CloudDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cloud: ImageVector
    @Composable get() = CloudDefinition.asImageVector()
