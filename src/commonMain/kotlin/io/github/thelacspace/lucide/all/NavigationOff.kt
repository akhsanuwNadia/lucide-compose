package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NavigationOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.43f,8.43f)
                lineTo(3.0f,11.0f)
                lineTo(11.0f,13.0f)
                lineTo(13.0f,21.0f)
                lineTo(15.57f,15.57f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.39f,11.73f)
                lineTo(22.0f,2.0f)
                lineTo(12.27f,6.61f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.NavigationOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NavigationOff: ImageVector
    @Composable get() = NavigationOffDefinition.asImageVector()
