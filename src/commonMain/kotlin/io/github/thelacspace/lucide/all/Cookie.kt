package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cookie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.496f, 2f)
                curveToRelative(.324f, -.016f, .558f, .292f, .529f, .615f)
                arcToRelative(4f, 4f, 0f, false, false, .713f, .713f)
                arcToRelative(0f, 01.758f, .757f, false, false, 0f, 004.366f)
                arcToRelative(4.237f, cf, .323f, false, false, .204f, .614f)
                arcToRelative(.527f, af, 10f, false, false, 01f, -2.915f)
                arcToRelative(6.566f, Af, 1f, true, false, 114.93f, 4.918f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 3f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 4f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 14f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 8f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.CookieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cookie: ImageVector
    @Composable get() = CookieDefinition.asImageVector()
