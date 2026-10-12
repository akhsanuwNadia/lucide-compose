package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.037f,4.688f)
                curveTo(3.9562387f,4.5016165f,3.9975429f,4.2848105f,4.1411767f,4.1411767f)
                curveTo(4.2848105f,3.9975429f,4.5016165f,3.9562387f,4.688f,4.037f)
                lineTo(20.688f,10.537001f)
                curveTo(20.887531f,10.618292f,21.012548f,10.818256f,20.998247f,11.033236f)
                curveTo(20.983946f,11.248216f,20.83354f,11.429857f,20.625f,11.484001f)
                lineTo(14.500999f,13.064001f)
                curveTo(13.796329f,13.245159f,13.245628f,13.79471f,13.063f,14.499001f)
                lineTo(11.483999f,20.625f)
                curveTo(11.429855f,20.83354f,11.248214f,20.983946f,11.033234f,20.998247f)
                curveTo(10.818254f,21.012548f,10.61829f,20.887531f,10.536999f,20.688f)
                close()
            }
}

public val LucideIcons.All.MousePointer2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer2: ImageVector
    @Composable get() = MousePointer2Definition.asImageVector()
