package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trailer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 11.341f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 13f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 17f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(4f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 15f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, true, false, 1f, Hf)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 11.341f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.TrailerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trailer: ImageVector
    @Composable get() = TrailerDefinition.asImageVector()
