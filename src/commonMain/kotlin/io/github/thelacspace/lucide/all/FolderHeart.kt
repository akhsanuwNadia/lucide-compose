package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.638f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,11.417f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.62f,18.8f)
                curveTo(14.046977f,18.20257f,13.848292f,17.338741f,14.102717f,16.550995f)
                curveTo(14.357142f,15.763249f,15.02358f,15.178835f,15.837804f,15.029458f)
                curveTo(16.652029f,14.88008f,17.482515f,15.189869f,18.0f,15.836f)
                curveTo(18.519878f,15.196741f,19.347599f,14.892783f,20.157635f,15.043669f)
                curveTo(20.96767f,15.194553f,21.630442f,15.776144f,21.88529f,16.559711f)
                curveTo(22.140139f,17.343279f,21.946299f,18.203474f,21.380001f,18.802f)
                lineTo(18.754002f,21.658f)
                curveTo(18.564451f,21.876255f,18.289577f,22.001598f,18.000502f,22.001598f)
                curveTo(17.711426f,22.001598f,17.436552f,21.876255f,17.247002f,21.658f)
                close()
            }
}

public val LucideIcons.All.FolderHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderHeart: ImageVector
    @Composable get() = FolderHeartDefinition.asImageVector()
