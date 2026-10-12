package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RussianRuble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                lineTo(14.0f,11.0f)
                curveTo(16.202156f,10.990151f,17.982151f,9.202178f,17.982151f,7.0f)
                curveTo(17.982151f,4.7978215f,16.202156f,3.0098484f,14.0f,3.0f)
                lineTo(9.0f,3.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                lineTo(14.0f,15.0f)
            }
}

public val LucideIcons.All.RussianRubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RussianRuble: ImageVector
    @Composable get() = RussianRubleDefinition.asImageVector()
