package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NavigationOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.430000305175781,8.430000305175781)
                lineTo(3.0,11.0)
                lineTo(11.0,13.0)
                lineTo(13.0,21.0)
                lineTo(15.569999694824219,15.569999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(17.389999389648438,11.729999542236328)
                lineTo(22.0,2.0)
                lineTo(12.270000457763672,6.610000133514404)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.NavigationOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NavigationOff: ImageVector
    @Composable get() = NavigationOffDefinition.asImageVector()
