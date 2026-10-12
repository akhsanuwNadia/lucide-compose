package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessagesCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.95f,10.05f)
                curveTo(22.020878f,12.120362f,22.584206f,15.260959f,21.362001f,17.922f)
                curveTo(21.235601f,18.16529f,21.214632f,18.449808f,21.304f,18.709002f)
                lineTo(21.979f,20.798002f)
                curveTo(22.048769f,21.13723f,21.938051f,21.488407f,21.686333f,21.726276f)
                curveTo(21.434616f,21.964144f,21.077742f,22.054836f,20.743f,21.966002f)
                lineTo(18.588f,21.335001f)
                curveTo(18.341246f,21.257957f,18.074244f,21.27946f,17.842999f,21.395f)
                curveTo(15.196545f,22.571962f,12.098558f,21.997526f,10.049998f,19.95f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.696f,12.708f)
                curveTo(2.784794f,12.449408f,2.763835f,12.165735f,2.638f,11.923f)
                curveTo(1.2254683f,8.850719f,2.2110538f,5.207903f,4.9799504f,3.2669322f)
                curveTo(7.7488475f,1.3259617f,11.509399f,1.6417805f,13.915781f,4.0173817f)
                curveTo(16.322165f,6.3929825f,16.686367f,10.149157f,14.781202f,12.942811f)
                curveTo(12.876038f,15.736465f,9.24621f,16.768864f,6.156f,15.396f)
                curveTo(5.9251714f,15.280394f,5.658577f,15.258535f,5.412f,15.335f)
                lineTo(3.2570002f,15.965f)
                curveTo(2.9224632f,16.0537f,2.5658453f,15.963112f,2.314195f,15.72551f)
                curveTo(2.0625446f,15.487908f,1.9516431f,15.137075f,2.0210004f,14.798f)
                close()
            }
}

public val LucideIcons.All.MessagesCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessagesCircle: ImageVector
    @Composable get() = MessagesCircleDefinition.asImageVector()
