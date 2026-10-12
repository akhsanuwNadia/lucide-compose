package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flame") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                quadTo(13.0,7.0,16.0,9.5)
                quadTo(19.0,12.0,19.0,15.0)
                curveTo(18.982765197753906,18.85377311706543,15.853812217712402,21.968765258789062,12.0,21.968765258789062)
                curveTo(8.146187782287598,21.968765258789062,5.017234802246094,18.85377311706543,5.0,15.0)
                curveTo(5.0,13.9181489944458,5.350889205932617,12.865480422973633,6.0,12.0)
                curveTo(6.006155014038086,13.376347541809082,7.12363862991333,14.488844871520996,8.5,14.488844871520996)
                curveTo(9.876361846923828,14.488844871520996,10.993844985961914,13.376347541809082,11.0,12.0)
                curveTo(11.0,10.0,9.5,9.0,9.5,7.0)
                quadTo(9.5,5.0,12.0,3.0)
            }
}

public val LucideIcons.All.FlameDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flame: ImageVector
    @Composable get() = FlameDefinition.asImageVector()
