package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNotes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                curveTo(10.640058f,7.9984303f,11.254227f,8.252594f,11.706f,8.706f)
                lineTo(15.294001f,12.294001f)
                curveTo(15.747406f,12.745774f,16.00157f,13.359942f,16.0f,14.0f)
                lineTo(16.0f,20.0f)
                curveTo(16.0f,21.10457f,15.104569f,22.0f,14.0f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,10.0f)
                curveTo(2.0f,8.895431f,2.8954306f,8.0f,4.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(10.0f,13.0f)
                curveTo(10.0f,13.552285f,10.447715f,14.0f,11.0f,14.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.0f)
                curveTo(8.0f,2.8954306f,8.895431f,2.0f,10.0f,2.0f)
                lineTo(16.0f,2.0f)
                curveTo(16.640059f,1.9984305f,17.254227f,2.252594f,17.706f,2.7059999f)
                lineTo(21.293999f,6.2939997f)
                curveTo(21.747406f,6.7457733f,22.00157f,7.359942f,22.0f,8.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,15.104569f,21.10457f,16.0f,20.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,7.0f)
                curveTo(16.0f,7.5522847f,16.447716f,8.0f,17.0f,8.0f)
                lineTo(22.0f,8.0f)
            }
}

public val LucideIcons.All.StickyNotesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNotes: ImageVector
    @Composable get() = StickyNotesDefinition.asImageVector()
