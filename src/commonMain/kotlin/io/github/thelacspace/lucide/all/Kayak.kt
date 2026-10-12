package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Kayak") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,17.0)
                curveTo(17.447715759277344,17.0,17.0,17.447715759277344,17.0,18.0)
                lineTo(17.0,19.0)
                curveTo(17.0,20.104570388793945,17.895429611206055,21.0,19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
                curveTo(21.0,17.895429611206055,20.104570388793945,17.0,19.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.969999313354492,3.609999895095825)
                curveTo(21.032508850097656,3.4445486068725586,20.99230194091797,3.2578229904174805,20.867238998413086,3.1327600479125977)
                curveTo(20.742176055908203,3.007697105407715,20.555450439453125,2.9674909114837646,20.389999389648438,3.0299999713897705)
                curveTo(10.199999809265137,6.599999904632568,6.599999904632568,10.199999809265137,3.0299999713897705,20.389999389648438)
                curveTo(2.9674909114837646,20.555450439453125,3.007697105407715,20.742176055908203,3.1327600479125977,20.867238998413086)
                curveTo(3.2578229904174805,20.99230194091797,3.4445486068725586,21.032508850097656,3.609999895095825,20.969999313354492)
                curveTo(13.800000190734863,17.399999618530273,17.399999618530273,13.800000190734863,20.969999313354492,3.609999895095825)
            }
            lucidePath(strokeWidth) {
                moveTo(6.706999778747559,6.706999778747559)
                lineTo(17.292999267578125,17.292999267578125)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,5.0)
                curveTo(7.0,3.895430564880371,6.104569435119629,3.0,5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                curveTo(3.0,6.104569435119629,3.895430564880371,7.0,5.0,7.0)
                lineTo(6.0,7.0)
                curveTo(6.5522847175598145,7.0,7.0,6.5522847175598145,7.0,6.0)
                close()
            }
}

public val LucideIcons.All.KayakDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Kayak: ImageVector
    @Composable get() = KayakDefinition.asImageVector()
