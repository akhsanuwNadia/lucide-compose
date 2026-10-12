package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CardSim") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.172f,2.0f)
                curveTo(14.70239f,2.0001132f,15.211015f,2.210901f,15.586f,2.586f)
                lineTo(19.414001f,6.414f)
                curveTo(19.789099f,6.7889857f,19.999887f,7.2976108f,20.0f,7.828f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(14.0f,10.0f)
                lineTo(16.0f,10.0f)
                lineTo(16.0f,18.0f)
                lineTo(14.0f,18.0f)
                lineTo(10.0f,18.0f)
                lineTo(8.0f,18.0f)
                lineTo(8.0f,10.0f)
                lineTo(10.0f,10.0f)
                close()
            }
}

public val LucideIcons.All.CardSimDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CardSim: ImageVector
    @Composable get() = CardSimDefinition.asImageVector()
