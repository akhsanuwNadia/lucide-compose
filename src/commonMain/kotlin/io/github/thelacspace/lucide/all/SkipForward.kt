package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SkipForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,4.0f)
                lineTo(21.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.029f,4.285f)
                curveTo(5.4111357f,3.9142773f,4.641619f,3.904568f,4.0145984f,4.2595835f)
                curveTo(3.3875773f,4.6145988f,2.999993f,5.279451f,3.0f,6.0f)
                lineTo(3.0f,18.0f)
                curveTo(2.9999928f,18.720549f,3.387577f,19.385403f,4.0145984f,19.740417f)
                curveTo(4.6416197f,20.095432f,5.411136f,20.085722f,6.0290003f,19.715f)
                lineTo(16.026001f,13.717f)
                curveTo(16.629688f,13.356315f,16.999588f,12.705079f,17.000202f,12.00185f)
                curveTo(17.000818f,11.298621f,16.632057f,10.64674f,16.029001f,10.285f)
                close()
            }
}

public val LucideIcons.All.SkipForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SkipForward: ImageVector
    @Composable get() = SkipForwardDefinition.asImageVector()
