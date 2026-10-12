package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading6") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(4.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.0f)
                curveTo(16.996796f,16.716661f,17.37729f,17.38026f,17.99741f,17.73952f)
                curveTo(18.617527f,18.09878f,19.382473f,18.09878f,20.00259f,17.73952f)
                curveTo(20.62271f,17.38026f,21.003204f,16.716661f,21.0f,16.0f)
                curveTo(21.003204f,15.283339f,20.62271f,14.61974f,20.00259f,14.26048f)
                curveTo(19.382473f,13.901221f,18.617527f,13.901221f,17.99741f,14.26048f)
                curveTo(17.37729f,14.61974f,16.996796f,15.283339f,17.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                curveTo(18.0f,12.0f,17.0f,13.5f,17.0f,16.0f)
            }
}

public val LucideIcons.All.Heading6Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading6: ImageVector
    @Composable get() = Heading6Definition.asImageVector()
