package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.998f,9.003f)
                curveTo(6.45221f,11.066741f,6.7292705f,13.967531f,8.6377735f,15.701345f)
                curveTo(10.546276f,17.43516f,13.460267f,17.433338f,15.366601f,15.69714f)
                curveTo(17.272934f,13.960941f,17.54637f,11.059807f,15.998f,8.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.SquarePowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePower: ImageVector
    @Composable get() = SquarePowerDefinition.asImageVector()
