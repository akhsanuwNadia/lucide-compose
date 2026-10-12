package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ruler") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.299999237060547,15.300000190734863)
                curveTo(21.751890182495117,15.750324249267578,22.005891799926758,16.362037658691406,22.005891799926758,17.0)
                curveTo(22.005891799926758,17.637964248657227,21.751890182495117,18.249675750732422,21.299999237060547,18.700000762939453)
                lineTo(18.69999885559082,21.30000114440918)
                curveTo(18.24967384338379,21.75189208984375,17.637962341308594,22.00589370727539,17.0,22.00589370727539)
                curveTo(16.362035751342773,22.00589370727539,15.750323295593262,21.75189208984375,15.299999237060547,21.30000114440918)
                lineTo(2.700000047683716,8.699999809265137)
                curveTo(1.7643263339996338,7.7597880363464355,1.7643263339996338,6.240211486816406,2.700000047683716,5.299999713897705)
                lineTo(5.300000190734863,2.6999998092651367)
                curveTo(6.2402119636535645,1.764325737953186,7.759788990020752,1.764325737953186,8.700000762939453,2.6999998092651367)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,12.5)
                lineTo(16.5,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(11.5,9.5)
                lineTo(13.5,7.5)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,6.5)
                lineTo(10.5,4.5)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,15.5)
                lineTo(19.5,13.5)
            }
}

public val LucideIcons.All.RulerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ruler: ImageVector
    @Composable get() = RulerDefinition.asImageVector()
