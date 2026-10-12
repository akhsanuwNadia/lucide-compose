package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(12.0f,4.0f)
                lineTo(18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,21.0f)
                curveTo(5.1f,21.0f,5.1f,20.0f,6.3f,20.0f)
                curveTo(7.5000005f,20.0f,7.4f,21.0f,8.6f,21.0f)
                curveTo(9.700001f,21.0f,9.700001f,20.0f,10.900001f,20.0f)
                curveTo(12.000001f,20.0f,12.000001f,21.0f,13.200001f,21.0f)
                curveTo(14.300001f,21.0f,14.300001f,20.0f,15.500001f,20.0f)
                curveTo(16.6f,20.0f,16.6f,21.0f,17.800001f,21.0f)
                curveTo(18.900002f,21.0f,18.900002f,20.0f,20.1f,20.0f)
            }
}

public val LucideIcons.All.SpellCheck2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck2: ImageVector
    @Composable get() = SpellCheck2Definition.asImageVector()
