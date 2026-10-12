package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,8.5f)
                lineTo(22.0f,5.0f)
                curveTo(22.0f,3.8954306f,21.10457f,3.0f,20.0f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,21.286f)
                curveTo(2.0000367f,21.57314f,2.173022f,21.83199f,2.4383068f,21.941868f)
                curveTo(2.7035913f,22.051746f,3.0089428f,21.99102f,3.212f,21.788f)
                lineTo(5.4139996f,19.586f)
                curveTo(5.7889853f,19.210901f,6.2976103f,19.000113f,6.828f,19.0f)
                lineTo(10.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(20.0f,13.0f)
                curveTo(19.995075f,11.898922f,19.10109f,11.0089245f,18.0f,11.0089245f)
                curveTo(16.89891f,11.0089245f,16.004925f,11.898922f,16.0f,13.0f)
                lineTo(16.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(21.0f,15.0f)
                lineTo(22.0f,15.0f)
                lineTo(22.0f,20.0f)
                lineTo(21.0f,20.0f)
                lineTo(15.0f,20.0f)
                lineTo(14.0f,20.0f)
                lineTo(14.0f,15.0f)
                lineTo(15.0f,15.0f)
                close()
            }
}

public val LucideIcons.All.MessageSquareLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareLock: ImageVector
    @Composable get() = MessageSquareLockDefinition.asImageVector()
