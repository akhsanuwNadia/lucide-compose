package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Umbrella") { strokeWidth ->
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
                moveTo(20.992000579833984,13.0)
                curveTo(21.307111740112305,13.002609252929688,21.605018615722656,12.856534957885742,21.79591178894043,12.605813980102539)
                curveTo(21.986806869506836,12.355093002319336,22.04835319519043,12.029058456420898,21.961999893188477,11.72599983215332)
                curveTo(20.79531478881836,7.177697658538818,16.6960506439209,3.997225284576416,12.000499725341797,3.997225284576416)
                curveTo(7.304947853088379,3.997225284576416,3.2056851387023926,7.177697658538818,2.038999557495117,11.72599983215332)
                curveTo(1.9530919790267944,12.027531623840332,2.0135772228240967,12.351899147033691,2.2023866176605225,12.602204322814941)
                curveTo(2.391195774078369,12.852508544921875,2.686469554901123,12.999771118164062,3.0,13.0)
                close()
            }
}

public val LucideIcons.All.UmbrellaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Umbrella: ImageVector
    @Composable get() = UmbrellaDefinition.asImageVector()
