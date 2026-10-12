package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(7.0f,17.0f)
                curveTo(4.2473044f,16.98769f,2.0223107f,14.752723f,2.0223107f,12.0f)
                curveTo(2.0223107f,9.247277f,4.2473044f,7.0123105f,7.0f,7.0f)
                lineTo(9.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,7.0f)
                lineTo(17.0f,7.0f)
                curveTo(18.791655f,6.991987f,20.450651f,7.943226f,21.348799f,9.493523f)
                curveTo(22.246948f,11.043819f,22.246948f,12.956181f,21.348799f,14.506477f)
                curveTo(20.450651f,16.056774f,18.791655f,17.008013f,17.0f,17.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
}

public val LucideIcons.All.Link2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link2: ImageVector
    @Composable get() = Link2Definition.asImageVector()
