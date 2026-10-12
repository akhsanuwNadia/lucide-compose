package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LogOut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(21.0,12.0)
                lineTo(16.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(9.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(9.0,3.0)
            }
}

public val LucideIcons.All.LogOutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LogOut: ImageVector
    @Composable get() = LogOutDefinition.asImageVector()
