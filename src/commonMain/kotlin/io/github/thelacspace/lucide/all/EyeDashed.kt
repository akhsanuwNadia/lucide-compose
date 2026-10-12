package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.054f,18.946f)
                curveTo(12.352291f,19.01361f,11.645709f,19.01361f,10.944f,18.946f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.054f,5.054f)
                curveTo(12.352324f,4.9860554f,11.6457405f,4.9857206f,10.944f,5.053f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.072f,6.274f)
                curveTo(17.692558f,6.607945f,18.27959f,7.0007505f,18.825f,7.447f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.825f,16.552f)
                curveTo(18.279633f,16.998596f,17.6926f,17.391737f,17.072f,17.726f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.514f,13.303f)
                curveTo(2.3481522f,12.992417f,2.1973119f,12.674051f,2.062f,12.349001f)
                curveTo(1.9784117f,12.124186f,1.9784117f,11.876816f,2.062f,11.652f)
                curveTo(2.196629f,11.326649f,2.346802f,11.007948f,2.512f,10.6970005f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.485f,10.697f)
                curveTo(21.651217f,11.00789f,21.802391f,11.3265915f,21.938f,11.651999f)
                curveTo(22.021587f,11.876815f,22.021587f,12.124184f,21.938f,12.348999f)
                curveTo(21.80236f,12.674068f,21.651188f,12.992435f,21.485f,13.3029995f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.173f,7.448f)
                curveTo(5.7183676f,7.0014033f,6.3054004f,6.6082625f,6.9259996f,6.274f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.926f,17.726f)
                curveTo(6.305401f,17.391737f,5.718368f,16.998596f,5.1730003f,16.552f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(8.995193f,13.074993f,9.565935f,14.070391f,10.496114f,14.60928f)
                curveTo(11.426291f,15.148169f,12.573709f,15.148169f,13.503886f,14.60928f)
                curveTo(14.434065f,14.070391f,15.004807f,13.074993f,15.0f,12.0f)
                curveTo(15.004807f,10.925007f,14.434065f,9.929609f,13.503886f,9.39072f)
                curveTo(12.573709f,8.851831f,11.426291f,8.851831f,10.496114f,9.39072f)
                curveTo(9.565935f,9.929609f,8.995193f,10.925007f,9.0f,12.0f)
            }
}

public val LucideIcons.All.EyeDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeDashed: ImageVector
    @Composable get() = EyeDashedDefinition.asImageVector()
