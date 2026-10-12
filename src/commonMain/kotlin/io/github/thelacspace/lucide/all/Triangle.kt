package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Triangle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.73f,4.0f)
                curveTo(13.372202f,3.3831956f,12.713068f,3.0035436f,12.0f,3.0035436f)
                curveTo(11.286931f,3.0035436f,10.627797f,3.3831956f,10.2699995f,4.0f)
                lineTo(2.2699995f,18.0f)
                curveTo(1.9129165f,18.618484f,1.9127209f,19.380445f,2.2694864f,19.999113f)
                curveTo(2.626252f,20.61778f,3.285835f,20.999268f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.714165f,20.999268f,21.373747f,20.61778f,21.730513f,19.999113f)
                curveTo(22.087278f,19.380444f,22.087082f,18.618484f,21.73f,18.0f)
                close()
            }
}

public val LucideIcons.All.TriangleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Triangle: ImageVector
    @Composable get() = TriangleDefinition.asImageVector()
