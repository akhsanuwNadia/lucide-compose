package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RockingChair") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                lineTo(18.708f,20.416f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(8.333333f,23.0f,15.666667f,23.0f,21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,2.0f)
                lineTo(6.21f,11.633f)
                curveTo(6.482607f,12.45004f,7.2476826f,13.000782f,8.109f,13.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                lineTo(5.292f,20.416f)
            }
}

public val LucideIcons.All.RockingChairDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RockingChair: ImageVector
    @Composable get() = RockingChairDefinition.asImageVector()
