package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IceCreamCone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                lineTo(11.08f,21.35f)
                curveTo(11.237088f,21.718754f,11.599181f,21.958082f,12.0f,21.958082f)
                curveTo(12.400819f,21.958082f,12.762912f,21.718754f,12.92f,21.35f)
                lineTo(17.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,7.0f)
                curveTo(16.98769f,4.2473044f,14.752723f,2.0223107f,12.0f,2.0223107f)
                curveTo(9.247277f,2.0223107f,7.0123105f,4.2473044f,7.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,7.0f)
                curveTo(18.101078f,7.0049243f,18.991076f,7.898911f,18.991076f,9.0f)
                curveTo(18.991076f,10.1010895f,18.101078f,10.995076f,17.0f,11.0f)
                lineTo(7.0f,11.0f)
                curveTo(5.898922f,10.995076f,5.0089245f,10.1010895f,5.0089245f,9.0f)
                curveTo(5.0089245f,7.898911f,5.898922f,7.0049243f,7.0f,7.0f)
            }
}

public val LucideIcons.All.IceCreamConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IceCreamCone: ImageVector
    @Composable get() = IceCreamConeDefinition.asImageVector()
