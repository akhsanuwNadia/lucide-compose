package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlaneTakeoff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.360000133514404,17.399999618530273)
                lineTo(4.0,17.0)
                lineTo(2.0,13.0)
                lineTo(3.0999999046325684,12.449999809265137)
                curveTo(3.666095018386841,12.164742469787598,4.33390474319458,12.164742469787598,4.899999618530273,12.449999809265137)
                lineTo(5.069999694824219,12.550000190734863)
                curveTo(5.63609504699707,12.835257530212402,6.3039045333862305,12.835257530212402,6.869999885559082,12.550000190734863)
                lineTo(8.0,12.0)
                lineTo(5.0,6.0)
                lineTo(5.900000095367432,5.550000190734863)
                curveTo(6.578462600708008,5.2162370681762695,7.387148380279541,5.293623447418213,7.989999771118164,5.75)
                lineTo(12.010000228881836,8.75)
                curveTo(12.615076065063477,9.210421562194824,13.4288911819458,9.287927627563477,14.110000610351562,8.949999809265137)
                lineTo(18.30000114440918,6.889999866485596)
                curveTo(18.835439682006836,6.620090007781982,19.452266693115234,6.559476852416992,20.030000686645508,6.71999979019165)
                lineTo(21.0,7.0)
                curveTo(21.405872344970703,7.112712383270264,21.739421844482422,7.402182579040527,21.908157348632812,7.78814172744751)
                curveTo(22.076894760131836,8.174100875854492,22.06287956237793,8.615521430969238,21.8700008392334,8.989999771118164)
                lineTo(21.490001678466797,9.75)
                curveTo(21.26000213623047,10.210000038146973,20.89000129699707,10.59000015258789,20.420001983642578,10.829999923706055)
                lineTo(7.579999923706055,17.200000762939453)
                curveTo(7.202445030212402,17.387008666992188,6.775474548339844,17.45000457763672,6.359999656677246,17.380001068115234)
                close()
            }
}

public val LucideIcons.All.PlaneTakeoffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlaneTakeoff: ImageVector
    @Composable get() = PlaneTakeoffDefinition.asImageVector()
