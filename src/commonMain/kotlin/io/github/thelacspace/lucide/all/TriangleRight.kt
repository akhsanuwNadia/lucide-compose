package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                curveTo(22.0,19.104570388793945,21.104570388793945,20.0,20.0,20.0)
                lineTo(3.0,20.0)
                curveTo(1.899999976158142,20.0,1.7000000476837158,19.399999618530273,2.5999999046325684,18.700000762939453)
                lineTo(20.399999618530273,4.300000190734863)
                curveTo(21.299999237060547,3.6000001430511475,22.0,3.9000000953674316,22.0,5.0)
                close()
            }
}

public val LucideIcons.All.TriangleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleRight: ImageVector
    @Composable get() = TriangleRightDefinition.asImageVector()
