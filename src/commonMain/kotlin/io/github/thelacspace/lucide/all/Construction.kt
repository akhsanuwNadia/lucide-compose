package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Construction") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                lineTo(21.0f,6.0f)
                lineTo(22.0f,6.0f)
                lineTo(22.0f,14.0f)
                lineTo(21.0f,14.0f)
                lineTo(3.0f,14.0f)
                lineTo(2.0f,14.0f)
                lineTo(2.0f,6.0f)
                lineTo(3.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(17.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(7.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.0f)
                lineTo(2.3f,6.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                lineTo(21.7f,13.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(16.0f,14.0f)
            }
}

public val LucideIcons.All.ConstructionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Construction: ImageVector
    @Composable get() = ConstructionDefinition.asImageVector()
