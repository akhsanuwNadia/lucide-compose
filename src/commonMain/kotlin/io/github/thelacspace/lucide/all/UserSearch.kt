package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,7.0f)
                curveTo(5.99359f,8.433324f,6.7545805f,9.760521f,7.994818f,10.479039f)
                curveTo(9.235056f,11.197558f,10.764944f,11.197558f,12.005181f,10.479039f)
                curveTo(13.2454195f,9.760521f,14.00641f,8.433324f,14.0f,7.0f)
                curveTo(14.00641f,5.566676f,13.2454195f,4.239479f,12.005181f,3.5209603f)
                curveTo(10.764944f,2.8024418f,9.235056f,2.8024418f,7.994818f,3.5209603f)
                curveTo(6.7545805f,4.239479f,5.99359f,5.566676f,6.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.3f,15.0f)
                lineTo(7.0f,15.0f)
                curveTo(4.790861f,15.0f,3.0f,16.790861f,3.0f,19.0f)
                lineTo(3.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.0f)
                curveTo(13.995193f,18.074993f,14.565935f,19.07039f,15.496114f,19.60928f)
                curveTo(16.426292f,20.148169f,17.573708f,20.148169f,18.503887f,19.60928f)
                curveTo(19.434065f,19.07039f,20.004808f,18.074993f,20.0f,17.0f)
                curveTo(20.004808f,15.925007f,19.434065f,14.929609f,18.503887f,14.39072f)
                curveTo(17.573708f,13.851831f,16.426292f,13.851831f,15.496114f,14.39072f)
                curveTo(14.565935f,14.929609f,13.995193f,15.925007f,14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(19.1f,19.1f)
            }
}

public val LucideIcons.All.UserSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserSearch: ImageVector
    @Composable get() = UserSearchDefinition.asImageVector()
