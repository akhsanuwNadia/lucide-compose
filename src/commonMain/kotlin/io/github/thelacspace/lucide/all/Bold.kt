package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bold") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(15.0f,12.0f)
                curveTo(17.202156f,12.009849f,18.982151f,13.797822f,18.982151f,16.0f)
                curveTo(18.982151f,18.202179f,17.202156f,19.990152f,15.0f,20.0f)
                lineTo(7.0f,20.0f)
                curveTo(6.4477153f,20.0f,6.0f,19.552284f,6.0f,19.0f)
                lineTo(6.0f,5.0f)
                curveTo(6.0f,4.4477153f,6.4477153f,4.0f,7.0f,4.0f)
                lineTo(14.0f,4.0f)
                curveTo(16.202156f,4.0098486f,17.982151f,5.7978215f,17.982151f,8.0f)
                curveTo(17.982151f,10.202178f,16.202156f,11.990151f,14.0f,12.0f)
            }
}

public val LucideIcons.All.BoldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bold: ImageVector
    @Composable get() = BoldDefinition.asImageVector()
