package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileSearch") { strokeWidth ->
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
                moveTo(9.0,14.5)
                curveTo(8.995993614196777,15.395827293395996,9.471612930297852,16.225324630737305,10.246761322021484,16.674400329589844)
                curveTo(11.021909713745117,17.12347412109375,11.978090286254883,17.12347412109375,12.753238677978516,16.674400329589844)
                curveTo(13.528387069702148,16.225324630737305,14.004006385803223,15.395827293395996,14.0,14.5)
                curveTo(14.004006385803223,13.604172706604004,13.528387069702148,12.774674415588379,12.753238677978516,12.325600624084473)
                curveTo(11.978090286254883,11.87652587890625,11.021909713745117,11.87652587890625,10.246761322021484,12.325600624084473)
                curveTo(9.471612930297852,12.774674415588379,8.995993614196777,13.604172706604004,9.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(13.300000190734863,16.299999237060547)
                lineTo(15.0,18.0)
            }
}

public val LucideIcons.All.FileSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileSearch: ImageVector
    @Composable get() = FileSearchDefinition.asImageVector()
