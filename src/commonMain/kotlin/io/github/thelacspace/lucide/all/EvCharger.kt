package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EvCharger") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(16.0,13.0)
                curveTo(17.104570388793945,13.0,18.0,13.895430564880371,18.0,15.0)
                lineTo(18.0,17.0)
                curveTo(18.004924774169922,18.101078033447266,18.898910522460938,18.99107551574707,20.0,18.99107551574707)
                curveTo(21.101089477539062,18.99107551574707,21.995075225830078,18.101078033447266,22.0,17.0)
                lineTo(22.0,10.001999855041504)
                curveTo(22.00042152404785,9.468955039978027,21.788040161132812,8.957796096801758,21.40999984741211,8.581999778747559)
                lineTo(18.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(14.0,5.0)
                curveTo(14.0,3.895430564880371,13.104569435119629,3.0,12.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(14.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(7.0,14.0)
                lineTo(10.0,14.0)
                lineTo(8.0,17.0)
            }
}

public val LucideIcons.All.EvChargerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EvCharger: ImageVector
    @Composable get() = EvChargerDefinition.asImageVector()
