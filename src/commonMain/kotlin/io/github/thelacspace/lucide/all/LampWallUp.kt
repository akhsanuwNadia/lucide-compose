package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampWallUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.929000854492188,9.628999710083008)
                curveTo(20.052104949951172,9.9371337890625,20.014347076416016,10.286263465881348,19.828214645385742,10.560955047607422)
                curveTo(19.642080307006836,10.835646629333496,19.33181381225586,11.0001220703125,19.0,11.0)
                lineTo(9.0,11.0)
                curveTo(8.668362617492676,10.99979019165039,8.358402252197266,10.83517837524414,8.172506332397461,10.560541152954102)
                curveTo(7.986609935760498,10.285902976989746,7.948962688446045,9.936968803405762,8.072000503540039,9.628999710083008)
                lineTo(10.072000503540039,4.628999710083008)
                curveTo(10.223675727844238,4.249349594116211,10.59117317199707,4.000258922576904,11.0,4.0)
                lineTo(17.0,4.0)
                curveTo(17.40882682800293,4.000258922576904,17.776325225830078,4.249349594116211,17.92799949645996,4.629000186920166)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                curveTo(7.104569435119629,15.0,8.0,15.895430564880371,8.0,17.0)
                lineTo(8.0,19.0)
                curveTo(8.0,20.104570388793945,7.104569435119629,21.0,6.0,21.0)
                lineTo(5.0,21.0)
                curveTo(4.4477152824401855,21.0,4.0,20.552284240722656,4.0,20.0)
                lineTo(4.0,16.0)
                curveTo(4.0,15.447714805603027,4.4477152824401855,15.0,5.0,15.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(12.0,18.0)
                curveTo(13.104569435119629,18.0,14.0,17.104570388793945,14.0,16.0)
                lineTo(14.0,11.0)
            }
}

public val LucideIcons.All.LampWallUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampWallUp: ImageVector
    @Composable get() = LampWallUpDefinition.asImageVector()
