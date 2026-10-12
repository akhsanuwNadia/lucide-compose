package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Archive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,8.0f)
                lineTo(21.0f,8.0f)
                lineTo(3.0f,8.0f)
                lineTo(2.0f,8.0f)
                lineTo(2.0f,3.0f)
                lineTo(3.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(4.0f,19.0f)
                curveTo(4.0f,20.10457f,4.8954306f,21.0f,6.0f,21.0f)
                lineTo(18.0f,21.0f)
                curveTo(19.10457f,21.0f,20.0f,20.10457f,20.0f,19.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
}

public val LucideIcons.All.ArchiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Archive: ImageVector
    @Composable get() = ArchiveDefinition.asImageVector()
