package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wind") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.8f,19.6f)
                curveTo(13.496147f,20.12211f,14.449999f,20.13418f,15.159133f,19.62985f)
                curveTo(15.868268f,19.12552f,16.169926f,18.220545f,15.905216f,17.3916f)
                curveTo(15.640506f,16.562656f,14.870184f,16.0f,14.0f,16.0f)
                lineTo(2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,8.0f)
                curveTo(18.20539f,7.059479f,19.47079f,6.737519f,20.539906f,7.2265453f)
                curveTo(21.609022f,7.715572f,22.192955f,8.88344f,21.942707f,10.032148f)
                curveTo(21.69246f,11.180857f,20.675652f,12.0f,19.5f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.8f,4.4f)
                curveTo(10.496147f,3.8778894f,11.449999f,3.8658206f,12.159134f,4.37015f)
                curveTo(12.868268f,4.8744802f,13.169927f,5.779455f,12.905217f,6.6084f)
                curveTo(12.640507f,7.4373446f,11.870184f,8.0f,11.0f,8.0f)
                lineTo(2.0f,8.0f)
            }
}

public val LucideIcons.All.WindDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wind: ImageVector
    @Composable get() = WindDefinition.asImageVector()
