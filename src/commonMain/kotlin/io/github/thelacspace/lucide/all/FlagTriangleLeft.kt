package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagTriangleLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(18.0,2.799999952316284)
                curveTo(18.000246047973633,2.520167589187622,17.854259490966797,2.2605459690093994,17.61503028869629,2.1153724193573)
                curveTo(17.37580108642578,1.9701989889144897,17.07810401916504,1.9605772495269775,16.829999923706055,2.0899999141693115)
                lineTo(5.449999809265137,7.78000020980835)
                curveTo(5.174007415771484,7.913669586181641,4.998711585998535,8.193342208862305,4.998711585998535,8.5)
                curveTo(4.998711585998535,8.806658744812012,5.174007415771484,9.086331367492676,5.449999809265137,9.220000267028809)
                lineTo(18.0,15.5)
            }
}

public val LucideIcons.All.FlagTriangleLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagTriangleLeft: ImageVector
    @Composable get() = FlagTriangleLeftDefinition.asImageVector()
