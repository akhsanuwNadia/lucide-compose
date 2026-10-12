package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DropletOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.71500015258789,13.185999870300293)
                curveTo(18.290000915527344,11.857999801635742,17.384000778198242,10.607000350952148,16.0,9.5)
                curveTo(14.0,7.900000095367432,12.5,5.5,12.0,3.0)
                curveTo(11.8170804977417,3.8962419033050537,11.519990921020508,4.765328884124756,11.116000175476074,5.585999965667725)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.795000076293945,8.79699993133545)
                curveTo(8.541464805603027,9.043987274169922,8.276156425476074,9.278594017028809,8.0,9.5)
                curveTo(6.0,11.100000381469727,5.0,13.0,5.0,15.0)
                curveTo(4.9996724128723145,18.230491638183594,7.210094451904297,21.041643142700195,10.349503517150879,21.803346633911133)
                curveTo(13.488913536071777,22.565048217773438,16.741838455200195,21.07944679260254,18.222000122070312,18.20800018310547)
            }
}

public val LucideIcons.All.DropletOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DropletOff: ImageVector
    @Composable get() = DropletOffDefinition.asImageVector()
