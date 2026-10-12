package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessBishop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,20.0f)
                curveTo(5.0f,18.89543f,5.8954306f,18.0f,7.0f,18.0f)
                lineTo(17.0f,18.0f)
                curveTo(18.10457f,18.0f,19.0f,18.89543f,19.0f,20.0f)
                lineTo(19.0f,21.0f)
                curveTo(19.0f,21.552284f,18.552284f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(5.4477153f,22.0f,5.0f,21.552284f,5.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(16.5f,17.385f,18.0f,15.539f,18.0f,13.077f)
                curveTo(18.0f,8.769f,14.5f,4.462f,12.0f,2.0f)
                curveTo(9.5f,4.462f,6.0f,8.77f,6.0f,13.077f)
                curveTo(6.0f,15.539f,7.5f,17.385f,9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(13.5f,9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(15.0f,2.0f)
            }
}

public val LucideIcons.All.ChessBishopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessBishop: ImageVector
    @Composable get() = ChessBishopDefinition.asImageVector()
