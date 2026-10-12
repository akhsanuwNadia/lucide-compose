package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Import") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                lineTo(12.0,15.0)
                lineTo(16.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(4.0,5.0)
                curveTo(2.895430564880371,5.0,2.0,5.895430564880371,2.0,7.0)
                lineTo(2.0,17.0)
                curveTo(2.0,18.104570388793945,2.895430564880371,19.0,4.0,19.0)
                lineTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,18.104570388793945,22.0,17.0)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                lineTo(16.0,5.0)
            }
}

public val LucideIcons.All.ImportDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Import: ImageVector
    @Composable get() = ImportDefinition.asImageVector()
