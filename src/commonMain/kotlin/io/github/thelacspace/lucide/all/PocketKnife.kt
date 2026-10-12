package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PocketKnife") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,2.0)
                lineTo(3.0,3.0)
                curveTo(3.0,4.0,5.0,4.0,5.0,5.0)
                curveTo(5.0,6.0,3.0,6.0,3.0,7.0)
                curveTo(3.0,8.0,5.0,8.0,5.0,9.0)
                curveTo(5.0,10.0,3.0,10.0,3.0,11.0)
                curveTo(3.0,12.0,5.0,12.0,5.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(18.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(6.010000228881836,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.829999923706055,8.829999923706055)
                curveTo(22.381057739257812,7.2650065422058105,22.37541389465332,4.740669250488281,20.817371368408203,3.1826279163360596)
                curveTo(19.25933074951172,1.624586820602417,16.73499298095703,1.6189422607421875,15.170000076293945,3.1700000762939453)
                lineTo(3.1700000762939453,15.170000076293945)
                curveTo(2.15138840675354,16.179540634155273,1.7507973909378052,17.65693473815918,2.1199135780334473,19.042755126953125)
                curveTo(2.4890296459198,20.428573608398438,3.571425676345825,21.510971069335938,4.957245826721191,21.88008689880371)
                curveTo(6.3430657386779785,22.249202728271484,7.82045841217041,21.84861183166504,8.829999923706055,20.829999923706055)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.65999984741211)
                lineTo(18.0,22.0)
                curveTo(20.209138870239258,22.0,22.0,20.209138870239258,22.0,18.0)
                lineTo(22.0,6.0)
            }
}

public val LucideIcons.All.PocketKnifeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PocketKnife: ImageVector
    @Composable get() = PocketKnifeDefinition.asImageVector()
