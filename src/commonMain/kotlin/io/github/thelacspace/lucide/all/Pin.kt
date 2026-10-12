package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pin") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.76f)
                curveTo(8.999598f,11.518944f,8.569657f,12.21227f,7.89f,12.55f)
                lineTo(6.1099997f,13.45f)
                curveTo(5.430342f,13.78773f,5.0004025f,14.481056f,5.0f,15.24f)
                lineTo(5.0f,16.0f)
                curveTo(5.0f,16.552284f,5.4477153f,17.0f,6.0f,17.0f)
                lineTo(18.0f,17.0f)
                curveTo(18.552284f,17.0f,19.0f,16.552284f,19.0f,16.0f)
                lineTo(19.0f,15.24f)
                curveTo(18.999598f,14.481055f,18.569656f,13.787729f,17.89f,13.45f)
                lineTo(16.109999f,12.55f)
                curveTo(15.430342f,12.21227f,15.000402f,11.518944f,15.0f,10.76f)
                lineTo(15.0f,7.0f)
                curveTo(15.0f,6.4477153f,15.447715f,6.0f,16.0f,6.0f)
                curveTo(17.101078f,5.9950757f,17.991076f,5.101089f,17.991076f,4.0f)
                curveTo(17.991076f,2.8989108f,17.101078f,2.0049243f,16.0f,2.0f)
                lineTo(8.0f,2.0f)
                curveTo(6.898922f,2.0049243f,6.0089245f,2.8989108f,6.0089245f,4.0f)
                curveTo(6.0089245f,5.101089f,6.898922f,5.9950757f,8.0f,6.0f)
                curveTo(8.552285f,6.0f,9.0f,6.4477153f,9.0f,7.0f)
                close()
            }
}

public val LucideIcons.All.PinDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pin: ImageVector
    @Composable get() = PinDefinition.asImageVector()
