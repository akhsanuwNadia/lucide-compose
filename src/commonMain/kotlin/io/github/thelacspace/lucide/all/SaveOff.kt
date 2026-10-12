package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,13.0)
                lineTo(8.0,13.0)
                curveTo(7.4477152824401855,13.0,7.0,13.447714805603027,7.0,14.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(15.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(17.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.40999984741211,20.40999984741211)
                curveTo(20.036649703979492,20.785587310791016,19.529577255249023,20.997766494750977,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.002232789993286,4.470423221588135,3.214412212371826,3.963350534439087,3.5899999141693115,3.5900001525878906)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.0)
                lineTo(15.199999809265137,3.0)
                curveTo(15.727538108825684,3.007513999938965,16.23073959350586,3.2231712341308594,16.600000381469727,3.5999999046325684)
                lineTo(20.399999618530273,7.399999618530273)
                curveTo(20.77682876586914,7.769260406494141,20.99248504638672,8.2724609375,21.0,8.799999237060547)
                lineTo(21.0,15.0)
            }
}

public val LucideIcons.All.SaveOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveOff: ImageVector
    @Composable get() = SaveOffDefinition.asImageVector()
