package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Strikethrough") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                lineTo(9.0f,4.0f)
                curveTo(8.025818f,3.9994893f,7.1120443f,4.472038f,6.5493913f,5.267307f)
                curveTo(5.9867387f,6.062576f,5.8452725f,7.0815325f,6.17f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(16.202156f,12.009849f,17.982151f,13.797822f,17.982151f,16.0f)
                curveTo(17.982151f,18.202179f,16.202156f,19.990152f,14.0f,20.0f)
                lineTo(6.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
}

public val LucideIcons.All.StrikethroughDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Strikethrough: ImageVector
    @Composable get() = StrikethroughDefinition.asImageVector()
