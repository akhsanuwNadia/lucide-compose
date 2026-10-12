package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessKnight") { strokeWidth ->
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
                moveTo(16.5f,18.0f)
                curveTo(17.5f,16.0f,19.0f,13.0f,19.0f,9.0f)
                curveTo(19.0f,5.134007f,15.8659935f,2.0f,12.0f,2.0f)
                lineTo(6.635f,2.0f)
                curveTo(6.2470937f,2.0001454f,5.894266f,2.2246103f,5.729757f,2.5759056f)
                curveTo(5.565248f,2.9272006f,5.61874f,3.3419423f,5.867f,3.6399999f)
                lineTo(7.0f,5.0f)
                lineTo(4.6800003f,10.802f)
                curveTo(4.295271f,11.762972f,4.7073665f,12.858712f,5.63f,13.328f)
                lineTo(8.5f,14.784f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(16.425f,3.575f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,8.0f)
                lineTo(18.53f,6.4700003f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.713f,12.185f)
                lineTo(7.0f,18.0f)
            }
}

public val LucideIcons.All.ChessKnightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessKnight: ImageVector
    @Composable get() = ChessKnightDefinition.asImageVector()
