package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sticker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                curveTo(21.001569747924805,8.359942436218262,20.747406005859375,7.745773792266846,20.29400062561035,7.294000148773193)
                lineTo(16.70600128173828,3.7060000896453857)
                curveTo(16.254226684570312,3.252593517303467,15.640058517456055,2.998430013656616,15.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(15.0,8.0)
                curveTo(15.0,8.552285194396973,15.447714805603027,9.0,16.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,13.0)
                lineTo(8.010000228881836,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                lineTo(16.010000228881836,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                curveTo(10.0,16.0,10.800000190734863,17.0,12.0,17.0)
                curveTo(13.300000190734863,17.0,14.0,16.0,14.0,16.0)
            }
}

public val LucideIcons.All.StickerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sticker: ImageVector
    @Composable get() = StickerDefinition.asImageVector()
