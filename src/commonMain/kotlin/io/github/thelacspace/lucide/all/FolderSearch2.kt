package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSearch2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,12.5)
                curveTo(8.995993614196777,13.395827293395996,9.471612930297852,14.225325584411621,10.246761322021484,14.674399375915527)
                curveTo(11.021909713745117,15.12347412109375,11.978090286254883,15.12347412109375,12.753238677978516,14.674399375915527)
                curveTo(13.528387069702148,14.225325584411621,14.004006385803223,13.395827293395996,14.0,12.5)
                curveTo(14.004006385803223,11.604172706604004,13.528387069702148,10.774674415588379,12.753238677978516,10.325600624084473)
                curveTo(11.978090286254883,9.87652587890625,11.021909713745117,9.87652587890625,10.246761322021484,10.325600624084473)
                curveTo(9.471612930297852,10.774674415588379,8.995993614196777,11.604172706604004,9.0,12.5)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.100000381469727,6.0)
                curveTo(11.420332908630371,6.006663799285889,10.783802032470703,5.667683124542236,10.40999984741211,5.099999904632568)
                lineTo(9.600000381469727,3.9000000953674316)
                curveTo(9.230077743530273,3.3382794857025146,8.60258674621582,3.000110626220703,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.300000190734863,14.300000190734863)
                lineTo(15.0,16.0)
            }
}

public val LucideIcons.All.FolderSearch2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSearch2: ImageVector
    @Composable get() = FolderSearch2Definition.asImageVector()
