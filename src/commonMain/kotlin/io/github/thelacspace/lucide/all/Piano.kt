package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Piano") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 13f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 13f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 13f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 11.5f)
                arcTo(3.5f, 3.5f, 0f, false, false, af, 3.52f)
                arcTo(3.52f, 0f, 01f, false, false, Af, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.PianoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Piano: ImageVector
    @Composable get() = PianoDefinition.asImageVector()
