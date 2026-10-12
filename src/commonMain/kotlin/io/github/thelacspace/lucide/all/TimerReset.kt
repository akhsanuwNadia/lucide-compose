package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TimerReset") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,13.0f)
                curveTo(4.5068283f,8.976169f,7.9444995f,5.9682064f,12.0f,6.0f)
                curveTo(15.557782f,6.0037813f,18.685572f,8.356663f,19.67555f,11.773938f)
                curveTo(20.66553f,15.191214f,19.279789f,18.851658f,16.274965f,20.756615f)
                curveTo(13.270142f,22.661572f,9.3683405f,22.35325f,6.7f,20.0f)
                lineTo(4.0f,17.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(4.0f,17.0f)
                lineTo(4.0f,22.0f)
            }
}

public val LucideIcons.All.TimerResetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TimerReset: ImageVector
    @Composable get() = TimerResetDefinition.asImageVector()
