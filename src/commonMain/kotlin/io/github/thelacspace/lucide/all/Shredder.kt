package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shredder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,13.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.640058f,1.9984303f,15.254227f,2.2525938f,15.706f,2.7059999f)
                lineTo(19.294f,6.2939997f)
                curveTo(19.747406f,6.7457733f,20.00157f,7.359942f,20.0f,8.0f)
                lineTo(20.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(10.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,19.0f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,20.0f)
                lineTo(18.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                lineTo(6.0f,17.0f)
            }
}

public val LucideIcons.All.ShredderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shredder: ImageVector
    @Composable get() = ShredderDefinition.asImageVector()
