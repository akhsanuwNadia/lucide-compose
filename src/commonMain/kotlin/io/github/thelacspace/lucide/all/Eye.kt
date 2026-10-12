package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eye") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.062f,12.348f)
                curveTo(1.9786594f,12.123484f,1.9786594f,11.876515f,2.062f,11.651999f)
                curveTo(3.7220232f,7.6269073f,7.6460314f,5.000616f,12.0f,5.000616f)
                curveTo(16.353968f,5.000616f,20.277977f,7.6269073f,21.938f,11.651999f)
                curveTo(22.021341f,11.876515f,22.021341f,12.123484f,21.938f,12.348f)
                curveTo(20.277977f,16.37309f,16.353968f,18.999382f,12.0f,18.999382f)
                curveTo(7.6460314f,18.999382f,3.7220235f,16.37309f,2.0620003f,12.348f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(8.995193f,13.074993f,9.565935f,14.070391f,10.496114f,14.60928f)
                curveTo(11.426291f,15.148169f,12.573709f,15.148169f,13.503886f,14.60928f)
                curveTo(14.434065f,14.070391f,15.004807f,13.074993f,15.0f,12.0f)
                curveTo(15.004807f,10.925007f,14.434065f,9.929609f,13.503886f,9.39072f)
                curveTo(12.573709f,8.851831f,11.426291f,8.851831f,10.496114f,9.39072f)
                curveTo(9.565935f,9.929609f,8.995193f,10.925007f,9.0f,12.0f)
            }
}

public val LucideIcons.All.EyeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eye: ImageVector
    @Composable get() = EyeDefinition.asImageVector()
