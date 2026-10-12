package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.998000144958496,9.003000259399414)
                curveTo(6.452209949493408,11.066740989685059,6.7292704582214355,13.967531204223633,8.637773513793945,15.701345443725586)
                curveTo(10.546276092529297,17.43515968322754,13.460267066955566,17.433338165283203,15.36660099029541,15.697139739990234)
                curveTo(17.272933959960938,13.960941314697266,17.546369552612305,11.059806823730469,15.998000144958496,8.998000144958496)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.SquarePowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePower: ImageVector
    @Composable get() = SquarePowerDefinition.asImageVector()
