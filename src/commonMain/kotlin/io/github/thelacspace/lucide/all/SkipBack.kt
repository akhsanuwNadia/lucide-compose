package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SkipBack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.971f,4.285f)
                curveTo(18.588865f,3.9142776f,19.358381f,3.9045684f,19.985401f,4.2595835f)
                curveTo(20.612423f,4.6145988f,21.000008f,5.279451f,21.0f,6.0f)
                lineTo(21.0f,18.0f)
                curveTo(21.000008f,18.720549f,20.612423f,19.3854f,19.985401f,19.740416f)
                curveTo(19.358381f,20.095432f,18.588865f,20.085722f,17.971f,19.715f)
                lineTo(7.974001f,13.717f)
                curveTo(7.370314f,13.356315f,7.0004144f,12.705079f,6.9997997f,12.00185f)
                curveTo(6.999185f,11.298621f,7.367946f,10.64674f,7.971001f,10.285f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                lineTo(3.0f,4.0f)
            }
}

public val LucideIcons.All.SkipBackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SkipBack: ImageVector
    @Composable get() = SkipBackDefinition.asImageVector()
