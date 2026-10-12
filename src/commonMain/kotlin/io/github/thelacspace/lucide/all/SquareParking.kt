package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareParking") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(9.0,7.0)
                lineTo(13.0,7.0)
                curveTo(14.651617050170898,7.007386207580566,15.986613273620605,8.348365783691406,15.986613273620605,10.0)
                curveTo(15.986613273620605,11.651634216308594,14.651617050170898,12.992613792419434,13.0,13.0)
                lineTo(9.0,13.0)
            }
}

public val LucideIcons.All.SquareParkingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareParking: ImageVector
    @Composable get() = SquareParkingDefinition.asImageVector()
