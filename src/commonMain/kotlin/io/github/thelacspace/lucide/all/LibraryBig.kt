package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LibraryBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(10.0,3.0)
                lineTo(11.0,3.0)
                lineTo(11.0,21.0)
                lineTo(10.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.399999618530273,18.899999618530273)
                curveTo(20.600000381469727,19.399999618530273,20.299999237060547,20.0,19.799999237060547,20.19999885559082)
                lineTo(17.899999618530273,20.899999618530273)
                curveTo(17.399999618530273,21.100000381469727,16.799999237060547,20.799999237060547,16.600000381469727,20.299999237060547)
                lineTo(11.100000381469727,5.099999904632568)
                curveTo(10.90000057220459,4.599999904632568,11.200000762939453,4.0,11.700000762939453,3.799999952316284)
                lineTo(13.600000381469727,3.0999999046325684)
                curveTo(14.100000381469727,2.8999998569488525,14.700000762939453,3.1999998092651367,14.90000057220459,3.6999998092651367)
                close()
            }
}

public val LucideIcons.All.LibraryBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LibraryBig: ImageVector
    @Composable get() = LibraryBigDefinition.asImageVector()
