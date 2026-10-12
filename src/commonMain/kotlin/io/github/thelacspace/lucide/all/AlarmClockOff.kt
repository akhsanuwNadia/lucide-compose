package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmClockOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.87f,6.87f)
                curveTo(4.5177736f,8.803171f,3.4668024f,11.903973f,4.1588683f,14.868962f)
                curveTo(4.8509345f,17.833952f,7.166049f,20.149067f,10.131039f,20.841133f)
                curveTo(13.096028f,21.5332f,16.196829f,20.482227f,18.130001f,18.130001f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.9f,14.25f)
                curveTo(20.299273f,11.721758f,19.46468f,9.155107f,17.654787f,7.3452134f)
                curveTo(15.844893f,5.5353203f,13.278242f,4.7007284f,10.75f,5.1000004f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(19.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.26f,18.67f)
                lineTo(4.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(2.0f,6.0f)
            }
}

public val LucideIcons.All.AlarmClockOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmClockOff: ImageVector
    @Composable get() = AlarmClockOffDefinition.asImageVector()
