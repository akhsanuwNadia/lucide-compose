package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Slice") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,16.586000442504883)
                lineTo(11.0,19.0)
                curveTo(11.0,19.552284240722656,10.552285194396973,20.0,10.0,20.0)
                lineTo(2.0,20.0)
                lineTo(18.3700008392334,3.630000114440918)
                curveTo(18.905094146728516,3.090099811553955,19.68816375732422,2.877772569656372,20.422697067260742,3.0734171867370605)
                curveTo(21.157230377197266,3.26906156539917,21.730939865112305,3.8427698612213135,21.926584243774414,4.577303409576416)
                curveTo(22.122228622436523,5.311837196350098,21.909900665283203,6.094907283782959,21.3700008392334,6.630000114440918)
                lineTo(11.707000732421875,16.292999267578125)
                curveTo(11.316500663757324,16.683380126953125,10.683501243591309,16.683380126953125,10.293001174926758,16.292999267578125)
                lineTo(8.0,14.0)
            }
}

public val LucideIcons.All.SliceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Slice: ImageVector
    @Composable get() = SliceDefinition.asImageVector()
