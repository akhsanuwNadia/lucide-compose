package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Piano") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,13.0f)
                lineTo(10.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,13.0f)
                lineTo(18.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,11.5f)
                curveTo(22.0f,9.567003f,20.432997f,8.0f,18.5f,8.0f)
                curveTo(17.145649f,7.9992685f,15.911833f,7.221572f,15.327f,6.0f)
                curveTo(13.925577f,3.0393045f,10.658374f,1.4463612f,7.4627175f,2.1657255f)
                curveTo(4.2670617f,2.8850899f,1.9975842f,5.724378f,2.0f,9.0f)
                lineTo(2.0f,19.0f)
                curveTo(2.0f,20.10457f,2.8954306f,21.0f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(21.10457f,21.0f,22.0f,20.10457f,22.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(6.0f,17.0f)
            }
}

public val LucideIcons.All.PianoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Piano: ImageVector
    @Composable get() = PianoDefinition.asImageVector()
