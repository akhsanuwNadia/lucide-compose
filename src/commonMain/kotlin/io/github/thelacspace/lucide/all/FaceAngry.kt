package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceAngry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                verticalLineToRelative(-1.584f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                verticalLineToRelative(-1.584f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 17f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
}

public val LucideIcons.All.FaceAngryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceAngry: ImageVector
    @Composable get() = FaceAngryDefinition.asImageVector()
