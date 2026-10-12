package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SolarPanel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,2.0)
                lineTo(13.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.279999732971191,14.0)
                lineTo(9.719999313354492,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,22.0)
                lineTo(19.441999435424805,18.0)
                lineTo(4.558000087738037,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.244999885559082,15.039999961853027)
                curveTo(6.595935821533203,14.398613929748535,7.268883228302002,13.99983024597168,8.0,14.0)
                lineTo(20.0,14.0)
                curveTo(20.358455657958984,13.99968433380127,20.68966293334961,14.191252708435059,20.86812973022461,14.502123832702637)
                curveTo(21.04659652709961,14.812994956970215,21.045021057128906,15.195609092712402,20.86400032043457,15.505000114440918)
                lineTo(17.753999710083008,20.961999893188477)
                curveTo(17.4027099609375,21.602298736572266,16.73033332824707,22.00020408630371,16.0,22.0)
                lineTo(4.0,22.0)
                curveTo(3.6414105892181396,22.000167846679688,3.3101816177368164,21.808319091796875,3.1318933963775635,21.4971923828125)
                curveTo(2.9536049365997314,21.186067581176758,2.9555535316467285,20.803295135498047,3.13700008392334,20.493999481201172)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                curveTo(7.0,4.209138870239258,5.209138870239258,6.0,3.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.65999984741211,7.659999847412109)
                lineTo(10.069999694824219,9.069999694824219)
            }
}

public val LucideIcons.All.SolarPanelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SolarPanel: ImageVector
    @Composable get() = SolarPanelDefinition.asImageVector()
