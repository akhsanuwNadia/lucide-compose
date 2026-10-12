package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.639365196228027,1.9989635944366455,15.252715110778809,2.2530863285064697,15.704000473022461,2.7059998512268066)
                lineTo(19.29199981689453,6.293999671936035)
                curveTo(19.746139526367188,6.745443820953369,20.001039505004883,7.359653472900391,20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.032999992370605,13.4399995803833)
                curveTo(15.232872009277344,13.555658340454102,15.355949401855469,13.769076347351074,15.355949401855469,14.0)
                curveTo(15.355949401855469,14.23092269897461,15.232872009277344,14.444340705871582,15.032999992370605,14.559999465942383)
                lineTo(10.968000411987305,16.911998748779297)
                curveTo(10.768187522888184,17.02760124206543,10.521827697753906,17.027605056762695,10.322011947631836,16.91200828552246)
                curveTo(10.12219524383545,16.796411514282227,9.999390602111816,16.582843780517578,10.0,16.351999282836914)
                lineTo(10.0,11.647998809814453)
                curveTo(9.999597549438477,11.417464256286621,10.122265815734863,11.204242706298828,10.321762084960938,11.088712692260742)
                curveTo(10.521258354187012,10.97318172454834,10.767248153686523,10.972908973693848,10.967000007629395,11.087998390197754)
                close()
            }
}

public val LucideIcons.All.FilePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePlay: ImageVector
    @Composable get() = FilePlayDefinition.asImageVector()
