package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Drone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(7.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(17.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.0)
                lineTo(17.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.204999923706055,4.138999938964844)
                curveTo(15.244863510131836,3.123241424560547,16.75393295288086,2.7515740394592285,18.14658546447754,3.1682310104370117)
                curveTo(19.539236068725586,3.584887742996216,20.59622573852539,4.724274635314941,20.907365798950195,6.144229412078857)
                curveTo(21.218505859375,7.564184665679932,20.73481559753418,9.041165351867676,19.644001007080078,10.001999855041504)
            }
            lucidePath(strokeWidth) {
                moveTo(19.636999130249023,14.0)
                curveTo(20.736955642700195,14.957409858703613,21.228729248046875,16.437557220458984,20.92041778564453,17.862857818603516)
                curveTo(20.612106323242188,19.288158416748047,19.552570343017578,20.432737350463867,18.155263900756836,20.849956512451172)
                curveTo(16.757957458496094,21.267175674438477,15.244318008422852,20.890914916992188,14.204998970031738,19.868000030517578)
            }
            lucidePath(strokeWidth) {
                moveTo(4.367000102996826,10.0)
                curveTo(3.265892744064331,9.042034149169922,2.7739503383636475,7.560385704040527,3.083421230316162,6.1340742111206055)
                curveTo(3.392892360687256,4.707763195037842,4.454646110534668,3.5632245540618896,5.853755474090576,3.147737979888916)
                curveTo(7.252864837646484,2.7322514057159424,8.767212867736816,3.1117775440216064,9.805000305175781,4.138000011444092)
            }
            lucidePath(strokeWidth) {
                moveTo(9.795000076293945,19.86199951171875)
                curveTo(8.752436637878418,20.871173858642578,7.245119094848633,21.23662757873535,5.85613489151001,20.81698989868164)
                curveTo(4.467151165008545,20.397350311279297,3.4143340587615967,19.25843048095703,3.1049530506134033,17.84080696105957)
                curveTo(2.79557204246521,16.42318344116211,3.278146982192993,14.94918155670166,4.366000175476074,13.988999366760254)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,8.0)
                lineTo(13.0,8.0)
                lineTo(14.0,8.0)
                lineTo(14.0,16.0)
                lineTo(13.0,16.0)
                lineTo(11.0,16.0)
                lineTo(10.0,16.0)
                lineTo(10.0,8.0)
                lineTo(11.0,8.0)
                close()
            }
}

public val LucideIcons.All.DroneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Drone: ImageVector
    @Composable get() = DroneDefinition.asImageVector()
