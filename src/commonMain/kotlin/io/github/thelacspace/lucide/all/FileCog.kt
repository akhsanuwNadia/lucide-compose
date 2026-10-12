package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                curveTo(14.447714805603027,8.0,14.0,7.5522847175598145,14.0,7.0)
                lineTo(14.0,2.0)
                curveTo(14.639365196228027,1.9989635944366455,15.252715110778809,2.2530863285064697,15.704000473022461,2.7059998512268066)
                lineTo(19.29199981689453,6.293999671936035)
                curveTo(19.746139526367188,6.745443820953369,20.001039505004883,7.359653472900391,20.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(13.817999839782715,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.305000066757202,19.530000686645508)
                lineTo(4.228000164031982,19.148000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.592000007629395)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.228000164031982,16.851999282836914)
                lineTo(3.30400013923645,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(5.8520002365112305,15.227999687194824)
                lineTo(5.469000339508057,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(5.8520002365112305,20.77199935913086)
                lineTo(5.469000339508057,21.695999145507812)
            }
            lucidePath(strokeWidth) {
                moveTo(8.14799976348877,15.227999687194824)
                lineTo(8.531000137329102,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(8.529999732971191,21.695999145507812)
                lineTo(8.14799976348877,20.77199935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(9.77299976348877,16.851999282836914)
                lineTo(10.694999694824219,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(9.77299976348877,19.148000717163086)
                lineTo(10.694999694824219,19.5310001373291)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                curveTo(3.995192527770996,19.074993133544922,4.5659356117248535,20.070390701293945,5.4961137771606445,20.60927963256836)
                curveTo(6.4262919425964355,21.148168563842773,7.5737080574035645,21.148168563842773,8.503886222839355,20.60927963256836)
                curveTo(9.434064865112305,20.070390701293945,10.004807472229004,19.074993133544922,10.0,18.0)
                curveTo(10.004807472229004,16.925006866455078,9.434064865112305,15.929609298706055,8.503886222839355,15.39072036743164)
                curveTo(7.5737080574035645,14.851831436157227,6.4262919425964355,14.851831436157227,5.4961137771606445,15.39072036743164)
                curveTo(4.5659356117248535,15.929609298706055,3.995192527770996,16.925006866455078,4.0,18.0)
            }
}

public val LucideIcons.All.FileCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileCog: ImageVector
    @Composable get() = FileCogDefinition.asImageVector()
