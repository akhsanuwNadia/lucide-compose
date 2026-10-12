package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LensConvex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.433f,2.0f)
                curveTo(13.765008f,2.003279f,14.073739f,2.1711328f,14.257f,2.448f)
                curveTo(17.915066f,8.290661f,17.915066f,15.709339f,14.257f,21.552f)
                curveTo(14.073739f,21.828867f,13.765008f,21.996721f,13.433f,22.0f)
                lineTo(10.566999f,22.0f)
                curveTo(10.234991f,21.996721f,9.92626f,21.828867f,9.742999f,21.552f)
                curveTo(6.0849338f,15.709339f,6.0849338f,8.290661f,9.742999f,2.448f)
                curveTo(9.926261f,2.1711326f,10.234992f,2.0032787f,10.567f,2.0f)
                close()
            }
}

public val LucideIcons.All.LensConvexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LensConvex: ImageVector
    @Composable get() = LensConvexDefinition.asImageVector()
