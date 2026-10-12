package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Backpack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                curveTo(4.0,7.790861129760742,5.790861129760742,6.0,8.0,6.0)
                lineTo(16.0,6.0)
                curveTo(18.209138870239258,6.0,20.0,7.790861129760742,20.0,10.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(16.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(8.0,16.0)
                curveTo(8.0,14.895430564880371,8.895430564880371,14.0,10.0,14.0)
                lineTo(14.0,14.0)
                curveTo(15.104569435119629,14.0,16.0,14.895430564880371,16.0,16.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(9.0,4.0)
                curveTo(9.0,2.895430564880371,9.895430564880371,2.0,11.0,2.0)
                lineTo(13.0,2.0)
                curveTo(14.104569435119629,2.0,15.0,2.895430564880371,15.0,4.0)
                lineTo(15.0,6.0)
            }
}

public val LucideIcons.All.BackpackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Backpack: ImageVector
    @Composable get() = BackpackDefinition.asImageVector()
