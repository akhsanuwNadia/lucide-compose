package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNoteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(15.0f,8.0f)
                curveTo(15.0f,8.552285f,15.447715f,9.0f,16.0f,9.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.586f,3.586f)
                curveTo(3.2109013f,3.9609854f,3.0001132f,4.46961f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(19.53039f,20.999886f,20.039015f,20.789099f,20.414f,20.414f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656f,3.0f)
                lineTo(15.0f,3.0f)
                curveTo(15.640058f,2.9984305f,16.254227f,3.252594f,16.706f,3.7059999f)
                lineTo(20.293999f,7.2939997f)
                curveTo(20.747406f,7.7457733f,21.00157f,8.3599415f,21.0f,9.0f)
                lineTo(21.0f,15.344f)
            }
}

public val LucideIcons.All.StickyNoteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNoteOff: ImageVector
    @Composable get() = StickyNoteOffDefinition.asImageVector()
