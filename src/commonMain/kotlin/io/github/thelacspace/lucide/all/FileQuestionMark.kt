package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileQuestionMark") { strokeWidth ->
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
                moveTo(12.0,17.0)
                lineTo(12.010000228881836,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.100000381469727,9.0)
                curveTo(9.595282554626465,7.635031223297119,10.997032165527344,6.820712566375732,12.428110122680664,7.0666022300720215)
                curveTo(13.859187126159668,7.3124918937683105,14.908734321594238,8.547995567321777,14.920000076293945,10.0)
                curveTo(14.920000076293945,12.0,11.920000076293945,13.0,11.920000076293945,13.0)
            }
}

public val LucideIcons.All.FileQuestionMarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileQuestionMark: ImageVector
    @Composable get() = FileQuestionMarkDefinition.asImageVector()
