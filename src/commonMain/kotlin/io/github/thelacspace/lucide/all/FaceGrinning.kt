package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceGrinning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.084f, 14.302f)
                arcToRelative(5.12f, 5.12f, 0f, false, false, .24f, .24f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.FaceGrinningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceGrinning: ImageVector
    @Composable get() = FaceGrinningDefinition.asImageVector()
