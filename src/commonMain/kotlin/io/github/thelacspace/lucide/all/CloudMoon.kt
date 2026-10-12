package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudMoon") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,16.0f)
                curveTo(14.651617f,16.007387f,15.986613f,17.348366f,15.986613f,19.0f)
                curveTo(15.986613f,20.651634f,14.651617f,21.992613f,13.0f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(4.3688736f,21.999464f,2.1883426f,19.959892f,2.0122328f,17.334665f)
                curveTo(1.8361231f,14.70944f,3.7246983f,12.396898f,6.332178f,12.044937f)
                curveTo(8.939658f,11.692975f,11.373775f,13.422033f,11.9f,16.0f)
                close()
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
}

public val LucideIcons.All.CloudMoonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudMoon: ImageVector
    @Composable get() = CloudMoonDefinition.asImageVector()
