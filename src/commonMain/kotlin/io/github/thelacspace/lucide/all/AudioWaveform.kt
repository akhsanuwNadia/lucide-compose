package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioWaveform") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                curveTo(3.1045694f,13.0f,4.0f,12.104569f,4.0f,11.0f)
                lineTo(4.0f,7.0f)
                curveTo(4.0049243f,5.898922f,4.898911f,5.0089245f,6.0f,5.0089245f)
                curveTo(7.101089f,5.0089245f,7.9950757f,5.898922f,8.0f,7.0f)
                lineTo(8.0f,20.0f)
                curveTo(8.004924f,21.101078f,8.8989105f,21.991076f,10.0f,21.991076f)
                curveTo(11.1010895f,21.991076f,11.995076f,21.101078f,12.0f,20.0f)
                lineTo(12.0f,4.0f)
                curveTo(12.004924f,2.8989217f,12.8989105f,2.0089242f,14.0f,2.0089242f)
                curveTo(15.1010895f,2.0089242f,15.995076f,2.8989217f,16.0f,4.0f)
                lineTo(16.0f,17.0f)
                curveTo(16.004925f,18.101078f,16.89891f,18.991076f,18.0f,18.991076f)
                curveTo(19.10109f,18.991076f,19.995075f,18.101078f,20.0f,17.0f)
                lineTo(20.0f,13.0f)
                curveTo(20.0f,11.895431f,20.89543f,11.0f,22.0f,11.0f)
            }
}

public val LucideIcons.All.AudioWaveformDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioWaveform: ImageVector
    @Composable get() = AudioWaveformDefinition.asImageVector()
