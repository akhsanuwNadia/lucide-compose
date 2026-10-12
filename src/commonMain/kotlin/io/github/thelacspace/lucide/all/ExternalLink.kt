package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ExternalLink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,13.0f)
                lineTo(18.0f,19.0f)
                curveTo(18.0f,20.10457f,17.10457f,21.0f,16.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,8.0f)
                curveTo(3.0f,6.8954306f,3.8954306f,6.0f,5.0f,6.0f)
                lineTo(11.0f,6.0f)
            }
}

public val LucideIcons.All.ExternalLinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ExternalLink: ImageVector
    @Composable get() = ExternalLinkDefinition.asImageVector()
