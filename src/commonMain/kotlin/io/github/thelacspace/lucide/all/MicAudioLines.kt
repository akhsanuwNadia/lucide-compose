package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicAudioLines") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                verticalLineToRelative(2.341f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 5f)
                verticalLineToRelative(.341f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(13f)
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
                moveTo(6f, 6f)
                verticalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f, 9.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-0.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.MicAudioLinesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicAudioLines: ImageVector
    @Composable get() = MicAudioLinesDefinition.asImageVector()
