package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Loader") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.2f,7.8f)
                lineTo(19.1f,4.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.2f,16.2f)
                lineTo(19.1f,19.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.9f,19.1f)
                lineTo(7.8f,16.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(6.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.9f,4.9f)
                lineTo(7.8f,7.8f)
            }
}

public val LucideIcons.All.LoaderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Loader: ImageVector
    @Composable get() = LoaderDefinition.asImageVector()
