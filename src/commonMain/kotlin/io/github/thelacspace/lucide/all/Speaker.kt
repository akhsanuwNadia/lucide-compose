package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Speaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,22.0f)
                lineTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,2.0f)
                lineTo(6.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                curveTo(7.99359f,15.433324f,8.7545805f,16.76052f,9.994819f,17.47904f)
                curveTo(11.235056f,18.197557f,12.764944f,18.197557f,14.005181f,17.47904f)
                curveTo(15.2454195f,16.76052f,16.00641f,15.433324f,16.0f,14.0f)
                curveTo(16.00641f,12.566676f,15.2454195f,11.239479f,14.005181f,10.520961f)
                curveTo(12.764944f,9.802442f,11.235056f,9.802442f,9.994819f,10.520961f)
                curveTo(8.7545805f,11.239479f,7.99359f,12.566676f,8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.01f,14.0f)
            }
}

public val LucideIcons.All.SpeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Speaker: ImageVector
    @Composable get() = SpeakerDefinition.asImageVector()
