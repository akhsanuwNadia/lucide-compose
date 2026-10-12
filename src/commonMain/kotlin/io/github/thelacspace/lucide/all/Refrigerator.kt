package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Refrigerator") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,6.0)
                curveTo(5.0,3.790860891342163,6.790861129760742,2.0,9.0,2.0)
                lineTo(15.0,2.0)
                curveTo(17.209138870239258,2.0,19.0,3.790860891342163,19.0,6.0)
                lineTo(19.0,20.0)
                curveTo(19.0,21.104570388793945,18.104570388793945,22.0,17.0,22.0)
                lineTo(7.0,22.0)
                curveTo(5.895430564880371,22.0,5.0,21.104570388793945,5.0,20.0)
                lineTo(5.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,7.0)
                lineTo(15.0,13.0)
            }
}

public val LucideIcons.All.RefrigeratorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Refrigerator: ImageVector
    @Composable get() = RefrigeratorDefinition.asImageVector()
