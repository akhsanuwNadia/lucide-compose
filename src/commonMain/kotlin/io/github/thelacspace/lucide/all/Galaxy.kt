package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Galaxy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.005f, 15.108f)
                arcToRelative(5.041f, 6.52f, 28.25f, false, false, -6.217f, 5.041f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.997f, 8.891f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, 2.0f, 0f)
                arcToRelative(1.0f, 1.0f, 0f, true, false, -2.0f, 0f)
            }
}

public val LucideIcons.All.GalaxyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Galaxy: ImageVector
    @Composable get() = GalaxyDefinition.asImageVector()
