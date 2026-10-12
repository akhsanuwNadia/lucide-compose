package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotBottomVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                curveTo(8.995193f,19.074993f,9.565935f,20.07039f,10.496114f,20.60928f)
                curveTo(11.426291f,21.148169f,12.573709f,21.148169f,13.503886f,20.60928f)
                curveTo(14.434065f,20.07039f,15.004807f,19.074993f,15.0f,18.0f)
                curveTo(15.004807f,16.925007f,14.434065f,15.929609f,13.503886f,15.39072f)
                curveTo(12.573709f,14.851831f,11.426291f,14.851831f,10.496114f,15.39072f)
                curveTo(9.565935f,15.929609f,8.995193f,16.925007f,9.0f,18.0f)
            }
}

public val LucideIcons.All.LineDotBottomVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotBottomVertical: ImageVector
    @Composable get() = LineDotBottomVerticalDefinition.asImageVector()
