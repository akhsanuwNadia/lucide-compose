package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmSmoke") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,21.0f)
                curveTo(11.0f,18.5f,13.0f,18.5f,13.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                curveTo(16.0f,18.5f,18.0f,18.5f,18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,8.0f)
                lineTo(18.2f,11.0f)
                curveTo(18.083158f,11.572993f,17.584671f,11.9884f,17.0f,12.0f)
                lineTo(7.0f,12.0f)
                curveTo(6.4153304f,11.9884f,5.916842f,11.572993f,5.8f,11.0f)
                lineTo(5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                curveTo(21.552284f,3.0f,22.0f,3.4477153f,22.0f,4.0f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,7.1045694f,21.10457f,8.0f,20.0f,8.0f)
                lineTo(4.0f,8.0f)
                curveTo(2.8954306f,8.0f,2.0f,7.1045694f,2.0f,6.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,3.4477153f,2.4477153f,3.0f,3.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                curveTo(6.0f,18.5f,8.0f,18.5f,8.0f,16.0f)
            }
}

public val LucideIcons.All.AlarmSmokeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmSmoke: ImageVector
    @Composable get() = AlarmSmokeDefinition.asImageVector()
