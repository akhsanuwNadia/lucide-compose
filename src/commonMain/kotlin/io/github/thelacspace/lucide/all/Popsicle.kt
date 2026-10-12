package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Popsicle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.6f,14.4f)
                curveTo(19.4f,13.599999f,19.4f,12.4f,18.6f,11.599999f)
                lineTo(10.5f,3.499999f)
                curveTo(9.233614f,2.2222352f,7.3803477f,1.7197272f,5.6419516f,2.1827526f)
                curveTo(3.9035554f,2.645778f,2.5457795f,4.003554f,2.082754f,5.74195f)
                curveTo(1.6197283f,7.480346f,2.1222365f,9.333612f,3.4f,10.599998f)
                lineTo(11.5f,18.699999f)
                curveTo(12.4f,19.4f,13.6f,19.4f,14.4f,18.599998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(16.5f,16.5f)
            }
}

public val LucideIcons.All.PopsicleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Popsicle: ImageVector
    @Composable get() = PopsicleDefinition.asImageVector()
