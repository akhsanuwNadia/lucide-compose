package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15.5f, 15.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.063f, 11.525f)
                lineToRelative(1.777f, -1.731f)
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
                arcToRelative(2.1f, 2.1f, 0f, false, true, .987f, -.243f)
                arcToRelative(2f, 2f, 0f, false, true, .132f, .004f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.5f, 15.5f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.StarXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarX: ImageVector
    @Composable get() = StarXDefinition.asImageVector()
