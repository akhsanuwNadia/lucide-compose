package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StepForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.029f,4.285f)
                curveTo(9.411137f,3.914277f,8.64162f,3.9045677f,8.014598f,4.259583f)
                curveTo(7.387577f,4.6145983f,6.999993f,5.2794504f,7.0f,6.0f)
                lineTo(7.0f,18.0f)
                curveTo(6.999993f,18.720549f,7.387577f,19.385403f,8.014598f,19.740417f)
                curveTo(8.64162f,20.095432f,9.411137f,20.085722f,10.029f,19.715f)
                lineTo(20.026001f,13.717f)
                curveTo(20.629688f,13.356315f,20.999588f,12.705079f,21.000202f,12.00185f)
                curveTo(21.000818f,11.298621f,20.632057f,10.64674f,20.029001f,10.285f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,4.0f)
                lineTo(3.0f,20.0f)
            }
}

public val LucideIcons.All.StepForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StepForward: ImageVector
    @Composable get() = StepForwardDefinition.asImageVector()
