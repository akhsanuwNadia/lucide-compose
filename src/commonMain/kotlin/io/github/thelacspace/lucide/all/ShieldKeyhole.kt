package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldKeyhole") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,13.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,13.0)
                curveTo(20.0,18.0,16.5,20.5,12.34000015258789,21.950000762939453)
                curveTo(12.122162818908691,22.023818969726562,11.885537147521973,22.020286560058594,11.670000076293945,21.940000534057617)
                curveTo(7.5,20.5,4.0,18.0,4.0,13.0)
                lineTo(4.0,6.0)
                curveTo(4.0,5.4477152824401855,4.4477152824401855,5.0,5.0,5.0)
                curveTo(7.0,5.0,9.5,3.799999952316284,11.239999771118164,2.2799999713897705)
                curveTo(11.67767333984375,1.9060670137405396,12.32232666015625,1.9060670137405396,12.760000228881836,2.2799999713897705)
                curveTo(14.510000228881836,3.809999942779541,17.0,5.0,19.0,5.0)
                curveTo(19.552284240722656,5.0,20.0,5.4477152824401855,20.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,11.0)
                curveTo(9.996794700622559,11.71666145324707,10.377290725708008,12.380260467529297,10.997408866882324,12.739520072937012)
                curveTo(11.617527961730957,13.09877872467041,12.382472038269043,13.09877872467041,13.002591133117676,12.739520072937012)
                curveTo(13.622709274291992,12.380260467529297,14.003205299377441,11.71666145324707,14.0,11.0)
                curveTo(14.003205299377441,10.28333854675293,13.622709274291992,9.619739532470703,13.002591133117676,9.260479927062988)
                curveTo(12.382472038269043,8.90122127532959,11.617527961730957,8.90122127532959,10.997408866882324,9.260479927062988)
                curveTo(10.377290725708008,9.619739532470703,9.996794700622559,10.28333854675293,10.0,11.0)
            }
}

public val LucideIcons.All.ShieldKeyholeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldKeyhole: ImageVector
    @Composable get() = ShieldKeyholeDefinition.asImageVector()
