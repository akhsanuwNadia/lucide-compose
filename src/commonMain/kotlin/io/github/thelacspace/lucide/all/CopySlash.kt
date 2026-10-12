package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CopySlash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(20.0f,8.0f)
                curveTo(21.10457f,8.0f,22.0f,8.895431f,22.0f,10.0f)
                lineTo(22.0f,20.0f)
                curveTo(22.0f,21.10457f,21.10457f,22.0f,20.0f,22.0f)
                lineTo(10.0f,22.0f)
                curveTo(8.895431f,22.0f,8.0f,21.10457f,8.0f,20.0f)
                lineTo(8.0f,10.0f)
                curveTo(8.0f,8.895431f,8.895431f,8.0f,10.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                curveTo(2.9f,16.0f,2.0f,15.1f,2.0f,14.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.9f,2.9f,2.0f,4.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(15.1f,2.0f,16.0f,2.9f,16.0f,4.0f)
            }
}

public val LucideIcons.All.CopySlashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CopySlash: ImageVector
    @Composable get() = CopySlashDefinition.asImageVector()
