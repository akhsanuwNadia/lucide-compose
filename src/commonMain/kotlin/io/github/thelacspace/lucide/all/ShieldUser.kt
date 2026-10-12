package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldUser") { strokeWidth ->
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
                moveTo(6.375999927520752,18.90999984741211)
                curveTo(7.249900817871094,16.559288024902344,9.493645668029785,15.000088691711426,12.001543045043945,15.000757217407227)
                curveTo(14.509440422058105,15.001426696777344,16.75235366821289,16.56182289123535,17.625,18.913000106811523)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                curveTo(7.993589878082275,12.433323860168457,8.7545804977417,13.760520935058594,9.994818687438965,14.479039192199707)
                curveTo(11.235055923461914,15.197558403015137,12.764944076538086,15.197558403015137,14.005181312561035,14.479039192199707)
                curveTo(15.2454195022583,13.760520935058594,16.006410598754883,12.433323860168457,16.0,11.0)
                curveTo(16.006410598754883,9.566676139831543,15.2454195022583,8.239479064941406,14.005181312561035,7.520960330963135)
                curveTo(12.764944076538086,6.802441596984863,11.235055923461914,6.802441596984863,9.994818687438965,7.520960330963135)
                curveTo(8.7545804977417,8.239479064941406,7.993589878082275,9.566676139831543,8.0,11.0)
            }
}

public val LucideIcons.All.ShieldUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldUser: ImageVector
    @Composable get() = ShieldUserDefinition.asImageVector()
