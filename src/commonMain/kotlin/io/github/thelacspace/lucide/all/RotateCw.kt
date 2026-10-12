package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                curveTo(21.0f,16.970562f,16.970562f,21.0f,12.0f,21.0f)
                curveTo(7.029437f,21.0f,3.0f,16.970562f,3.0f,12.0f)
                curveTo(3.0f,7.029437f,7.029437f,3.0f,12.0f,3.0f)
                curveTo(14.52f,3.0f,16.93f,4.0f,18.74f,5.74f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(21.0f,8.0f)
                lineTo(16.0f,8.0f)
            }
}

public val LucideIcons.All.RotateCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCw: ImageVector
    @Composable get() = RotateCwDefinition.asImageVector()
