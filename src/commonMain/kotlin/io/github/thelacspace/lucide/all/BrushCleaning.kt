package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrushCleaning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                lineTo(15.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                curveTo(19.552284f,14.0f,20.0f,13.552285f,20.0f,13.0f)
                lineTo(20.0f,12.0f)
                curveTo(20.0f,10.895431f,19.10457f,10.0f,18.0f,10.0f)
                lineTo(15.0f,10.0f)
                curveTo(14.447715f,10.0f,14.0f,9.552285f,14.0f,9.0f)
                lineTo(14.0f,4.0f)
                curveTo(13.995076f,2.8989217f,13.1010895f,2.0089242f,12.0f,2.0089242f)
                curveTo(10.8989105f,2.0089242f,10.004924f,2.8989217f,10.0f,4.0f)
                lineTo(10.0f,9.0f)
                curveTo(10.0f,9.552285f,9.552285f,10.0f,9.0f,10.0f)
                lineTo(6.0f,10.0f)
                curveTo(4.8954306f,10.0f,4.0f,10.895431f,4.0f,12.0f)
                lineTo(4.0f,13.0f)
                curveTo(4.0f,13.552285f,4.4477153f,14.0f,5.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(5.0f,14.0f)
                lineTo(3.027f,20.767f)
                curveTo(2.955631f,21.064875f,3.0247147f,21.379026f,3.2144637f,21.61948f)
                curveTo(3.4042127f,21.859932f,3.693696f,22.00016f,4.0f,22.0f)
                lineTo(20.0f,22.0f)
                curveTo(20.306305f,22.00016f,20.595787f,21.859932f,20.785536f,21.619478f)
                curveTo(20.975285f,21.379026f,21.044369f,21.064875f,20.973f,20.767f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(9.0f,18.0f)
            }
}

public val LucideIcons.All.BrushCleaningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrushCleaning: ImageVector
    @Composable get() = BrushCleaningDefinition.asImageVector()
