package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(9.894000053405762,18.447999954223633)
                curveTo(9.331178665161133,18.166757583618164,8.668821334838867,18.166757583618164,8.105999946594238,18.447999954223633)
                lineTo(4.447000026702881,20.277999877929688)
                curveTo(4.136620044708252,20.43309783935547,3.768024444580078,20.416221618652344,3.473116874694824,20.233407974243164)
                curveTo(3.1782093048095703,20.05059242248535,2.9991440773010254,19.72797393798828,3.0,19.381000518798828)
                lineTo(3.0,6.618000030517578)
                curveTo(3.000202178955078,6.2393341064453125,3.21427059173584,5.893263339996338,3.552999973297119,5.723999977111816)
                lineTo(8.105999946594238,3.447000026702881)
                curveTo(8.668821334838867,3.165757179260254,9.331178665161133,3.165757179260254,9.894000053405762,3.447000026702881)
                lineTo(14.105999946594238,5.552999973297119)
                curveTo(14.668821334838867,5.834242820739746,15.331178665161133,5.834242820739746,15.894000053405762,5.552999973297119)
                lineTo(19.55299949645996,3.7230000495910645)
                curveTo(19.86322021484375,3.567981481552124,20.231609344482422,3.5847575664520264,20.526456832885742,3.7673306465148926)
                curveTo(20.821304321289062,3.9499034881591797,21.00050926208496,4.2722039222717285,21.0,4.61899995803833)
                lineTo(21.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.763999938964844)
                lineTo(15.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,18.0)
                lineTo(15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.2360000610351562)
                lineTo(9.0,18.236000061035156)
            }
}

public val LucideIcons.All.MapMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapMinus: ImageVector
    @Composable get() = MapMinusDefinition.asImageVector()
