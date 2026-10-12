package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UmbrellaOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,13.0)
                lineTo(12.0,20.0)
                curveTo(12.004923820495605,21.101078033447266,12.898910522460938,21.99107551574707,14.0,21.99107551574707)
                curveTo(15.101089477539062,21.99107551574707,15.995076179504395,21.101078033447266,16.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.6560001373291,13.0)
                lineTo(20.992000579833984,13.0)
                curveTo(21.307111740112305,13.002609252929688,21.605018615722656,12.856534957885742,21.79591178894043,12.605813980102539)
                curveTo(21.986806869506836,12.355093002319336,22.04835319519043,12.029058456420898,21.961999893188477,11.72599983215332)
                curveTo(20.59496307373047,6.3972697257995605,15.276411056518555,3.0880467891693115,9.892000198364258,4.215999603271484)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.960999965667725,5.956999778747559)
                curveTo(4.021218299865723,7.364089012145996,2.633963108062744,9.404648780822754,2.0390000343322754,11.72599983215332)
                curveTo(1.9530925750732422,12.027531623840332,2.013577699661255,12.351899147033691,2.2023868560791016,12.602203369140625)
                curveTo(2.3911960124969482,12.852508544921875,2.686469554901123,12.999771118164062,3.0,13.0)
                lineTo(13.0,13.0)
            }
}

public val LucideIcons.All.UmbrellaOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UmbrellaOff: ImageVector
    @Composable get() = UmbrellaOffDefinition.asImageVector()
