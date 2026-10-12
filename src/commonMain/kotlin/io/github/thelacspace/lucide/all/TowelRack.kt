package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TowelRack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(20.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5,3.0)
                lineTo(17.5,3.0)
                curveTo(18.880712509155273,3.0,20.0,4.119287967681885,20.0,5.5)
                lineTo(20.0,20.0)
                curveTo(20.0,20.552284240722656,19.552284240722656,21.0,19.0,21.0)
                lineTo(10.0,21.0)
                curveTo(9.447714805603027,21.0,9.0,20.552284240722656,9.0,20.0)
                lineTo(9.0,5.5)
                curveTo(8.993844985961914,4.123652458190918,7.87636137008667,3.011155366897583,6.5,3.011155366897583)
                curveTo(5.12363862991333,3.011155366897583,4.006155014038086,4.123652458190918,4.0,5.5)
                lineTo(4.0,17.0)
                curveTo(4.0,17.552284240722656,4.4477152824401855,18.0,5.0,18.0)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,7.0)
                lineTo(2.0,7.0)
            }
}

public val LucideIcons.All.TowelRackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TowelRack: ImageVector
    @Composable get() = TowelRackDefinition.asImageVector()
