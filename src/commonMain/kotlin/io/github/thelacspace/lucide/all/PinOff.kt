package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PinOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.34f)
                lineTo(15.0f,7.0f)
                curveTo(15.0f,6.4477153f,15.447715f,6.0f,16.0f,6.0f)
                curveTo(17.101078f,5.9950757f,17.991076f,5.101089f,17.991076f,4.0f)
                curveTo(17.991076f,2.8989108f,17.101078f,2.0049243f,16.0f,2.0f)
                lineTo(7.89f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                lineTo(9.0f,10.76f)
                curveTo(8.999598f,11.518944f,8.569657f,12.21227f,7.89f,12.55f)
                lineTo(6.1099997f,13.45f)
                curveTo(5.430342f,13.78773f,5.0004025f,14.481056f,5.0f,15.24f)
                lineTo(5.0f,16.0f)
                curveTo(5.0f,16.552284f,5.4477153f,17.0f,6.0f,17.0f)
                lineTo(17.0f,17.0f)
            }
}

public val LucideIcons.All.PinOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PinOff: ImageVector
    @Composable get() = PinOffDefinition.asImageVector()
