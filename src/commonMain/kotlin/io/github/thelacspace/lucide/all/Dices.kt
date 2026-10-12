package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dices") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                lineTo(12.0,10.0)
                curveTo(13.104569435119629,10.0,14.0,10.895430564880371,14.0,12.0)
                lineTo(14.0,20.0)
                curveTo(14.0,21.104570388793945,13.104569435119629,22.0,12.0,22.0)
                lineTo(4.0,22.0)
                curveTo(2.895430564880371,22.0,2.0,21.104570388793945,2.0,20.0)
                lineTo(2.0,12.0)
                curveTo(2.0,10.895430564880371,2.895430564880371,10.0,4.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.920000076293945,14.0)
                lineTo(21.420000076293945,10.5)
                curveTo(22.188518524169922,9.647655487060547,22.188518524169922,8.352344512939453,21.420000076293945,7.5)
                lineTo(16.420000076293945,2.5799999237060547)
                curveTo(15.567655563354492,1.8114806413650513,14.272344589233398,1.8114806413650513,13.420000076293945,2.5799999237060547)
                lineTo(10.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(6.010000228881836,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.0)
                lineTo(10.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(15.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,9.0)
                lineTo(18.010000228881836,9.0)
            }
}

public val LucideIcons.All.DicesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dices: ImageVector
    @Composable get() = DicesDefinition.asImageVector()
