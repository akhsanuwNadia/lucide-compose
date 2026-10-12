package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Voicemail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.99359f,13.433324f,2.7545807f,14.760521f,3.9948182f,15.479039f)
                curveTo(5.235056f,16.197557f,6.764944f,16.197557f,8.005181f,15.479039f)
                curveTo(9.2454195f,14.760521f,10.00641f,13.433324f,10.0f,12.0f)
                curveTo(10.00641f,10.566676f,9.2454195f,9.239479f,8.005181f,8.520961f)
                curveTo(6.764944f,7.8024416f,5.235056f,7.8024416f,3.9948182f,8.520961f)
                curveTo(2.7545807f,9.239479f,1.99359f,10.566676f,2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(13.99359f,13.433324f,14.7545805f,14.760521f,15.994819f,15.479039f)
                curveTo(17.235056f,16.197557f,18.764944f,16.197557f,20.005182f,15.479039f)
                curveTo(21.245419f,14.760521f,22.00641f,13.433324f,22.0f,12.0f)
                curveTo(22.00641f,10.566676f,21.245419f,9.239479f,20.005182f,8.520961f)
                curveTo(18.764944f,7.8024416f,17.235056f,7.8024416f,15.994819f,8.520961f)
                curveTo(14.7545805f,9.239479f,13.99359f,10.566676f,14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(18.0f,16.0f)
            }
}

public val LucideIcons.All.VoicemailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Voicemail: ImageVector
    @Composable get() = VoicemailDefinition.asImageVector()
