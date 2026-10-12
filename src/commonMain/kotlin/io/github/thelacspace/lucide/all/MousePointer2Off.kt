package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.55f,8.45f)
                lineTo(20.688f,10.537f)
                curveTo(20.88753f,10.618291f,21.012548f,10.818255f,20.998245f,11.033235f)
                curveTo(20.983944f,11.248213f,20.83354f,11.429855f,20.625f,11.483999f)
                lineTo(14.500999f,13.063999f)
                curveTo(13.796329f,13.245157f,13.245628f,13.794708f,13.063f,14.498999f)
                lineTo(11.483999f,20.624998f)
                curveTo(11.429855f,20.833538f,11.248214f,20.983944f,11.033234f,20.998245f)
                curveTo(10.818254f,21.012547f,10.61829f,20.88753f,10.536999f,20.687998f)
                lineTo(8.45f,15.551f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(2.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.816f,11.528f)
                lineTo(4.0369997f,4.6879997f)
                curveTo(3.9562383f,4.501616f,3.9975424f,4.28481f,4.141176f,4.141176f)
                curveTo(4.28481f,3.9975424f,4.501616f,3.9562383f,4.6879997f,4.0369997f)
                lineTo(11.528f,6.816f)
            }
}

public val LucideIcons.All.MousePointer2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer2Off: ImageVector
    @Composable get() = MousePointer2OffDefinition.asImageVector()
