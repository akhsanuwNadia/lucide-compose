package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.94f,5.274f)
                curveTo(13.231113f,5.934151f,15.0286455f,7.7151017f,15.71f,10.0f)
                lineTo(17.5f,10.0f)
                curveTo(18.97155f,10.000018f,20.350122f,10.719532f,21.191607f,11.926746f)
                curveTo(22.033089f,13.133961f,22.231155f,14.67634f,21.722f,16.057f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.796f,18.81f)
                curveTo(18.375578f,18.936203f,17.938955f,19.000216f,17.5f,19.0f)
                lineTo(9.0f,19.0f)
                curveTo(5.7706723f,18.99946f,2.9608095f,16.789846f,2.198825f,13.651704f)
                curveTo(1.4368402f,10.513561f,2.9205117f,7.2614164f,5.79f,5.78f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.CloudOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudOff: ImageVector
    @Composable get() = CloudOffDefinition.asImageVector()
