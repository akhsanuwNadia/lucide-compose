package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                lineTo(20.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,15.0)
                lineTo(20.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(14.0,21.0)
            }
}

public val LucideIcons.All.HashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hash: ImageVector
    @Composable get() = HashDefinition.asImageVector()
