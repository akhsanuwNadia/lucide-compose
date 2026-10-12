package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WineOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(10.0,10.0)
                moveTo(17.0,10.0)
                lineTo(15.656999588012695,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.307000160217285,7.307000160217285)
                curveTo(7.106013298034668,8.190657615661621,7.003057956695557,9.093779563903809,7.0,10.0)
                curveTo(7.0000901222229,11.76397705078125,7.929660797119141,13.397384643554688,9.44619083404541,14.298356056213379)
                curveTo(10.96272087097168,15.199328422546387,12.841785430908203,15.234533309936523,14.390999794006348,14.390999794006348)
                moveTo(8.637999534606934,2.9809999465942383)
                curveTo(8.75,2.6679999828338623,8.871999740600586,2.3399999141693115,9.0,2.0)
                lineTo(15.0,2.0)
                curveTo(16.5,6.0,17.0,8.0,17.0,10.0)
                curveTo(17.0,10.406999588012695,16.950000762939453,10.809000015258789,16.854999542236328,11.197999954223633)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.WineOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WineOff: ImageVector
    @Composable get() = WineOffDefinition.asImageVector()
