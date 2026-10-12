package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Worm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(17.5f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.63f,18.81f)
                lineTo(22.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.47f,8.23f)
                curveTo(7.064462f,7.8941994f,7.8030252f,7.951561f,8.3385105f,8.375121f)
                curveTo(8.873996f,8.798681f,9.099887f,9.504188f,8.91f,10.16f)
                lineTo(8.2699995f,12.24f)
                curveTo(7.4176073f,14.965436f,8.369741f,17.93252f,10.648844f,19.653063f)
                curveTo(12.927947f,21.373606f,16.04236f,21.476444f,18.43f,19.91f)
                lineTo(18.85f,19.64f)
                curveTo(19.606474f,19.154251f,20.045223f,18.300873f,20.000113f,17.403004f)
                curveTo(19.955004f,16.505135f,19.432928f,15.700031f,18.631577f,15.29255f)
                curveTo(17.830225f,14.88507f,16.8721f,14.937505f,16.12f,15.429999f)
                lineTo(15.700001f,15.7f)
                curveTo(15.079825f,16.094042f,14.280119f,16.061348f,13.69418f,15.617994f)
                curveTo(13.108241f,15.174642f,12.859385f,14.413938f,13.070001f,13.71f)
                lineTo(13.710001f,11.63f)
                curveTo(14.548533f,8.990962f,13.666645f,6.108397f,11.495084f,4.3902636f)
                curveTo(9.323523f,2.6721299f,6.3153996f,2.4769273f,3.94f,3.9f)
                lineTo(3.24f,4.3f)
                curveTo(2.4603786f,4.7533946f,1.98294f,5.5892763f,1.9884692f,6.4911327f)
                curveTo(1.9939985f,7.3929896f,2.4816506f,8.222954f,3.2667727f,8.666756f)
                curveTo(4.0518947f,9.110557f,5.014465f,9.100349f,5.79f,8.64f)
                close()
            }
}

public val LucideIcons.All.WormDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Worm: ImageVector
    @Composable get() = WormDefinition.asImageVector()
