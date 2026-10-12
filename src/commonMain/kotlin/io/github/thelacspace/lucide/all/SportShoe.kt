package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SportShoe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,10.420000076293945)
                lineTo(19.799999237060547,5.349999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,22.0)
                lineTo(21.413999557495117,9.414999961853027)
                curveTo(21.824270248413086,9.005043983459473,22.0363712310791,8.437177658081055,21.99530792236328,7.858645439147949)
                curveTo(21.95424461364746,7.280113220214844,21.6640625,6.747898101806641,21.200000762939453,6.400000095367432)
                lineTo(15.59000015258789,2.191999912261963)
                curveTo(15.285900115966797,1.9697824716567993,14.882736206054688,1.9372793436050415,14.546964645385742,2.107910394668579)
                curveTo(14.211193084716797,2.278541326522827,13.999774932861328,2.6233606338500977,14.0,3.0)
                lineTo(14.0,5.0)
                curveTo(14.000008583068848,5.871120452880859,13.436169624328613,6.642050743103027,12.605999946594238,6.906000137329102)
                lineTo(8.677000045776367,8.053000450134277)
                curveTo(8.271920204162598,8.191251754760742,7.9997429847717285,8.571977615356445,8.0,9.0)
                curveTo(7.84499979019165,15.392999649047852,5.918000221252441,18.0,4.0,18.0)
                curveTo(2.8989217281341553,18.004924774169922,2.0089242458343506,18.898910522460938,2.0089242458343506,20.0)
                curveTo(2.0089242458343506,21.101089477539062,2.8989217281341553,21.995075225830078,4.0,22.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.SportShoeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SportShoe: ImageVector
    @Composable get() = SportShoeDefinition.asImageVector()
