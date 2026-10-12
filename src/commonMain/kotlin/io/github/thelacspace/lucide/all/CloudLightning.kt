package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudLightning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,16.326f)
                curveTo(3.0972807f,14.94766f,1.5057966f,11.770053f,2.140507f,8.620014f)
                curveTo(2.7752175f,5.469976f,5.473088f,3.1566424f,8.683085f,3.0099719f)
                curveTo(11.893084f,2.8633015f,14.790672f,4.9209685f,15.71f,8.0f)
                lineTo(17.5f,8.0f)
                curveTo(19.891039f,7.99583f,21.86785f,9.862289f,22.000877f,12.249629f)
                curveTo(22.133907f,14.636969f,20.3767f,16.711498f,18.0f,16.973f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(10.0f,17.0f)
                lineTo(14.0f,17.0f)
                lineTo(11.0f,22.0f)
            }
}

public val LucideIcons.All.CloudLightningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudLightning: ImageVector
    @Composable get() = CloudLightningDefinition.asImageVector()
