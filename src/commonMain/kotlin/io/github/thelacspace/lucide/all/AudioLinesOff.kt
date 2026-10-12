package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioLinesOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                verticalLineToRelative(1.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 14f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                verticalLineToRelative(.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(7.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                verticalLineToRelative(11f)
            }
}

public val LucideIcons.All.AudioLinesOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioLinesOff: ImageVector
    @Composable get() = AudioLinesOffDefinition.asImageVector()
