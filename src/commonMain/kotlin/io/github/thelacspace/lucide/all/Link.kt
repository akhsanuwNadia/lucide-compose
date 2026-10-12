package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,13.0)
                curveTo(10.868955612182617,14.161693572998047,12.199627876281738,14.888700485229492,13.646650314331055,14.99233341217041)
                curveTo(15.093672752380371,15.095966339111328,16.514366149902344,14.566006660461426,17.540000915527344,13.539999961853027)
                lineTo(20.540000915527344,10.539999961853027)
                curveTo(22.434860229492188,8.578104972839355,22.407760620117188,5.459577560424805,20.47909164428711,3.5309090614318848)
                curveTo(18.550424575805664,1.6022406816482544,15.431896209716797,1.5751405954360962,13.470001220703125,3.4699997901916504)
                lineTo(11.750000953674316,5.179999828338623)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,11.0)
                curveTo(13.131044387817383,9.83830738067627,11.800373077392578,9.111299514770508,10.353349685668945,9.00766658782959)
                curveTo(8.906327247619629,8.904033660888672,7.4856343269348145,9.43399429321289,6.460000038146973,10.460000038146973)
                lineTo(3.4600000381469727,13.460000038146973)
                curveTo(1.5651215314865112,15.421892166137695,1.5922125577926636,18.540435791015625,3.5208888053894043,20.469112396240234)
                curveTo(5.4495649337768555,22.397789001464844,8.568108558654785,22.42487907409668,10.530000686645508,20.530000686645508)
                lineTo(12.24000072479248,18.81999969482422)
            }
}

public val LucideIcons.All.LinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link: ImageVector
    @Composable get() = LinkDefinition.asImageVector()
