package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Panda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25f, 17.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 18f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 12f)
                lineToRelative(2f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.902f, 6.599f)
                arcToRelative(8f, 8f, 0f, false, false, -.5f, -.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14.5f)
                curveTo(2f, 19.47f, 6.48f, 22f, 12f, 22f)
                reflectiveCurveToRelative(10f, -2.53f, 10f, -7.5f)
                arcToRelative(10f, 10f, 0f, false, false, -1.3f, -4.83f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -7.05f, -5.5f)
                arcToRelative(8f, 8f, 0f, false, false, -3.3f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, true, false, -7.04f, 5.5f)
                arcTo(10f, 10f, 0f, false, false, 2f, 14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.099f, 6.599f)
                arcToRelative(8f, 8f, 0f, false, true, .5f, -.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 12f)
                lineToRelative(-2f, 2f)
            }
}

public val LucideIcons.All.PandaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Panda: ImageVector
    @Composable get() = PandaDefinition.asImageVector()
