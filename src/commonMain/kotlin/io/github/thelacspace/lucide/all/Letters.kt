package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Letters") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                lineTo(9.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.354000091552734)
                curveTo(19.899581909179688,14.106452941894531,18.141904830932617,13.670194625854492,16.58584976196289,14.258400917053223)
                curveTo(15.029796600341797,14.84660816192627,14.000219345092773,16.33648109436035,14.000219345092773,18.0)
                curveTo(14.000219345092773,19.66351890563965,15.029796600341797,21.153392791748047,16.58584976196289,21.74159812927246)
                curveTo(18.141904830932617,22.329805374145508,19.899581909179688,21.89354705810547,21.0,20.645999908447266)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,18.0)
                lineTo(7.0,18.0)
                curveTo(8.101078033447266,18.004924774169922,8.99107551574707,18.898910522460938,8.99107551574707,20.0)
                curveTo(8.99107551574707,21.101089477539062,8.101078033447266,21.995075225830078,7.0,22.0)
                lineTo(3.5,22.0)
                curveTo(3.2238576412200928,22.0,3.0,21.776142120361328,3.0,21.5)
                lineTo(3.0,14.5)
                curveTo(3.0,14.223857879638672,3.2238576412200928,14.0,3.5,14.0)
                lineTo(6.0,14.0)
                curveTo(7.101078033447266,14.004923820495605,7.99107551574707,14.898910522460938,7.99107551574707,16.0)
                curveTo(7.99107551574707,17.101089477539062,7.101078033447266,17.995075225830078,6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(11.45300006866455,2.3520002365112305)
                curveTo(11.549967765808105,2.1368730068206787,11.764028549194336,1.998558759689331,12.0,1.998558759689331)
                curveTo(12.235971450805664,1.998558759689331,12.450032234191895,2.1368730068206787,12.54699993133545,2.3520002365112305)
                lineTo(16.0,10.0)
            }
}

public val LucideIcons.All.LettersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Letters: ImageVector
    @Composable get() = LettersDefinition.asImageVector()
