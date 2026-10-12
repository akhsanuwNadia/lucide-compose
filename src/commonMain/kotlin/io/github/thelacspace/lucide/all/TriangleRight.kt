package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(3.0f,20.0f)
                curveTo(1.9f,20.0f,1.7f,19.4f,2.6f,18.7f)
                lineTo(20.4f,4.3f)
                curveTo(21.3f,3.6000001f,22.0f,3.9f,22.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.TriangleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleRight: ImageVector
    @Composable get() = TriangleRightDefinition.asImageVector()
