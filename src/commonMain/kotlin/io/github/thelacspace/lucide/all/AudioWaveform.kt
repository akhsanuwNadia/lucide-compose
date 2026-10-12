package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AudioWaveform") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                curveTo(3.104569435119629,13.0,4.0,12.104569435119629,4.0,11.0)
                lineTo(4.0,7.0)
                curveTo(4.004924297332764,5.898921966552734,4.898910999298096,5.00892448425293,6.0,5.00892448425293)
                curveTo(7.101089000701904,5.00892448425293,7.995075702667236,5.898921966552734,8.0,7.0)
                lineTo(8.0,20.0)
                curveTo(8.004923820495605,21.101078033447266,8.898910522460938,21.99107551574707,10.0,21.99107551574707)
                curveTo(11.101089477539062,21.99107551574707,11.995076179504395,21.101078033447266,12.0,20.0)
                lineTo(12.0,4.0)
                curveTo(12.004923820495605,2.8989217281341553,12.898910522460938,2.0089242458343506,14.0,2.0089242458343506)
                curveTo(15.101089477539062,2.0089242458343506,15.995076179504395,2.8989217281341553,16.0,4.0)
                lineTo(16.0,17.0)
                curveTo(16.004924774169922,18.101078033447266,16.898910522460938,18.99107551574707,18.0,18.99107551574707)
                curveTo(19.101089477539062,18.99107551574707,19.995075225830078,18.101078033447266,20.0,17.0)
                lineTo(20.0,13.0)
                curveTo(20.0,11.895430564880371,20.895429611206055,11.0,22.0,11.0)
            }
}

public val LucideIcons.All.AudioWaveformDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AudioWaveform: ImageVector
    @Composable get() = AudioWaveformDefinition.asImageVector()
