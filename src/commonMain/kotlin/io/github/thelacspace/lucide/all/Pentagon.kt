package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pentagon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.83f,2.38f)
                curveTo(11.528613f,1.8760889f,12.471387f,1.8760889f,13.17f,2.38f)
                lineTo(21.17f,8.12f)
                curveTo(21.878311f,8.6303005f,22.173801f,9.541059f,21.9f,10.37f)
                lineTo(18.86f,19.630001f)
                curveTo(18.58832f,20.448576f,17.822483f,21.000786f,16.960001f,21.000002f)
                lineTo(7.04f,21.000002f)
                curveTo(6.1775174f,21.000786f,5.411681f,20.448576f,5.14f,19.630001f)
                lineTo(2.1f,10.37f)
                curveTo(1.8261977f,9.541059f,2.1216881f,8.6303005f,2.83f,8.12f)
                close()
            }
}

public val LucideIcons.All.PentagonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pentagon: ImageVector
    @Composable get() = PentagonDefinition.asImageVector()
