package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lambda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.38f,10.0f)
                lineTo(5.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,18.0f)
                curveTo(19.0f,19.10457f,18.10457f,20.0f,17.0f,20.0f)
                curveTo(12.13f,19.997f,11.948f,4.0f,7.0f,4.0f)
                curveTo(5.8954306f,4.0f,5.0f,4.8954306f,5.0f,6.0f)
            }
}

public val LucideIcons.All.LambdaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lambda: ImageVector
    @Composable get() = LambdaDefinition.asImageVector()
