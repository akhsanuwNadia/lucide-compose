package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spool") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,13.44f)
                lineTo(4.442f,17.082f)
                curveTo(3.493377f,17.362028f,2.8919163f,18.293413f,3.0269616f,19.273241f)
                curveTo(3.1620069f,20.25307f,3.992994f,20.987026f,4.982f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(19.996254f,21.000717f,20.841127f,20.2681f,20.981491f,19.281782f)
                curveTo(21.121855f,18.295465f,20.514904f,17.356237f,19.558f,17.079f)
                lineTo(18.443f,16.759f)
                curveTo(17.587767f,16.511007f,16.999498f,15.727465f,17.0f,14.837f)
                lineTo(17.0f,7.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.56f)
                lineTo(19.557999f,6.918f)
                curveTo(20.506622f,6.637974f,21.108086f,5.7065887f,20.97304f,4.726759f)
                curveTo(20.837996f,3.7469296f,20.007006f,3.0129719f,19.018f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(4.003745f,2.9992816f,3.1588714f,3.7318995f,3.018508f,4.7182174f)
                curveTo(2.8781443f,5.704535f,3.4850965f,6.643763f,4.442f,6.921f)
                lineTo(5.557f,7.241f)
                curveTo(6.412234f,7.488994f,7.000502f,8.272536f,7.0f,9.163f)
                lineTo(7.0f,16.341f)
            }
}

public val LucideIcons.All.SpoolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spool: ImageVector
    @Composable get() = SpoolDefinition.asImageVector()
