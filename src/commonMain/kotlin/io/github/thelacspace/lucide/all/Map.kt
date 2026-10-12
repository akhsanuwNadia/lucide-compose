package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Map") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.106f,5.553f)
                curveTo(14.668821f,5.834243f,15.331179f,5.834243f,15.894f,5.553f)
                lineTo(19.553f,3.723f)
                curveTo(19.86322f,3.5679815f,20.23161f,3.5847576f,20.526457f,3.7673306f)
                curveTo(20.821304f,3.9499035f,21.00051f,4.272204f,21.0f,4.619f)
                lineTo(21.0f,17.383f)
                curveTo(20.999798f,17.761665f,20.78573f,18.107735f,20.447f,18.276999f)
                lineTo(15.894001f,20.553999f)
                curveTo(15.33118f,20.835241f,14.668822f,20.835241f,14.106001f,20.553999f)
                lineTo(9.894001f,18.447998f)
                curveTo(9.33118f,18.166756f,8.668822f,18.166756f,8.106001f,18.447998f)
                lineTo(4.447001f,20.277998f)
                curveTo(4.136621f,20.433098f,3.7680259f,20.41622f,3.473118f,20.233406f)
                curveTo(3.1782103f,20.050592f,2.9991446f,19.727974f,3.0f,19.381f)
                lineTo(3.0f,6.618f)
                curveTo(3.0002022f,6.239334f,3.2142706f,5.8932633f,3.553f,5.724f)
                lineTo(8.106f,3.447f)
                curveTo(8.668821f,3.1657572f,9.331179f,3.1657572f,9.894f,3.447f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.764f)
                lineTo(15.0f,20.764f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.236f)
                lineTo(9.0f,18.236f)
            }
}

public val LucideIcons.All.MapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Map: ImageVector
    @Composable get() = MapDefinition.asImageVector()
