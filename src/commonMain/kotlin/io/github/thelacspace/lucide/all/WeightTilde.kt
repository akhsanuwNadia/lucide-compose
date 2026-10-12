package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WeightTilde") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.5f,8.0f)
                curveTo(5.6107264f,8.008781f,4.834072f,8.6037f,4.594f,9.46f)
                lineTo(2.1f,18.5f)
                curveTo(1.9468374f,19.092777f,2.073623f,19.723053f,2.4440815f,20.210499f)
                curveTo(2.8145404f,20.697943f,3.3878572f,20.988855f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.625729f,20.999775f,21.21529f,20.706709f,21.593235f,20.208017f)
                curveTo(21.97118f,19.709326f,22.093946f,19.062489f,21.925f,18.46f)
                lineTo(19.4f,9.5f)
                curveTo(19.173561f,8.622877f,18.385849f,8.007478f,17.48f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.999f,15.0f)
                curveTo(8.471136f,14.370485f,9.212107f,14.0f,9.999001f,14.0f)
                curveTo(10.785893f,14.0f,11.526865f,14.370485f,11.999001f,15.0f)
                curveTo(12.471136f,15.629515f,13.212108f,16.0f,13.999001f,16.0f)
                curveTo(14.785893f,16.0f,15.526865f,15.629515f,15.999001f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                curveTo(8.995193f,6.0749927f,9.565935f,7.0703907f,10.496114f,7.6092796f)
                curveTo(11.426291f,8.148169f,12.573709f,8.148169f,13.503886f,7.6092796f)
                curveTo(14.434065f,7.0703907f,15.004807f,6.0749927f,15.0f,5.0f)
                curveTo(15.004807f,3.925007f,14.434065f,2.9296093f,13.503886f,2.3907204f)
                curveTo(12.573709f,1.8518313f,11.426291f,1.8518313f,10.496114f,2.3907204f)
                curveTo(9.565935f,2.9296093f,8.995193f,3.925007f,9.0f,5.0f)
            }
}

public val LucideIcons.All.WeightTildeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WeightTilde: ImageVector
    @Composable get() = WeightTildeDefinition.asImageVector()
