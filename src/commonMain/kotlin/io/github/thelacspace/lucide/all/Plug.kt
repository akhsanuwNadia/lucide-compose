package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                lineTo(15.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,8.0f)
                curveTo(17.552284f,8.0f,18.0f,8.447715f,18.0f,9.0f)
                lineTo(18.0f,13.0f)
                curveTo(18.0f,15.209139f,16.209139f,17.0f,14.0f,17.0f)
                lineTo(10.0f,17.0f)
                curveTo(7.790861f,17.0f,6.0f,15.209139f,6.0f,13.0f)
                lineTo(6.0f,9.0f)
                curveTo(6.0f,8.447715f,6.4477153f,8.0f,7.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,8.0f)
                lineTo(9.0f,2.0f)
            }
}

public val LucideIcons.All.PlugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plug: ImageVector
    @Composable get() = PlugDefinition.asImageVector()
