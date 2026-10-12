package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Container") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,7.7f)
                curveTo(22.0f,7.1f,21.6f,6.5f,21.2f,6.2f)
                lineTo(14.900001f,2.2999997f)
                curveTo(14.372936f,2.00039f,13.727065f,2.00039f,13.200001f,2.2999997f)
                lineTo(2.9000006f,8.299999f)
                curveTo(2.4000006f,8.499999f,2.0000005f,9.099999f,2.0000005f,9.699999f)
                lineTo(2.0000005f,16.3f)
                curveTo(2.0000005f,16.8f,2.4000006f,17.5f,2.8000004f,17.8f)
                lineTo(9.1f,21.699999f)
                curveTo(9.627065f,21.999609f,10.272936f,21.999609f,10.8f,21.699999f)
                lineTo(21.1f,15.699999f)
                curveTo(21.6f,15.399999f,22.0f,14.699999f,22.0f,14.199999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,21.9f)
                lineTo(10.0f,14.0f)
                lineTo(2.1f,9.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.0f)
                lineTo(21.9f,7.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,19.8f)
                lineTo(14.0f,11.699999f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.5f)
                lineTo(18.0f,9.4f)
            }
}

public val LucideIcons.All.ContainerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Container: ImageVector
    @Composable get() = ContainerDefinition.asImageVector()
