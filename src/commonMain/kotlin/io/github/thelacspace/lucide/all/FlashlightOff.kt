package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlashlightOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.652000427246094,6.0)
                lineTo(18.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,13.0)
                lineTo(12.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(16.0,20.0)
                curveTo(16.0,21.104570388793945,15.104569435119629,22.0,14.0,22.0)
                lineTo(10.0,22.0)
                curveTo(8.895430564880371,22.0,8.0,21.104570388793945,8.0,20.0)
                lineTo(8.0,12.0)
                curveTo(8.0,11.134519577026367,7.719288349151611,10.29238510131836,7.199999809265137,9.600000381469727)
                lineTo(6.599999904632568,8.800000190734863)
                curveTo(6.210533618927002,8.28071117401123,6.0,7.649110794067383,6.0,7.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.64900016784668,2.0)
                lineTo(17.0,2.0)
                curveTo(17.552284240722656,2.0,18.0,2.4477152824401855,18.0,3.0)
                lineTo(18.0,7.0)
                curveTo(18.0,7.649110794067383,17.789466857910156,8.280712127685547,17.399999618530273,8.800000190734863)
                lineTo(16.799999237060547,9.600000381469727)
                curveTo(16.569225311279297,9.907491683959961,16.383987426757812,10.246646881103516,16.25,10.607000350952148)
            }
}

public val LucideIcons.All.FlashlightOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlashlightOff: ImageVector
    @Composable get() = FlashlightOffDefinition.asImageVector()
