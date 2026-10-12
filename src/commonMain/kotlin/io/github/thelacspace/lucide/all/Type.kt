package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Type") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,4.0f)
                lineTo(12.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                lineTo(4.0f,5.0f)
                curveTo(4.0f,4.4477153f,4.4477153f,4.0f,5.0f,4.0f)
                lineTo(19.0f,4.0f)
                curveTo(19.552284f,4.0f,20.0f,4.4477153f,20.0f,5.0f)
                lineTo(20.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,20.0f)
                lineTo(15.0f,20.0f)
            }
}

public val LucideIcons.All.TypeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Type: ImageVector
    @Composable get() = TypeDefinition.asImageVector()
