package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Soup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.248f, 3f)
                curveToRelative(.273f, .1f, .808f, .53f, .747f, 1.36f)
                curveToRelative(-.05f, .83f, -.938f, 1.2f, -.989f, 2.02f)
                curveToRelative(-.06f, .78f, .333f, 1.24f, .727f, 1.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.252f, 3f)
                curveToRelative(.268f, .1f, .794f, .53f, .745f, 1.36f)
                curveToRelative(-.06f, .83f, -.923f, 1.2f, -.993f, 2.02f)
                curveToRelative(-.05f, .78f, .338f, 1.24f, .725f, 1.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f, 12f)
                lineTo(22f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, 1.133f, Af)
                arcToRelative(9f, 9f, 0f, false, false, af, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.252f, 3f)
                curveToRelative(.268f, .1f, .794f, .53f, .745f, 1.36f)
                curveToRelative(-.06f, .83f, -.923f, 1.2f, -.993f, 2.02f)
                curveToRelative(-.05f, .78f, .338f, 1.24f, .735f, 1.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
}

public val LucideIcons.All.SoupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Soup: ImageVector
    @Composable get() = SoupDefinition.asImageVector()
