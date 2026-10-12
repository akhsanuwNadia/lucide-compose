package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.619999885559082,18.799999237060547)
                curveTo(3.0469775199890137,18.20256996154785,2.848292112350464,17.338741302490234,3.1027169227600098,16.550994873046875)
                curveTo(3.3571419715881348,15.763249397277832,4.0235795974731445,15.178834915161133,4.837804317474365,15.029458045959473)
                curveTo(5.652028560638428,14.880080223083496,6.482516288757324,15.189868927001953,7.0,15.836000442504883)
                curveTo(7.519876480102539,15.196737289428711,8.347599029541016,14.892776489257812,9.157637596130371,15.043661117553711)
                curveTo(9.967676162719727,15.194544792175293,10.630448341369629,15.776137351989746,10.885296821594238,16.559707641601562)
                curveTo(11.140145301818848,17.343276977539062,10.946301460266113,18.203474044799805,10.380000114440918,18.802000045776367)
                lineTo(7.754000186920166,21.658000946044922)
                curveTo(7.5640950202941895,21.87565040588379,7.2893524169921875,22.000553131103516,7.000500202178955,22.000553131103516)
                curveTo(6.711647987365723,22.000553131103516,6.436905384063721,21.87565040588379,6.247000217437744,21.658000946044922)
                close()
            }
}

public val LucideIcons.All.FileHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileHeart: ImageVector
    @Composable get() = FileHeartDefinition.asImageVector()
