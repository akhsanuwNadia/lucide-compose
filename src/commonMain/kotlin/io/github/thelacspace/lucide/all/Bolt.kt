package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bolt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(21.0f,8.0f)
                curveTo(20.999268f,7.2862015f,20.618168f,6.626899f,20.0f,6.27f)
                lineTo(13.0f,2.27f)
                curveTo(12.381198f,1.9127344f,11.618802f,1.9127344f,11.0f,2.27f)
                lineTo(4.0f,6.27f)
                curveTo(3.381832f,6.626899f,3.0007322f,7.2862015f,3.0f,8.0f)
                lineTo(3.0f,16.0f)
                curveTo(3.0007324f,16.713799f,3.3818321f,17.3731f,4.0f,17.73f)
                lineTo(11.0f,21.73f)
                curveTo(11.618802f,22.087265f,12.381198f,22.087265f,13.0f,21.73f)
                lineTo(20.0f,17.73f)
                curveTo(20.618168f,17.3731f,20.999268f,16.713799f,21.0f,16.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.99359f,13.433324f,8.7545805f,14.760521f,9.994819f,15.479039f)
                curveTo(11.235056f,16.197557f,12.764944f,16.197557f,14.005181f,15.479039f)
                curveTo(15.2454195f,14.760521f,16.00641f,13.433324f,16.0f,12.0f)
                curveTo(16.00641f,10.566676f,15.2454195f,9.239479f,14.005181f,8.520961f)
                curveTo(12.764944f,7.8024416f,11.235056f,7.8024416f,9.994819f,8.520961f)
                curveTo(8.7545805f,9.239479f,7.99359f,10.566676f,8.0f,12.0f)
            }
}

public val LucideIcons.All.BoltDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bolt: ImageVector
    @Composable get() = BoltDefinition.asImageVector()
