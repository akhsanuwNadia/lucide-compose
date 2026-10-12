package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scale") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,8.0f)
                lineTo(22.0f,16.0f)
                curveTo(20.222221f,17.333334f,17.777779f,17.333334f,16.0f,16.0f)
                close()
                lineTo(19.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(4.0f,7.0f)
                curveTo(6.7903943f,7.0f,9.537888f,6.3131266f,12.0f,5.0f)
                curveTo(14.462112f,6.3131266f,17.209606f,7.0f,20.0f,7.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(8.0f,16.0f)
                curveTo(6.2222223f,17.333334f,3.7777777f,17.333334f,2.0f,16.0f)
                close()
                lineTo(5.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(17.0f,21.0f)
            }
}

public val LucideIcons.All.ScaleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scale: ImageVector
    @Composable get() = ScaleDefinition.asImageVector()
