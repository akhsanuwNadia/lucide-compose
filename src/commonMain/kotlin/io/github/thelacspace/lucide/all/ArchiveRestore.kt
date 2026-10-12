package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArchiveRestore") { strokeWidth ->
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
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,8.0)
                lineTo(20.0,19.0)
                curveTo(20.0,20.104570388793945,19.104570388793945,21.0,18.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(12.0,12.0)
                lineTo(15.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,21.0)
            }
}

public val LucideIcons.All.ArchiveRestoreDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArchiveRestore: ImageVector
    @Composable get() = ArchiveRestoreDefinition.asImageVector()
