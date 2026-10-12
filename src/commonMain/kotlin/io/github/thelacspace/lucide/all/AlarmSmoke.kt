package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmSmoke") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,21.0)
                curveTo(11.0,18.5,13.0,18.5,13.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                curveTo(16.0,18.5,18.0,18.5,18.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,8.0)
                lineTo(18.200000762939453,11.0)
                curveTo(18.083158493041992,11.572993278503418,17.584671020507812,11.98840045928955,17.0,12.0)
                lineTo(7.0,12.0)
                curveTo(6.415330410003662,11.98840045928955,5.916841983795166,11.572993278503418,5.800000190734863,11.0)
                lineTo(5.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                curveTo(21.552284240722656,3.0,22.0,3.4477152824401855,22.0,4.0)
                lineTo(22.0,6.0)
                curveTo(22.0,7.104569435119629,21.104570388793945,8.0,20.0,8.0)
                lineTo(4.0,8.0)
                curveTo(2.895430564880371,8.0,2.0,7.104569435119629,2.0,6.0)
                lineTo(2.0,4.0)
                curveTo(2.0,3.4477152824401855,2.4477152824401855,3.0,3.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                curveTo(6.0,18.5,8.0,18.5,8.0,16.0)
            }
}

public val LucideIcons.All.AlarmSmokeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmSmoke: ImageVector
    @Composable get() = AlarmSmokeDefinition.asImageVector()
