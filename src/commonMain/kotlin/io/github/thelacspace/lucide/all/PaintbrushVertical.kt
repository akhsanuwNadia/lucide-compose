package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaintbrushVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                curveTo(17.552284f,2.0f,18.0f,2.4477153f,18.0f,3.0f)
                lineTo(18.0f,12.0f)
                lineTo(6.0f,12.0f)
                lineTo(6.0f,3.0f)
                curveTo(6.0f,2.4477153f,6.4477153f,2.0f,7.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(5.4477153f,12.0f,5.0f,12.447715f,5.0f,13.0f)
                lineTo(5.0f,14.0f)
                curveTo(5.0f,15.104569f,5.8954306f,16.0f,7.0f,16.0f)
                lineTo(9.0f,16.0f)
                curveTo(9.552285f,16.0f,10.0f,16.447716f,10.0f,17.0f)
                lineTo(10.0f,19.9f)
                curveTo(9.996795f,20.616661f,10.377291f,21.28026f,10.997409f,21.639519f)
                curveTo(11.617528f,21.99878f,12.382472f,21.99878f,13.002591f,21.639519f)
                curveTo(13.622709f,21.28026f,14.003205f,20.616661f,14.0f,19.9f)
                lineTo(14.0f,17.0f)
                curveTo(14.0f,16.447716f,14.447715f,16.0f,15.0f,16.0f)
                lineTo(17.0f,16.0f)
                curveTo(18.10457f,16.0f,19.0f,15.104569f,19.0f,14.0f)
                lineTo(19.0f,13.0f)
                curveTo(19.0f,12.447715f,18.552284f,12.0f,18.0f,12.0f)
            }
}

public val LucideIcons.All.PaintbrushVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaintbrushVertical: ImageVector
    @Composable get() = PaintbrushVerticalDefinition.asImageVector()
