package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Printer3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.0)
                lineTo(10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,20.0)
                lineTo(15.0,17.0)
                curveTo(15.0,16.447715759277344,14.552285194396973,16.0,14.0,16.0)
                lineTo(9.0,16.0)
                curveTo(8.447714805603027,16.0,8.0,16.447715759277344,8.0,17.0)
                lineTo(8.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,22.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(18.0,2.0)
                curveTo(19.104570388793945,2.0,20.0,2.895430564880371,20.0,4.0)
                lineTo(20.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(8.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.635000228881836,10.093000411987305)
                curveTo(8.229891777038574,9.71471118927002,7.999936580657959,9.185269355773926,8.0,8.630999565124512)
                lineTo(8.0,7.0)
                curveTo(8.0,6.4477152824401855,8.447714805603027,6.0,9.0,6.0)
                lineTo(11.0,6.0)
                curveTo(11.552285194396973,6.0,12.0,6.4477152824401855,12.0,7.0)
                lineTo(12.0,9.0)
                curveTo(11.999942779541016,9.2651948928833,11.894549369812012,9.51950740814209,11.706999778747559,9.706999778747559)
                lineTo(10.706999778747559,10.706999778747559)
                curveTo(10.316499710083008,11.097381591796875,9.683499336242676,11.097381591796875,9.292999267578125,10.706999778747559)
                close()
            }
}

public val LucideIcons.All.Printer3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Printer3d: ImageVector
    @Composable get() = Printer3dDefinition.asImageVector()
