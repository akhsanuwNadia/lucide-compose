package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Weight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                curveTo(8.995193f,6.0749927f,9.565935f,7.0703907f,10.496114f,7.6092796f)
                curveTo(11.426291f,8.148169f,12.573709f,8.148169f,13.503886f,7.6092796f)
                curveTo(14.434065f,7.0703907f,15.004807f,6.0749927f,15.0f,5.0f)
                curveTo(15.004807f,3.925007f,14.434065f,2.9296093f,13.503886f,2.3907204f)
                curveTo(12.573709f,1.8518313f,11.426291f,1.8518313f,10.496114f,2.3907204f)
                curveTo(9.565935f,2.9296093f,8.995193f,3.925007f,9.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,8.0f)
                curveTo(5.611099f,8.009223f,4.8349686f,8.604053f,4.5950003f,9.46f)
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
}

public val LucideIcons.All.WeightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Weight: ImageVector
    @Composable get() = WeightDefinition.asImageVector()
