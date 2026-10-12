package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Construction") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                lineTo(21.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,14.0)
                lineTo(21.0,14.0)
                lineTo(3.0,14.0)
                lineTo(2.0,14.0)
                lineTo(2.0,6.0)
                lineTo(3.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(17.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(7.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.0)
                lineTo(2.299999952316284,6.300000190734863)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(21.700000762939453,13.699999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(16.0,14.0)
            }
}

public val LucideIcons.All.ConstructionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Construction: ImageVector
    @Composable get() = ConstructionDefinition.asImageVector()
