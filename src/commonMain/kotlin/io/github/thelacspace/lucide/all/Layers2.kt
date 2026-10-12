package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Layers2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,13.739999771118164)
                curveTo(12.381197929382324,14.097265243530273,11.618802070617676,14.097265243530273,11.0,13.739999771118164)
                lineTo(2.5,8.869999885559082)
                curveTo(2.186689615249634,8.692439079284668,1.9930518865585327,8.360126495361328,1.9930518865585327,8.0)
                curveTo(1.9930518865585327,7.639873027801514,2.186689615249634,7.30756139755249,2.5,7.130000114440918)
                lineTo(11.0,2.259999990463257)
                curveTo(11.618802070617676,1.902734398841858,12.381197929382324,1.902734398841858,13.0,2.259999990463257)
                lineTo(21.5,7.130000114440918)
                curveTo(21.813310623168945,7.30756139755249,22.006948471069336,7.639873027801514,22.006948471069336,8.0)
                curveTo(22.006948471069336,8.360126495361328,21.813310623168945,8.692439079284668,21.5,8.869999885559082)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.28499984741211)
                lineTo(21.5,15.130000114440918)
                curveTo(21.813310623168945,15.307560920715332,22.006948471069336,15.639873504638672,22.006948471069336,16.0)
                curveTo(22.006948471069336,16.36012840270996,21.813310623168945,16.692440032958984,21.5,16.8700008392334)
                lineTo(13.0,21.739999771118164)
                curveTo(12.381197929382324,22.097265243530273,11.618802070617676,22.097265243530273,11.0,21.739999771118164)
                lineTo(2.5,16.869998931884766)
                curveTo(2.186689615249634,16.69243812561035,1.9930518865585327,16.360126495361328,1.9930518865585327,15.999999046325684)
                curveTo(1.9930518865585327,15.639872550964355,2.186689615249634,15.307559967041016,2.5,15.129999160766602)
                lineTo(4.0,14.284998893737793)
            }
}

public val LucideIcons.All.Layers2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Layers2: ImageVector
    @Composable get() = Layers2Definition.asImageVector()
