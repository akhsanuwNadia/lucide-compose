package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vegan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                quadTo(22.0f,8.0f,22.0f,2.0f)
                quadTo(16.0f,2.0f,16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.41f,3.59f)
                curveTo(13.112474f,0.82545507f,7.4220457f,1.7456248f,4.214838f,5.723721f)
                curveTo(1.0076306f,9.7018175f,1.3155249f,15.457935f,4.928794f,19.071205f)
                curveTo(8.542063f,22.684475f,14.298182f,22.992369f,18.276278f,19.785162f)
                curveTo(22.254374f,16.577955f,23.174545f,10.887526f,20.41f,6.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                curveTo(8.109627f,6.873859f,11.766689f,14.1879835f,12.0f,22.0f)
                curveTo(12.9f,15.18f,13.5f,12.5f,16.0f,8.0f)
            }
}

public val LucideIcons.All.VeganDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vegan: ImageVector
    @Composable get() = VeganDefinition.asImageVector()
