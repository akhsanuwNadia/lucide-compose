package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(8.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.006999969482422,5.007999897003174)
                lineTo(18.993999481201172,8.993999481201172)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(20.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.173999786376953,6.813000202178955)
                curveTo(22.222715377807617,5.703752040863037,22.198392868041992,3.9614057540893555,21.119121551513672,2.881863832473755)
                curveTo(20.03985023498535,1.8023220300674438,18.297510147094727,1.7775622606277466,17.187999725341797,2.826000213623047)
                lineTo(3.8420000076293945,16.174999237060547)
                curveTo(3.6098194122314453,16.4064998626709,3.4381136894226074,16.691530227661133,3.3420000076293945,17.0049991607666)
                lineTo(2.0209999084472656,21.356998443603516)
                curveTo(1.9683454036712646,21.533193588256836,2.0166585445404053,21.724071502685547,2.146796226501465,21.854000091552734)
                curveTo(2.2769339084625244,21.983928680419922,2.4678895473480225,22.031936645507812,2.6440000534057617,21.9789981842041)
                lineTo(6.997000217437744,20.658998489379883)
                curveTo(7.310169219970703,20.563749313354492,7.595173358917236,20.393091201782227,7.827000141143799,20.161998748779297)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(18.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,4.0)
            }
}

public val LucideIcons.All.PencilSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilSparkles: ImageVector
    @Composable get() = PencilSparklesDefinition.asImageVector()
