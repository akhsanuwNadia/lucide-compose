package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Subscript") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(4.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,19.0f)
                lineTo(16.0f,19.0f)
                curveTo(16.0f,17.5f,16.44f,17.0f,17.5f,16.5f)
                curveTo(18.56f,16.0f,20.0f,15.33f,20.0f,14.0f)
                curveTo(20.0f,13.53f,19.83f,13.07f,19.52f,12.71f)
                curveTo(18.860209f,11.962929f,17.76764f,11.779445f,16.900002f,12.27f)
                curveTo(16.480001f,12.51f,16.160002f,12.89f,16.000002f,13.34f)
            }
}

public val LucideIcons.All.SubscriptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Subscript: ImageVector
    @Composable get() = SubscriptDefinition.asImageVector()
