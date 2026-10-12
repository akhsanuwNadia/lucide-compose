package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThumbsUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,5.880000114440918)
                lineTo(14.0,10.0)
                lineTo(19.829999923706055,10.0)
                curveTo(20.459514617919922,10.0,21.052291870117188,10.296388626098633,21.43000030517578,10.800000190734863)
                curveTo(21.807708740234375,11.303611755371094,21.9262638092041,11.955665588378906,21.75,12.559999465942383)
                lineTo(19.420000076293945,20.559999465942383)
                curveTo(19.171112060546875,21.413333892822266,18.38888931274414,22.0,17.5,22.0)
                lineTo(4.0,22.0)
                curveTo(2.895430564880371,22.0,2.0,21.104570388793945,2.0,20.0)
                lineTo(2.0,12.0)
                curveTo(2.0,10.895430564880371,2.895430564880371,10.0,4.0,10.0)
                lineTo(6.760000228881836,10.0)
                curveTo(7.518944263458252,9.999597549438477,8.21226978302002,9.569658279418945,8.550000190734863,8.890000343322754)
                lineTo(12.0,2.0)
                curveTo(12.955354690551758,2.0118303298950195,13.852988243103027,2.4593586921691895,14.43740463256836,3.215203046798706)
                curveTo(15.021820068359375,3.9710474014282227,15.229009628295898,4.9524245262146,15.0,5.880000114440918)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(7.0,22.0)
            }
}

public val LucideIcons.All.ThumbsUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThumbsUp: ImageVector
    @Composable get() = ThumbsUpDefinition.asImageVector()
