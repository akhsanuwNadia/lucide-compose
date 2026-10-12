package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.688f, 14f)
                arcToRelative(2.1f, 2.1f, 0f, false, true, .416f, -.568f)
                lineToRelative(3.736f, -3.638f)
                arcToRelative(.53f, .53f, 0f, false, false, -.294f, -.905f)
                lineToRelative(-5.166f, -.755f)
                arcToRelative(2.1f, 2.1f, 0f, false, true, -1.595f, -1.16f)
                lineToRelative(-2.31f, -4.68f)
                arcToRelative(.53f, .53f, 0f, false, false, -.95f, .001f)
                lineTo(9.216f, 6.974f)
                arcToRelative(2.1f, 2.1f, 0f, false, true, -1.597f, 1.16f)
                lineToRelative(-5.165f, .755f)
                arcToRelative(.53f, .53f, 0f, false, false, -.294f, .906f)
                lineToRelative(3.736f, 3.637f)
                arcToRelative(2.1f, 2.1f, 0f, false, true, .611f, 1.879f)
                lineToRelative(-.88f, 5.139f)
                arcToRelative(.53f, .53f, 0f, false, false, .769f, .56f)
                lineToRelative(4.617f, -2.428f)
                lineToRelative(.027f, -.014f)
            }
}

public val LucideIcons.All.StarMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarMinus: ImageVector
    @Composable get() = StarMinusDefinition.asImageVector()
