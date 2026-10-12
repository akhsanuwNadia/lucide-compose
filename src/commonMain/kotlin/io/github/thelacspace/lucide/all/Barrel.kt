package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Barrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.997f, 21f)
                arcToRelative(2f, 2f, 0f, true, false, 15.25f, 15.25f)
                arcToRelative(0f, 000f, -16.16f, false, false, 0f, 00f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.54f, 16f)
                horizontalLineToRelative(16.914f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.54f, 8f)
                horizontalLineToRelative(16.914f)
            }
}

public val LucideIcons.All.BarrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Barrel: ImageVector
    @Composable get() = BarrelDefinition.asImageVector()
