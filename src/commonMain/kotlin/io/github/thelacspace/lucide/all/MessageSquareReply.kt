package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareReply") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                curveTo(22.0f,18.10457f,21.10457f,19.0f,20.0f,19.0f)
                lineTo(6.828f,19.0f)
                curveTo(6.2976103f,19.000113f,5.7889853f,19.210901f,5.414f,19.586f)
                lineTo(3.2120001f,21.788f)
                curveTo(3.008943f,21.99102f,2.7035916f,22.051746f,2.4383068f,21.941868f)
                curveTo(2.173022f,21.83199f,2.0000367f,21.57314f,2.0f,21.286f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(7.0f,11.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.0f,13.0f)
                curveTo(17.0f,11.895431f,16.10457f,11.0f,15.0f,11.0f)
                lineTo(7.0f,11.0f)
            }
}

public val LucideIcons.All.MessageSquareReplyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareReply: ImageVector
    @Composable get() = MessageSquareReplyDefinition.asImageVector()
