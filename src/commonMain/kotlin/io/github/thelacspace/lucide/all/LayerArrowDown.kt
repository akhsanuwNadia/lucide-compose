package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayerArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 10f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10f)
                arcToRelative(1f, 1f, 0f, true, false, .92f, lf)
            }
            lucidePath(strokeWidth) {
                moveTo(22.017f, 10.005f)
                arcToRelative(1f, 1f, 0f, false, false, -.916f, lf)
                arcToRelative(-8.59f, -3.91f, af, false, false, 0f, 00f)
                arcToRelative(-1.66f, .001f, Lf, false, false, af, 1f)
                arcToRelative(1f, 0f, 00f, false, true, lf, 5.093f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 17f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
}

public val LucideIcons.All.LayerArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayerArrowDown: ImageVector
    @Composable get() = LayerArrowDownDefinition.asImageVector()
