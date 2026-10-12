package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.929999828338623,4.928999900817871)
                curveTo(1.924261450767517,7.934515476226807,1.1469553709030151,12.511717796325684,2.991999864578247,16.340999603271484)
                curveTo(3.1390390396118164,16.7119140625,3.1717753410339355,17.118331909179688,3.0859999656677246,17.507999420166016)
                lineTo(2.0209999084472656,20.79800033569336)
                curveTo(1.9512301683425903,21.13722801208496,2.0619497299194336,21.488405227661133,2.313667058944702,21.726274490356445)
                curveTo(2.56538462638855,21.964141845703125,2.9222586154937744,22.054834365844727,3.256999969482422,21.965999603271484)
                lineTo(6.670000076293945,20.968000411987305)
                curveTo(7.037715911865234,20.895063400268555,7.4185285568237305,20.92694091796875,7.769000053405762,21.059999465942383)
                curveTo(11.579750061035156,22.839691162109375,16.096792221069336,22.04475212097168,19.070999145507812,19.070999145507812)
            }
            lucidePath(strokeWidth) {
                moveTo(8.350000381469727,2.690000057220459)
                curveTo(12.049880981445312,1.2449358701705933,16.254268646240234,2.1266472339630127,19.061861038208008,4.936407566070557)
                curveTo(21.86945343017578,7.746168613433838,22.7479190826416,11.951234817504883,21.299999237060547,15.649999618530273)
            }
}

public val LucideIcons.All.MessageCircleOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleOff: ImageVector
    @Composable get() = MessageCircleOffDefinition.asImageVector()
