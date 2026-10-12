package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Medal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.21f,15.0f)
                lineTo(2.66f,7.14f)
                curveTo(2.2589452f,6.446782f,2.3100955f,5.5811605f,2.79f,4.9399996f)
                lineTo(4.4f,2.8f)
                curveTo(4.777709f,2.2963884f,5.3704853f,2.0f,6.0f,2.0f)
                lineTo(18.0f,2.0f)
                curveTo(18.629515f,1.9999999f,19.222292f,2.2963881f,19.6f,2.8f)
                lineTo(21.2f,4.94f)
                curveTo(21.68308f,5.579106f,21.738173f,6.444815f,21.34f,7.1400003f)
                lineTo(16.79f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(5.12f,2.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(18.880001f,2.1999998f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,7.0f)
                lineTo(16.0f,7.0f)
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
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,16.0f)
                lineTo(11.5f,16.0f)
            }
}

public val LucideIcons.All.MedalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Medal: ImageVector
    @Composable get() = MedalDefinition.asImageVector()
