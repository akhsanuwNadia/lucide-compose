package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Save") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.199999809265137,3.0)
                curveTo(15.727538108825684,3.007513999938965,16.23073959350586,3.2231712341308594,16.600000381469727,3.5999999046325684)
                lineTo(20.399999618530273,7.399999618530273)
                curveTo(20.77682876586914,7.769260406494141,20.99248504638672,8.2724609375,21.0,8.799999237060547)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,21.0)
                lineTo(17.0,14.0)
                curveTo(17.0,13.447714805603027,16.552284240722656,13.0,16.0,13.0)
                lineTo(8.0,13.0)
                curveTo(7.4477152824401855,13.0,7.0,13.447714805603027,7.0,14.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(7.0,7.0)
                curveTo(7.0,7.5522847175598145,7.4477152824401855,8.0,8.0,8.0)
                lineTo(15.0,8.0)
            }
}

public val LucideIcons.All.SaveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Save: ImageVector
    @Composable get() = SaveDefinition.asImageVector()
