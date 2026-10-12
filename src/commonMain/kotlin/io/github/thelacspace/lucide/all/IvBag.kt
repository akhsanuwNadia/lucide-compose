package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IvBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 11f)
                curveToRelative(.72f, .5f, 1.44f, 1f, 3f, 1f)
                curveToRelative(3f, 0f, 3f, -2f, 6f, -2f)
                curveToRelative(1.56f, 0f, 2.28f, .5f, 3f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.293f, 3f)
                curveToRelative(.453f, 0f, .887f, -.18f, 1.207f, -.5f)
                reflectiveCurveToRelative(.754f, -.5f, 1.207f, -.5f)
                horizontalLineToRelative(.586f)
                curveToRelative(.453f, 0f, .887f, .18f, 1.207f, .5f)
                reflectiveCurveToRelative(.754f, .5f, 1.207f, .5f)
                horizontalLineTo(16f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 11f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(8f, af, 2f, false, false, 01f, -2f)
            }
}

public val LucideIcons.All.IvBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IvBag: ImageVector
    @Composable get() = IvBagDefinition.asImageVector()
