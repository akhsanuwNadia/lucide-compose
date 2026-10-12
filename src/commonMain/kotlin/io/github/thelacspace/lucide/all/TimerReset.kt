package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TimerReset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,13.0)
                curveTo(4.506828308105469,8.976168632507324,7.944499492645264,5.968206405639648,12.0,6.0)
                curveTo(15.557782173156738,6.003781318664551,18.685571670532227,8.35666275024414,19.67555046081543,11.773938179016113)
                curveTo(20.665529251098633,15.191213607788086,19.279788970947266,18.85165786743164,16.274965286254883,20.756614685058594)
                curveTo(13.2701416015625,22.661571502685547,9.368340492248535,22.35325050354004,6.699999809265137,20.0)
                lineTo(4.0,17.600000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(4.0,17.0)
                lineTo(4.0,22.0)
            }
}

public val LucideIcons.All.TimerResetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TimerReset: ImageVector
    @Composable get() = TimerResetDefinition.asImageVector()
