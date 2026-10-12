package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessKing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                curveTo(4.0f,18.89543f,4.8954306f,18.0f,6.0f,18.0f)
                lineTo(18.0f,18.0f)
                curveTo(19.10457f,18.0f,20.0f,18.89543f,20.0f,20.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(5.0f,22.0f)
                curveTo(4.4477153f,22.0f,4.0f,21.552284f,4.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.7f,18.0f)
                lineTo(5.7f,17.0f)
                curveTo(4.35f,15.682f,3.0f,14.09f,3.0f,12.0f)
                curveTo(2.999863f,9.257985f,5.2081223f,7.02742f,7.95f,7.0f)
                curveTo(9.533999f,7.0f,10.65f,7.455f,12.0f,8.818f)
                curveTo(13.35f,7.455f,14.466f,7.0f,16.05f,7.0f)
                curveTo(18.791878f,7.0274196f,21.000137f,9.257985f,21.0f,12.0f)
                curveTo(21.0f,14.082f,19.641f,15.673f,18.3f,17.0f)
                lineTo(17.3f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                lineTo(14.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,8.818f)
            }
}

public val LucideIcons.All.ChessKingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessKing: ImageVector
    @Composable get() = ChessKingDefinition.asImageVector()
