package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioLinesX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                verticalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                verticalLineToRelative(6.35f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 17f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(8.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 17f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                verticalLineToRelative(11f)
            }
}

public val LucideIcons.All.AudioLinesXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioLinesX: ImageVector
    @Composable get() = AudioLinesXDefinition.asImageVector()
