package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.413999557495117,13.413999557495117)
                curveTo(12.911849975585938,13.933911323547363,12.168244361877441,14.142422676086426,11.468985557556152,13.959391593933105)
                curveTo(10.76972770690918,13.776360511779785,10.223638534545898,13.230271339416504,10.040607452392578,12.531013488769531)
                curveTo(9.857576370239258,11.831754684448242,10.06608772277832,11.088149070739746,10.585999488830566,10.585999488830566)
            }
            lucidePath(strokeWidth) {
                moveTo(16.246999740600586,7.761000156402588)
                curveTo(17.451608657836914,8.967933654785156,18.08576774597168,10.630415916442871,17.990999221801758,12.333000183105469)
            }
            lucidePath(strokeWidth) {
                moveTo(19.075000762939453,4.933000087738037)
                curveTo(21.883792877197266,7.744890213012695,22.76078987121582,11.953224182128906,21.30900001525879,15.652999877929688)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.925000190734863,19.066999435424805)
                curveTo(1.025178074836731,15.162689208984375,1.025178074836731,8.837309837341309,4.925000190734863,4.932999610900879)
            }
            lucidePath(strokeWidth) {
                moveTo(7.752999782562256,16.23900032043457)
                curveTo(5.414704322814941,13.896690368652344,5.414704322814941,10.103310585021973,7.752999782562256,7.761000633239746)
            }
}

public val LucideIcons.All.RadioOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioOff: ImageVector
    @Composable get() = RadioOffDefinition.asImageVector()
