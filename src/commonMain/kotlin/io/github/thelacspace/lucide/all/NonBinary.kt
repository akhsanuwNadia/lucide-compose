package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NonBinary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,4.0f)
                lineTo(15.5f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,8.0f)
                lineTo(15.5f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,17.0f)
                curveTo(6.991987f,18.791655f,7.943226f,20.450651f,9.493523f,21.348799f)
                curveTo(11.043819f,22.246948f,12.956181f,22.246948f,14.506477f,21.348799f)
                curveTo(16.056774f,20.450651f,17.008013f,18.791655f,17.0f,17.0f)
                curveTo(17.008013f,15.208345f,16.056774f,13.549349f,14.506477f,12.6512f)
                curveTo(12.956181f,11.753052f,11.043819f,11.753052f,9.493523f,12.6512f)
                curveTo(7.943226f,13.549349f,6.991987f,15.208345f,7.0f,17.0f)
            }
}

public val LucideIcons.All.NonBinaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NonBinary: ImageVector
    @Composable get() = NonBinaryDefinition.asImageVector()
