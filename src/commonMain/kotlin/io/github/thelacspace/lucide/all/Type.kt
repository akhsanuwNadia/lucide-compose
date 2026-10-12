package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Type") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,4.0)
                lineTo(12.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                lineTo(4.0,5.0)
                curveTo(4.0,4.4477152824401855,4.4477152824401855,4.0,5.0,4.0)
                lineTo(19.0,4.0)
                curveTo(19.552284240722656,4.0,20.0,4.4477152824401855,20.0,5.0)
                lineTo(20.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,20.0)
                lineTo(15.0,20.0)
            }
}

public val LucideIcons.All.TypeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Type: ImageVector
    @Composable get() = TypeDefinition.asImageVector()
