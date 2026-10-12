package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.659f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,13.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.378f,12.622f)
                curveTo(11.208328f,11.799888f,12.546984f,11.803551f,13.372801f,12.630193f)
                curveTo(14.198617f,13.456836f,14.200942f,14.795494f,13.378f,15.625f)
                lineTo(8.36f,20.637f)
                curveTo(8.122378f,20.874752f,7.828665f,21.048779f,7.5059996f,21.143f)
                lineTo(4.6389995f,21.98f)
                curveTo(4.463734f,22.031118f,4.2745404f,21.982647f,4.145446f,21.853552f)
                curveTo(4.0163507f,21.724457f,3.9678802f,21.535263f,4.0189996f,21.359999f)
                lineTo(4.8549995f,18.491f)
                curveTo(4.9493732f,18.168692f,5.12339f,17.87534f,5.3609996f,17.637999f)
                close()
            }
}

public val LucideIcons.All.FilePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePen: ImageVector
    @Composable get() = FilePenDefinition.asImageVector()
