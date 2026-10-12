package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                lineTo(20.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,15.0f)
                lineTo(20.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(14.0f,21.0f)
            }
}

public val LucideIcons.All.HashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hash: ImageVector
    @Composable get() = HashDefinition.asImageVector()
