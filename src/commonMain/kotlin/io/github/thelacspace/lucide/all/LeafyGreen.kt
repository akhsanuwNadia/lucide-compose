package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LeafyGreen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                curveTo(3.25f,21.013f,4.27f,20.025f,5.9f,19.8f)
                curveTo(7.311121f,19.799665f,8.669577f,20.335897f,9.7f,21.3f)
                curveTo(10.785755f,22.060587f,12.177805f,22.233843f,13.416875f,21.762608f)
                curveTo(14.655945f,21.291372f,15.581059f,20.236866f,15.886999f,18.946999f)
                curveTo(17.211031f,19.183044f,18.553207f,18.639545f,19.339952f,17.548761f)
                curveTo(20.126698f,16.45798f,20.21884f,15.012869f,19.577f,13.830998f)
                curveTo(20.742943f,13.454318f,21.627014f,12.49535f,21.907845f,11.302687f)
                curveTo(22.188677f,10.1100235f,21.825375f,8.857341f,20.95f,8.0f)
                curveTo(21.840836f,7.117097f,22.191175f,5.825031f,21.868362f,4.61305f)
                curveTo(21.54555f,3.4010696f,20.59893f,2.454451f,19.38695f,2.1316376f)
                curveTo(18.174969f,1.8088242f,16.882902f,2.1591644f,16.0f,3.05f)
                curveTo(15.142659f,2.174626f,13.889977f,1.811323f,12.697313f,2.0921543f)
                curveTo(11.50465f,2.3729856f,10.545681f,3.2570565f,10.169001f,4.423f)
                curveTo(8.98713f,3.7811606f,7.542021f,3.8733017f,6.4512377f,4.660047f)
                curveTo(5.360455f,5.446792f,4.8169546f,6.788969f,5.0530005f,8.113f)
                curveTo(3.7746377f,8.424322f,2.7311275f,9.3444f,2.2621708f,10.573714f)
                curveTo(1.793214f,11.803028f,1.9587909f,13.184346f,2.7050004f,14.268f)
                curveTo(3.499f,15.42f,4.409f,16.712f,4.2f,18.1f)
                curveTo(3.926f,19.743f,3.014f,20.732f,2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(17.0f,7.0f)
            }
}

public val LucideIcons.All.LeafyGreenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LeafyGreen: ImageVector
    @Composable get() = LeafyGreenDefinition.asImageVector()
