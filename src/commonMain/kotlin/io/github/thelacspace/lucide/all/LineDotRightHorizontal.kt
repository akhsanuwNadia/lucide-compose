package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotRightHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(15.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                curveTo(14.995193f,13.074993f,15.565935f,14.070391f,16.496113f,14.60928f)
                curveTo(17.426292f,15.148169f,18.573708f,15.148169f,19.503887f,14.60928f)
                curveTo(20.434065f,14.070391f,21.004808f,13.074993f,21.0f,12.0f)
                curveTo(21.004808f,10.925007f,20.434065f,9.929609f,19.503887f,9.39072f)
                curveTo(18.573708f,8.851831f,17.426292f,8.851831f,16.496113f,9.39072f)
                curveTo(15.565935f,9.929609f,14.995193f,10.925007f,15.0f,12.0f)
            }
}

public val LucideIcons.All.LineDotRightHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotRightHorizontal: ImageVector
    @Composable get() = LineDotRightHorizontalDefinition.asImageVector()
