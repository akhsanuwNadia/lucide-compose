package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Broccoli") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 13f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.606f, 14.204f)
                curveToRelative(-3.5f, 1.5f, -5.899f, 4.503f, -8.899f, 7.503f)
                arcTo(1f, 1f, 0f, false, false, cf, -2f)
                arcTo(0f, -4f, -2f, false, false, af, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.573f, 14.737f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.14f, 10.907f)
                arcToRelative(4f, 4f, 0f, false, false, Af, 4f)
            }
}

public val LucideIcons.All.BroccoliDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Broccoli: ImageVector
    @Composable get() = BroccoliDefinition.asImageVector()
