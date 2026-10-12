package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaperBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.364f, 3.848f)
                curveTo(4f, 6f, 3f, 9.652f, 3f, 12.652f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 14f)
                arcToRelative(2f, 2f, 0f, false, false, vf, -5f)
                curveToRelative(0f, -2.334f, -1.816f, -4.668f, -2.622f, -7.002f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                horizontalLineToRelative(11.379f)
                arcToRelative(2f, 2f, 0f, false, true, lf, .723f)
                arcToRelative(1.447f, Af, 1f, true, false, 0119.997f, 7f)
                horizontalLineToRelative(-8.525f)
                arcToRelative(2f, 2f, 0f, true, false, -1.106f, Lf)
                arcToRelative(8.79f, 4.105f, af, false, false, 0f, 10f)
                arcToRelative(-3.579f, 1.789f, lf, false, false, Af, 5f)
            }
}

public val LucideIcons.All.PaperBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaperBag: ImageVector
    @Composable get() = PaperBagDefinition.asImageVector()
