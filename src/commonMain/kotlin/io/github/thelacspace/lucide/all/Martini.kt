package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Martini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                lineTo(4.207f, 4.207f)
                arcTo(.707f, .707f, 0f, false, true, 4.707f, 3f)
                horizontalLineToRelative(14.586f)
                arcToRelative(.707f, .707f, 0f, false, true, .5f, 1.207f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 22f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.MartiniDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Martini: ImageVector
    @Composable get() = MartiniDefinition.asImageVector()
