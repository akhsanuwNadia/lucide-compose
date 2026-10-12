package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toilet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(20.0f,12.0f)
                curveTo(20.552284f,12.0f,21.0f,12.447715f,21.0f,13.0f)
                curveTo(21.0f,15.761424f,18.761423f,18.0f,16.0f,18.0f)
                lineTo(15.402f,18.0f)
                curveTo(15.220238f,18.0f,15.052792f,18.098639f,14.964679f,18.257616f)
                curveTo(14.876566f,18.416594f,14.881666f,18.610865f,14.978001f,18.765f)
                lineTo(16.522001f,21.234999f)
                curveTo(16.618336f,21.389133f,16.623436f,21.583405f,16.535322f,21.742382f)
                curveTo(16.44721f,21.90136f,16.279764f,21.999998f,16.098001f,21.999998f)
                lineTo(5.402f,21.999998f)
                curveTo(5.2202373f,21.999998f,5.052791f,21.90136f,4.9646783f,21.742382f)
                curveTo(4.8765655f,21.583405f,4.881666f,21.389133f,4.978f,21.234999f)
                lineTo(7.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                curveTo(5.2385764f,18.0f,3.0f,15.761424f,3.0f,13.0f)
                lineTo(3.0f,4.0f)
                curveTo(3.0f,2.8954306f,3.8954306f,2.0f,5.0f,2.0f)
                lineTo(13.0f,2.0f)
                curveTo(14.104569f,2.0f,15.0f,2.8954306f,15.0f,4.0f)
                lineTo(15.0f,12.0f)
            }
}

public val LucideIcons.All.ToiletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toilet: ImageVector
    @Composable get() = ToiletDefinition.asImageVector()
