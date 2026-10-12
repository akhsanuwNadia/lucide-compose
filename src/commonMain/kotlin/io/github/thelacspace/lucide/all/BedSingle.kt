package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BedSingle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                lineTo(3.0f,12.0f)
                curveTo(3.0f,10.895431f,3.8954306f,10.0f,5.0f,10.0f)
                lineTo(19.0f,10.0f)
                curveTo(20.10457f,10.0f,21.0f,10.895431f,21.0f,12.0f)
                lineTo(21.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(5.0f,6.0f)
                curveTo(5.0f,4.8954306f,5.8954306f,4.0f,7.0f,4.0f)
                lineTo(17.0f,4.0f)
                curveTo(18.10457f,4.0f,19.0f,4.8954306f,19.0f,6.0f)
                lineTo(19.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,18.0f)
                lineTo(21.0f,18.0f)
            }
}

public val LucideIcons.All.BedSingleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BedSingle: ImageVector
    @Composable get() = BedSingleDefinition.asImageVector()
