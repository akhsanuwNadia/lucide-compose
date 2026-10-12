package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChefHat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                curveTo(17.552284240722656,21.0,18.0,20.552284240722656,18.0,20.0)
                lineTo(18.0,14.649999618530273)
                curveTo(18.0,14.192999839782715,18.31599998474121,13.805999755859375,18.726999282836914,13.608999252319336)
                curveTo(20.483856201171875,12.77090835571289,21.382341384887695,10.789802551269531,20.855422973632812,8.9159574508667)
                curveTo(20.328502655029297,7.042110919952393,18.529178619384766,5.8196210861206055,16.592998504638672,6.019999027252197)
                curveTo(15.803557395935059,4.1849751472473145,13.99763011932373,2.9959423542022705,11.999998092651367,2.9959423542022705)
                curveTo(10.00236701965332,2.9959423542022705,8.196439743041992,4.1849751472473145,7.406998634338379,6.019999027252197)
                curveTo(5.471746444702148,5.821031093597412,3.6739795207977295,7.043300151824951,3.147285223007202,8.91610050201416)
                curveTo(2.620590925216675,10.788901329040527,3.517725706100464,12.769067764282227,5.272998809814453,13.607998847961426)
                curveTo(5.683999061584473,13.805998802185059,5.999999046325684,14.192998886108398,5.999999046325684,14.648999214172363)
                lineTo(5.999999046325684,20.0)
                curveTo(5.999999046325684,20.552284240722656,6.447714328765869,21.0,6.999999046325684,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                lineTo(18.0,17.0)
            }
}

public val LucideIcons.All.ChefHatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChefHat: ImageVector
    @Composable get() = ChefHatDefinition.asImageVector()
