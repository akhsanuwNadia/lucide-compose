package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.5,12.5)
                lineTo(20.5,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5,12.5)
                lineTo(15.5,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(21.954999923706055,8.77400016784668)
                curveTo(21.67275047302246,6.645679473876953,20.177867889404297,4.876145839691162,18.12662696838379,4.242250919342041)
                curveTo(16.07538604736328,3.60835599899292,13.84279727935791,4.22598934173584,12.409000396728516,5.824000358581543)
                curveTo(12.17858600616455,6.038670063018799,11.821414947509766,6.038670063018799,11.5910005569458,5.824000358581543)
                curveTo(10.068389892578125,4.129541873931885,7.658773899078369,3.549107551574707,5.531609058380127,4.36439847946167)
                curveTo(3.4044437408447266,5.179689884185791,2.0000417232513428,7.221945762634277,2.0,9.5)
                curveTo(2.0,11.800000190734863,3.5,13.5,5.0,15.0)
                lineTo(10.507999420166016,20.332000732421875)
                curveTo(11.162113189697266,21.064292907714844,12.25107192993164,21.213441848754883,13.077999114990234,20.68400001525879)
            }
}

public val LucideIcons.All.HeartXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartX: ImageVector
    @Composable get() = HeartXDefinition.asImageVector()
