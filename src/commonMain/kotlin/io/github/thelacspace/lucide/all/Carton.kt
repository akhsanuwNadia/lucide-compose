package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carton") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                verticalLineTo(10f)
                arcToRelative(2f, 2f, 0f, true, false, Lf, 16f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.CartonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carton: ImageVector
    @Composable get() = CartonDefinition.asImageVector()
