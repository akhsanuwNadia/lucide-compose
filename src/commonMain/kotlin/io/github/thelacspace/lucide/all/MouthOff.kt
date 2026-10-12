package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouthOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.074000358581543,7.416999816894531)
                curveTo(13.991509437561035,6.816342353820801,15.187247276306152,6.855947017669678,16.062999725341797,7.515999794006348)
                curveTo(17.892000198364258,8.875999450683594,19.115999221801758,9.592000007629395,21.54199981689453,11.15999984741211)
                curveTo(22.000736236572266,11.455573081970215,22.137800216674805,12.064346313476562,21.850000381469727,12.527999877929688)
                curveTo(21.38986587524414,13.27000904083252,20.847431182861328,13.957697868347168,20.232999801635742,14.57800006866455)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(5.616174697875977,12.730439186096191,9.301502227783203,13.062419891357422,12.989999771118164,12.989999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,11.0)
                curveTo(21.552284240722656,11.0,22.0,11.447714805603027,22.0,12.0)
                curveTo(20.763307571411133,12.2494478225708,19.517784118652344,12.452920913696289,18.266000747680664,12.609999656677246)
            }
            lucidePath(strokeWidth) {
                moveTo(7.695000171661377,7.695000171661377)
                curveTo(5.994999885559082,8.942000389099121,4.775000095367432,9.66200065612793,2.457000255584717,11.159000396728516)
                curveTo(1.9980120658874512,11.45494556427002,1.861342430114746,12.064393997192383,2.1500003337860107,12.527999877929688)
                curveTo(5.2502970695495605,17.519311904907227,11.593029975891113,19.404176712036133,16.916000366210938,16.916000366210938)
            }
}

public val LucideIcons.All.MouthOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouthOff: ImageVector
    @Composable get() = MouthOffDefinition.asImageVector()
