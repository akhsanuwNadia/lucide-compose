package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileUser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(19.292f,6.2939997f)
                curveTo(19.74614f,6.745444f,20.00104f,7.3596535f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                curveTo(15.990151f,19.797844f,14.202178f,18.017849f,12.0f,18.017849f)
                curveTo(9.797822f,18.017849f,8.009849f,19.797844f,8.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                curveTo(8.995193f,16.074993f,9.565935f,17.07039f,10.496114f,17.60928f)
                curveTo(11.426291f,18.148169f,12.573709f,18.148169f,13.503886f,17.60928f)
                curveTo(14.434065f,17.07039f,15.004807f,16.074993f,15.0f,15.0f)
                curveTo(15.004807f,13.925007f,14.434065f,12.929609f,13.503886f,12.39072f)
                curveTo(12.573709f,11.851831f,11.426291f,11.851831f,10.496114f,12.39072f)
                curveTo(9.565935f,12.929609f,8.995193f,13.925007f,9.0f,15.0f)
            }
}

public val LucideIcons.All.FileUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileUser: ImageVector
    @Composable get() = FileUserDefinition.asImageVector()
