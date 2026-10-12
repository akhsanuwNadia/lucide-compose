package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BedDouble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                lineTo(2.0f,12.0f)
                curveTo(2.0f,10.895431f,2.8954306f,10.0f,4.0f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(21.10457f,10.0f,22.0f,10.895431f,22.0f,12.0f)
                lineTo(22.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,4.8954306f,4.8954306f,4.0f,6.0f,4.0f)
                lineTo(18.0f,4.0f)
                curveTo(19.10457f,4.0f,20.0f,4.8954306f,20.0f,6.0f)
                lineTo(20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,4.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
}

public val LucideIcons.All.BedDoubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BedDouble: ImageVector
    @Composable get() = BedDoubleDefinition.asImageVector()
