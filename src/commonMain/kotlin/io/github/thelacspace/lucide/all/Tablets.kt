package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tablets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,7.0f)
                curveTo(1.9919875f,8.791655f,2.9432259f,10.450651f,4.4935226f,11.3488f)
                curveTo(6.04382f,12.246948f,7.95618f,12.246948f,9.506477f,11.3488f)
                curveTo(11.056774f,10.450651f,12.008013f,8.791655f,12.0f,7.0f)
                curveTo(12.008013f,5.2083454f,11.056774f,3.5493488f,9.506477f,2.6512005f)
                curveTo(7.95618f,1.7530521f,6.04382f,1.7530521f,4.4935226f,2.6512005f)
                curveTo(2.9432259f,3.5493488f,1.9919875f,5.2083454f,2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                curveTo(11.991987f,18.791655f,12.943226f,20.450651f,14.493523f,21.348799f)
                curveTo(16.04382f,22.246948f,17.95618f,22.246948f,19.506477f,21.348799f)
                curveTo(21.056774f,20.450651f,22.008013f,18.791655f,22.0f,17.0f)
                curveTo(22.008013f,15.208345f,21.056774f,13.549349f,19.506477f,12.6512f)
                curveTo(17.95618f,11.753052f,16.04382f,11.753052f,14.493523f,12.6512f)
                curveTo(12.943226f,13.549349f,11.991987f,15.208345f,12.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.46f,10.54f)
                lineTo(10.54f,3.46f)
            }
}

public val LucideIcons.All.TabletsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tablets: ImageVector
    @Composable get() = TabletsDefinition.asImageVector()
