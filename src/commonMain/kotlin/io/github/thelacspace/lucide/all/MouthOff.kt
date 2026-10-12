package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouthOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.074f,7.417f)
                curveTo(13.991509f,6.8163424f,15.187247f,6.855947f,16.063f,7.516f)
                curveTo(17.892f,8.875999f,19.116f,9.592f,21.542f,11.16f)
                curveTo(22.000736f,11.455573f,22.1378f,12.064346f,21.85f,12.528f)
                curveTo(21.389866f,13.270009f,20.847431f,13.957698f,20.233f,14.578f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(5.6161747f,12.730439f,9.301502f,13.06242f,12.99f,12.99f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,11.0f)
                curveTo(21.552284f,11.0f,22.0f,11.447715f,22.0f,12.0f)
                curveTo(20.763308f,12.249448f,19.517784f,12.452921f,18.266f,12.61f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.695f,7.695f)
                curveTo(5.995f,8.942f,4.775f,9.662001f,2.4570003f,11.159f)
                curveTo(1.9980121f,11.454946f,1.8613424f,12.064394f,2.1500003f,12.528f)
                curveTo(5.250297f,17.519312f,11.59303f,19.404177f,16.916f,16.916f)
            }
}

public val LucideIcons.All.MouthOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouthOff: ImageVector
    @Composable get() = MouthOffDefinition.asImageVector()
