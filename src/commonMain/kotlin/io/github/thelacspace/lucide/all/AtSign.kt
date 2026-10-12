package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AtSign") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.99359f,13.433324f,8.7545805f,14.760521f,9.994819f,15.479039f)
                curveTo(11.235056f,16.197557f,12.764944f,16.197557f,14.005181f,15.479039f)
                curveTo(15.2454195f,14.760521f,16.00641f,13.433324f,16.0f,12.0f)
                curveTo(16.00641f,10.566676f,15.2454195f,9.239479f,14.005181f,8.520961f)
                curveTo(12.764944f,7.8024416f,11.235056f,7.8024416f,9.994819f,8.520961f)
                curveTo(8.7545805f,9.239479f,7.99359f,10.566676f,8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                lineTo(16.0f,13.0f)
                curveTo(16.007387f,14.651617f,17.348366f,15.986613f,19.0f,15.986613f)
                curveTo(20.651634f,15.986613f,21.992613f,14.651617f,22.0f,13.0f)
                lineTo(22.0f,12.0f)
                curveTo(22.0f,7.3622246f,18.81124f,3.3330524f,14.297529f,2.2675102f)
                curveTo(9.783819f,1.2019677f,5.129804f,3.3797119f,3.0557282f,7.527864f)
                curveTo(0.98165196f,11.676016f,2.0318656f,16.705875f,5.5925255f,19.677517f)
                curveTo(9.153186f,22.64916f,14.28978f,22.782665f,18.0f,20.0f)
            }
}

public val LucideIcons.All.AtSignDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AtSign: ImageVector
    @Composable get() = AtSignDefinition.asImageVector()
