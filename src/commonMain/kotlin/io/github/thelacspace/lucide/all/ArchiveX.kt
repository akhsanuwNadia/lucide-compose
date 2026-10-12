package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArchiveX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(21.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,8.0)
                lineTo(21.0,8.0)
                lineTo(3.0,8.0)
                lineTo(2.0,8.0)
                lineTo(2.0,3.0)
                lineTo(3.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(4.0,19.0)
                curveTo(4.0,20.104570388793945,4.895430564880371,21.0,6.0,21.0)
                lineTo(18.0,21.0)
                curveTo(19.104570388793945,21.0,20.0,20.104570388793945,20.0,19.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,17.0)
                lineTo(14.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,12.0)
                lineTo(14.5,17.0)
            }
}

public val LucideIcons.All.ArchiveXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArchiveX: ImageVector
    @Composable get() = ArchiveXDefinition.asImageVector()
