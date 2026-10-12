package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorSpeaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.5f,20.0f)
                lineTo(8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,9.0f)
                lineTo(17.01f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(14.0f,20.0f)
                lineTo(12.0f,20.0f)
                lineTo(12.0f,4.0f)
                lineTo(14.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(4.0f,6.0f)
                curveTo(2.8954306f,6.0f,2.0f,6.8954306f,2.0f,8.0f)
                lineTo(2.0f,14.0f)
                curveTo(2.0f,15.104569f,2.8954306f,16.0f,4.0f,16.0f)
                lineTo(8.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,15.0f)
                curveTo(15.998398f,15.358331f,16.188644f,15.69013f,16.498705f,15.86976f)
                curveTo(16.808764f,16.049389f,17.191236f,16.049389f,17.501295f,15.86976f)
                curveTo(17.811356f,15.69013f,18.001602f,15.358331f,18.0f,15.0f)
                curveTo(18.001602f,14.641669f,17.811356f,14.30987f,17.501295f,14.13024f)
                curveTo(17.191236f,13.95061f,16.808764f,13.95061f,16.498705f,14.13024f)
                curveTo(16.188644f,14.30987f,15.998398f,14.641669f,16.0f,15.0f)
            }
}

public val LucideIcons.All.MonitorSpeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorSpeaker: ImageVector
    @Composable get() = MonitorSpeakerDefinition.asImageVector()
