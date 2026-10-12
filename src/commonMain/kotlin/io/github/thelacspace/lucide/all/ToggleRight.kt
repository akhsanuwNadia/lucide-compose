package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToggleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                curveTo(11.995193f,13.074993f,12.565935f,14.070391f,13.496114f,14.60928f)
                curveTo(14.426291f,15.148169f,15.573709f,15.148169f,16.503887f,14.60928f)
                curveTo(17.434065f,14.070391f,18.004808f,13.074993f,18.0f,12.0f)
                curveTo(18.004808f,10.925007f,17.434065f,9.929609f,16.503887f,9.39072f)
                curveTo(15.573709f,8.851831f,14.426291f,8.851831f,13.496114f,9.39072f)
                curveTo(12.565935f,9.929609f,11.995193f,10.925007f,12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                lineTo(15.0f,5.0f)
                lineTo(22.0f,5.0f)
                lineTo(22.0f,19.0f)
                lineTo(15.0f,19.0f)
                lineTo(9.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,5.0f)
                lineTo(9.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.ToggleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToggleRight: ImageVector
    @Composable get() = ToggleRightDefinition.asImageVector()
