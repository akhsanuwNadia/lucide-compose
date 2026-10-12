package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lambda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.380000114440918,10.0)
                lineTo(5.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,18.0)
                curveTo(19.0,19.104570388793945,18.104570388793945,20.0,17.0,20.0)
                curveTo(12.130000114440918,19.996999740600586,11.947999954223633,4.0,7.0,4.0)
                curveTo(5.895430564880371,4.0,5.0,4.895430564880371,5.0,6.0)
            }
}

public val LucideIcons.All.LambdaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lambda: ImageVector
    @Composable get() = LambdaDefinition.asImageVector()
