package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudMoonRain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                lineTo(11.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.376f,14.512f)
                curveTo(20.117002f,13.760536f,21.400305f,12.2302885f,21.837f,10.385f)
                curveTo(21.985f,9.76f,21.178f,9.415f,20.589f,9.6710005f)
                curveTo(19.083172f,10.322367f,17.332275f,9.988145f,16.172256f,8.827905f)
                curveTo(15.012238f,7.6676655f,14.678349f,5.9167056f,15.330001f,4.4110003f)
                curveTo(15.585001f,3.8220003f,15.240001f,3.0160003f,14.614001f,3.163f)
                curveTo(12.082418f,3.7644963f,10.227078f,5.9291945f,10.020001f,8.523001f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                curveTo(1.7696704f,18.357962f,1.6674098f,16.130938f,2.7420812f,14.383058f)
                curveTo(3.8167524f,12.635178f,5.850191f,11.721272f,7.8707666f,12.078031f)
                curveTo(9.891342f,12.434788f,11.488866f,13.989783f,11.9f,16.0f)
                lineTo(13.0f,16.0f)
                curveTo(14.245733f,15.99817f,15.362979f,16.76639f,15.807193f,17.930231f)
                curveTo(16.251408f,19.094072f,15.930149f,20.41134f,15.0f,21.24f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(7.0f,21.0f)
            }
}

public val LucideIcons.All.CloudMoonRainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudMoonRain: ImageVector
    @Composable get() = CloudMoonRainDefinition.asImageVector()
