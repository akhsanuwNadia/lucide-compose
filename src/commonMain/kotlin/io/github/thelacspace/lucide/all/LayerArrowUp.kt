package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayerArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.674f,10.774f)
                lineTo(2.58f,13.09f)
                curveTo(2.222251f,13.251951f,1.9924058f,13.608301f,1.9924058f,14.001f)
                curveTo(1.9924058f,14.3937f,2.222251f,14.75005f,2.58f,14.912001f)
                lineTo(11.18f,18.822f)
                curveTo(11.704372f,19.059446f,12.305628f,19.059446f,12.83f,18.822f)
                lineTo(21.41f,14.922001f)
                curveTo(21.771677f,14.759435f,22.003132f,14.398521f,22.0f,14.002001f)
                curveTo(22.00393f,13.604757f,21.772346f,13.242859f,21.41f,13.080001f)
                lineTo(16.332f,10.772001f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,7.0f)
                lineTo(12.0f,4.0f)
                lineTo(15.0f,7.0f)
            }
}

public val LucideIcons.All.LayerArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayerArrowUp: ImageVector
    @Composable get() = LayerArrowUpDefinition.asImageVector()
