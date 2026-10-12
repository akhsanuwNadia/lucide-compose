package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unlink2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,7.0f)
                lineTo(17.0f,7.0f)
                curveTo(19.752695f,7.0123105f,21.97769f,9.247277f,21.97769f,12.0f)
                curveTo(21.97769f,14.752723f,19.752695f,16.98769f,17.0f,17.0f)
                lineTo(15.0f,17.0f)
                moveTo(9.0f,17.0f)
                lineTo(7.0f,17.0f)
                curveTo(4.2473044f,16.98769f,2.0223107f,14.752723f,2.0223107f,12.0f)
                curveTo(2.0223107f,9.247277f,4.2473044f,7.0123105f,7.0f,7.0f)
                lineTo(9.0f,7.0f)
            }
}

public val LucideIcons.All.Unlink2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unlink2: ImageVector
    @Composable get() = Unlink2Definition.asImageVector()
