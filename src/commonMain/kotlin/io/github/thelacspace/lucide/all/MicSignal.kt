package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicSignal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 11f)
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

public val LucideIcons.All.MicSignalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicSignal: ImageVector
    @Composable get() = MicSignalDefinition.asImageVector()
