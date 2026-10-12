package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cloud") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.5f,19.0f)
                lineTo(9.0f,19.0f)
                curveTo(5.3957005f,18.999075f,2.3812678f,16.261406f,2.034305f,12.673845f)
                curveTo(1.6873423f,9.086285f,4.1212797f,5.8216887f,7.658602f,5.130078f)
                curveTo(11.195925f,4.4384675f,14.6802f,6.545946f,15.71f,10.0f)
                lineTo(17.5f,10.0f)
                curveTo(19.11249f,9.992788f,20.605585f,10.848904f,21.41392f,12.24417f)
                curveTo(22.222254f,13.639438f,22.222254f,15.360562f,21.41392f,16.755829f)
                curveTo(20.605585f,18.151096f,19.11249f,19.007212f,17.5f,19.0f)
                close()
            }
}

public val LucideIcons.All.CloudDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cloud: ImageVector
    @Composable get() = CloudDefinition.asImageVector()
