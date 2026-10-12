package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sandwich") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.369999885559082,11.222999572753906)
                lineTo(10.741999626159668,4.445999622344971)
                curveTo(11.475635528564453,3.8524138927459717,12.52436351776123,3.8524138927459717,13.257999420166016,4.445999622344971)
                lineTo(21.628999710083008,11.222999572753906)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                curveTo(21.552284240722656,15.0,22.0,15.447714805603027,22.0,16.0)
                lineTo(22.0,18.0)
                curveTo(22.0,18.552284240722656,21.552284240722656,19.0,21.0,19.0)
                lineTo(15.75,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,15.0)
                curveTo(2.4477152824401855,15.0,2.0,15.447714805603027,2.0,16.0)
                lineTo(2.0,18.0)
                curveTo(2.0,18.552284240722656,2.4477152824401855,19.0,3.0,19.0)
                lineTo(12.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.670000076293945,15.0)
                lineTo(12.800000190734863,19.600000381469727)
                curveTo(13.224346160888672,19.91826057434082,13.75774097442627,20.054914474487305,14.282842636108398,19.979900360107422)
                curveTo(14.807945251464844,19.904884338378906,15.281740188598633,19.624347686767578,15.600000381469727,19.200000762939453)
                lineTo(18.75,15.000000953674316)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(21.0,11.0)
                lineTo(22.0,11.0)
                lineTo(22.0,15.0)
                lineTo(21.0,15.0)
                lineTo(3.0,15.0)
                lineTo(2.0,15.0)
                lineTo(2.0,11.0)
                lineTo(3.0,11.0)
                close()
            }
}

public val LucideIcons.All.SandwichDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sandwich: ImageVector
    @Composable get() = SandwichDefinition.asImageVector()
