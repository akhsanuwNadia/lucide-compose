package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cannabis") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                curveTo(5.5f,12.0f,2.5f,13.5f,2.0f,15.0f)
                curveTo(5.5f,16.5f,8.0f,16.0f,8.0f,16.0f)
                curveTo(6.5f,17.5f,6.0f,19.5f,6.0f,21.0f)
                curveTo(8.5f,21.0f,10.5f,19.5f,12.0f,18.0f)
                curveTo(13.5f,19.5f,15.5f,21.0f,18.0f,21.0f)
                curveTo(18.0f,19.5f,17.5f,17.5f,16.0f,16.0f)
                curveTo(16.0f,16.0f,18.5f,16.5f,22.0f,15.0f)
                curveTo(21.5f,13.5f,18.5f,12.0f,17.0f,12.0f)
                curveTo(18.5f,11.0f,21.0f,8.0f,21.0f,6.0f)
                curveTo(18.5f,6.0f,15.5f,7.5f,14.0f,9.0f)
                curveTo(14.0f,6.5f,13.5f,4.0f,12.0f,2.0f)
                curveTo(10.5f,4.0f,10.0f,6.5f,10.0f,9.0f)
                curveTo(8.5f,7.5f,5.5f,6.0f,3.0f,6.0f)
                curveTo(3.0f,8.0f,5.5f,11.0f,7.0f,12.0f)
            }
}

public val LucideIcons.All.CannabisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cannabis: ImageVector
    @Composable get() = CannabisDefinition.asImageVector()
