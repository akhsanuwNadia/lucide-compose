package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlaneLanding") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.7699999809265137,10.770000457763672)
                lineTo(2.0,9.0)
                lineTo(4.0,4.5)
                lineTo(5.099999904632568,5.050000190734863)
                curveTo(5.650000095367432,5.330000400543213,6.0,5.890000343322754,6.0,6.5)
                curveTo(6.0,7.109999656677246,6.349999904632568,7.670000076293945,6.900000095367432,7.949999809265137)
                lineTo(8.0,8.5)
                lineTo(11.0,2.5)
                lineTo(12.050000190734863,3.0299999713897705)
                curveTo(12.64246654510498,3.3250885009765625,13.050567626953125,3.89418363571167,13.140000343322754,4.550000190734863)
                lineTo(13.860000610351562,9.950000762939453)
                curveTo(13.949433326721191,10.605817794799805,14.357534408569336,11.174912452697754,14.950000762939453,11.470001220703125)
                lineTo(19.350000381469727,13.670001029968262)
                curveTo(19.770000457763672,13.89000129699707,20.130001068115234,14.220001220703125,20.360000610351562,14.630001068115234)
                lineTo(20.96000099182129,15.660000801086426)
                curveTo(21.450000762939453,16.540000915527344,20.900001525878906,17.64000129699707,19.900001525878906,17.760000228881836)
                lineTo(18.720001220703125,17.90999984741211)
                curveTo(18.250001907348633,17.969999313354492,17.770000457763672,17.889999389648438,17.350000381469727,17.670000076293945)
                lineTo(4.289999961853027,11.149999618530273)
                curveTo(4.097276210784912,11.05225658416748,3.921666145324707,10.92392635345459,3.7699999809265137,10.769999504089355)
                close()
            }
}

public val LucideIcons.All.PlaneLandingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlaneLanding: ImageVector
    @Composable get() = PlaneLandingDefinition.asImageVector()
