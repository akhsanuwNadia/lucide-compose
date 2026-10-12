package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBracesCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,14.0f)
                curveTo(4.4477153f,14.0f,4.0f,14.447715f,4.0f,15.0f)
                lineTo(4.0f,17.0f)
                curveTo(4.0f,17.552284f,3.5522847f,18.0f,3.0f,18.0f)
                curveTo(3.5522847f,18.0f,4.0f,18.447716f,4.0f,19.0f)
                lineTo(4.0f,21.0f)
                curveTo(4.0f,21.552284f,4.4477153f,22.0f,5.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                curveTo(9.552285f,22.0f,10.0f,21.552284f,10.0f,21.0f)
                lineTo(10.0f,19.0f)
                curveTo(10.0f,18.447716f,10.447715f,18.0f,11.0f,18.0f)
                curveTo(10.447715f,18.0f,10.0f,17.552284f,10.0f,17.0f)
                lineTo(10.0f,15.0f)
                curveTo(10.0f,14.447715f,9.552285f,14.0f,9.0f,14.0f)
            }
}

public val LucideIcons.All.FileBracesCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBracesCorner: ImageVector
    @Composable get() = FileBracesCornerDefinition.asImageVector()
