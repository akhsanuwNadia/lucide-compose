package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VenusAndMars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                lineTo(14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(21.0f,2.0f)
                lineTo(21.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,2.0f)
                lineTo(15.54f,7.46f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                curveTo(6.991987f,12.791655f,7.943226f,14.450651f,9.493523f,15.3488f)
                curveTo(11.043819f,16.246948f,12.956181f,16.246948f,14.506477f,15.3488f)
                curveTo(16.056774f,14.450651f,17.008013f,12.791655f,17.0f,11.0f)
                curveTo(17.008013f,9.208345f,16.056774f,7.549349f,14.506477f,6.651201f)
                curveTo(12.956181f,5.753052f,11.043819f,5.753052f,9.493523f,6.651201f)
                curveTo(7.943226f,7.549349f,6.991987f,9.208345f,7.0f,11.0f)
            }
}

public val LucideIcons.All.VenusAndMarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VenusAndMars: ImageVector
    @Composable get() = VenusAndMarsDefinition.asImageVector()
