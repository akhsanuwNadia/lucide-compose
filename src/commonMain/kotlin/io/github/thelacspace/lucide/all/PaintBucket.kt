package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaintBucket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,7.0f)
                lineTo(6.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.992f,12.0f)
                lineTo(2.041f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.145f,18.38f)
                curveTo(20.561863f,17.900719f,20.158266f,17.238045f,20.0f,16.5f)
                curveTo(19.844748f,17.239243f,19.440584f,17.902847f,18.855f,18.38f)
                curveTo(18.279999f,18.839998f,18.0f,19.4f,18.0f,19.974998f)
                curveTo(17.993315f,20.50975f,18.201073f,21.024904f,18.576874f,21.405401f)
                curveTo(18.952673f,21.7859f,19.465206f,22.000042f,20.0f,22.0f)
                curveTo(20.534794f,22.000042f,21.047327f,21.7859f,21.423126f,21.405403f)
                curveTo(21.798925f,21.024906f,22.006685f,20.509752f,22.0f,19.975f)
                curveTo(22.0f,19.395f,21.715f,18.845001f,21.145f,18.380001f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,4.5f)
                lineTo(10.648f,2.352f)
                curveTo(11.1185665f,1.8815035f,11.881433f,1.8815035f,12.351999f,2.352f)
                lineTo(19.647999f,9.648f)
                curveTo(20.118496f,10.1185665f,20.118496f,10.881433f,19.647999f,11.351999f)
                lineTo(12.055999f,18.944f)
                curveTo(10.644298f,20.355492f,8.3557005f,20.355492f,6.943999f,18.944f)
                lineTo(3.0559988f,15.056f)
                curveTo(1.6445085f,13.644299f,1.6445085f,11.355701f,3.0559988f,9.944f)
                lineTo(5.67f,7.33f)
            }
}

public val LucideIcons.All.PaintBucketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaintBucket: ImageVector
    @Composable get() = PaintBucketDefinition.asImageVector()
