package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagTriangleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,22.0f)
                lineTo(6.0f,2.8f)
                curveTo(5.9997535f,2.5201676f,6.14574f,2.260546f,6.3849697f,2.1153724f)
                curveTo(6.6241994f,1.970199f,6.9218955f,1.9605772f,7.17f,2.09f)
                lineTo(18.55f,7.7799997f)
                curveTo(18.82599f,7.913669f,19.001287f,8.193341f,19.001287f,8.5f)
                curveTo(19.001287f,8.806658f,18.82599f,9.08633f,18.55f,9.219999f)
                lineTo(6.0f,15.5f)
            }
}

public val LucideIcons.All.FlagTriangleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagTriangleRight: ImageVector
    @Composable get() = FlagTriangleRightDefinition.asImageVector()
