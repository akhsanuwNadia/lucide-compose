package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,9.8f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.640058f,1.9984303f,15.254227f,2.2525938f,15.706f,2.7059999f)
                lineTo(19.294f,6.2939997f)
                curveTo(19.747406f,6.7457733f,20.00157f,7.359942f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(15.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(9.0f,15.0f)
                curveTo(8.995076f,13.898922f,8.1010895f,13.0089245f,7.0f,13.0089245f)
                curveTo(5.898911f,13.0089245f,5.0049243f,13.898922f,5.0f,15.0f)
                lineTo(5.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,17.0f)
                lineTo(10.0f,17.0f)
                lineTo(11.0f,17.0f)
                lineTo(11.0f,22.0f)
                lineTo(10.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(3.0f,22.0f)
                lineTo(3.0f,17.0f)
                lineTo(4.0f,17.0f)
                close()
            }
}

public val LucideIcons.All.FileLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileLock: ImageVector
    @Composable get() = FileLockDefinition.asImageVector()
