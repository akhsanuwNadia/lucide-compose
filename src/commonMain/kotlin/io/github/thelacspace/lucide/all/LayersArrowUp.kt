package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.002f)
                curveTo(1.9990336f,17.392572f,2.225546f,17.747961f,2.58f,17.912f)
                lineTo(11.18f,21.822f)
                curveTo(11.704372f,22.059446f,12.305628f,22.059446f,12.83f,21.822f)
                lineTo(21.41f,17.922f)
                curveTo(21.771677f,17.759436f,22.003132f,17.398521f,22.0f,17.002f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.674f,8.774f)
                lineTo(2.58f,11.09f)
                curveTo(2.222251f,11.251951f,1.9924058f,11.608301f,1.9924058f,12.001f)
                curveTo(1.9924058f,12.3937f,2.222251f,12.75005f,2.58f,12.912001f)
                lineTo(11.18f,16.822f)
                curveTo(11.704372f,17.059446f,12.305628f,17.059446f,12.83f,16.822f)
                lineTo(21.41f,12.922001f)
                curveTo(21.771677f,12.759435f,22.003132f,12.398521f,22.0f,12.002001f)
                curveTo(22.00393f,11.604757f,21.772346f,11.242859f,21.41f,11.080001f)
                lineTo(16.332f,8.772001f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                lineTo(12.0f,2.0f)
                lineTo(15.0f,5.0f)
            }
}

public val LucideIcons.All.LayersArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersArrowUp: ImageVector
    @Composable get() = LayersArrowUpDefinition.asImageVector()
