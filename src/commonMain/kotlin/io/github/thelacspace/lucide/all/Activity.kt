package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Activity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(19.52f,12.0f)
                curveTo(18.621813f,11.998078f,17.83251f,12.595168f,17.59f,13.46f)
                lineTo(15.24f,21.82f)
                curveTo(15.208888f,21.926666f,15.111111f,21.999998f,15.0f,21.999998f)
                curveTo(14.888889f,21.999998f,14.791112f,21.926666f,14.76f,21.82f)
                lineTo(9.24f,2.18f)
                curveTo(9.208888f,2.0733337f,9.111111f,2.000001f,9.0f,2.000001f)
                curveTo(8.888889f,2.000001f,8.791112f,2.0733337f,8.76f,2.18f)
                lineTo(6.4100003f,10.54f)
                curveTo(6.168494f,11.401261f,5.3844767f,11.99744f,4.49f,12.0f)
                lineTo(2.0f,12.0f)
            }
}

public val LucideIcons.All.ActivityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Activity: ImageVector
    @Composable get() = ActivityDefinition.asImageVector()
