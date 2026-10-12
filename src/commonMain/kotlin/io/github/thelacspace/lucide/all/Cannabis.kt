package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cannabis") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                curveTo(5.5,12.0,2.5,13.5,2.0,15.0)
                curveTo(5.5,16.5,8.0,16.0,8.0,16.0)
                curveTo(6.5,17.5,6.0,19.5,6.0,21.0)
                curveTo(8.5,21.0,10.5,19.5,12.0,18.0)
                curveTo(13.5,19.5,15.5,21.0,18.0,21.0)
                curveTo(18.0,19.5,17.5,17.5,16.0,16.0)
                curveTo(16.0,16.0,18.5,16.5,22.0,15.0)
                curveTo(21.5,13.5,18.5,12.0,17.0,12.0)
                curveTo(18.5,11.0,21.0,8.0,21.0,6.0)
                curveTo(18.5,6.0,15.5,7.5,14.0,9.0)
                curveTo(14.0,6.5,13.5,4.0,12.0,2.0)
                curveTo(10.5,4.0,10.0,6.5,10.0,9.0)
                curveTo(8.5,7.5,5.5,6.0,3.0,6.0)
                curveTo(3.0,8.0,5.5,11.0,7.0,12.0)
            }
}

public val LucideIcons.All.CannabisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cannabis: ImageVector
    @Composable get() = CannabisDefinition.asImageVector()
