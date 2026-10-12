package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cloudy") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.5f,12.0f)
                curveTo(19.11249f,11.992788f,20.605585f,12.848904f,21.41392f,14.24417f)
                curveTo(22.222254f,15.639438f,22.222254f,17.360561f,21.41392f,18.755829f)
                curveTo(20.605585f,20.151096f,19.11249f,21.007212f,17.5f,21.0f)
                lineTo(9.006f,21.0f)
                curveTo(5.4006805f,21.003195f,2.3826163f,18.267467f,2.0328214f,14.679156f)
                curveTo(1.6830263f,11.090844f,4.1159244f,7.8237476f,7.653985f,7.130593f)
                curveTo(11.192045f,6.437438f,14.677907f,8.544969f,15.708f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.832f,9.0f)
                curveTo(21.407782f,7.800123f,20.272661f,6.998484f,19.0f,7.0f)
                lineTo(16.793f,7.0f)
                curveTo(16.091152f,4.5201817f,13.761475f,2.8602657f,11.188412f,3.0066807f)
                curveTo(8.61535f,3.1530957f,6.489009f,5.0665727f,6.072999f,7.61f)
            }
}

public val LucideIcons.All.CloudyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cloudy: ImageVector
    @Composable get() = CloudyDefinition.asImageVector()
