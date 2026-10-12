package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(7.0f,17.0f)
                curveTo(4.2473044f,16.98769f,2.0223107f,14.752723f,2.0223107f,12.0f)
                curveTo(2.0223107f,9.247277f,4.2473044f,7.0123105f,7.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,7.0f)
                lineTo(17.0f,7.0f)
                curveTo(18.89386f,7.0f,20.625175f,8.070012f,21.472136f,9.763932f)
                curveTo(22.319096f,11.457852f,22.136316f,13.484912f,21.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.Link2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link2Off: ImageVector
    @Composable get() = Link2OffDefinition.asImageVector()
