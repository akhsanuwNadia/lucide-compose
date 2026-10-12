package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bomb") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                curveTo(1.9855775f,16.22498f,3.6978066f,19.211172f,6.488341f,20.827839f)
                curveTo(9.278875f,22.444506f,12.721125f,22.444506f,15.511659f,20.827839f)
                curveTo(18.302193f,19.211172f,20.014423f,16.22498f,20.0f,13.0f)
                curveTo(20.014423f,9.775022f,18.302193f,6.788828f,15.511659f,5.172161f)
                curveTo(12.721125f,3.5554938f,9.278875f,3.5554938f,6.488341f,5.172161f)
                curveTo(3.6978066f,6.788828f,1.9855775f,9.775022f,2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.35f,4.65f)
                lineTo(16.3f,2.7f)
                curveTo(17.240211f,1.7643266f,18.759787f,1.7643266f,19.699999f,2.7f)
                lineTo(21.3f,4.3f)
                curveTo(21.75189f,4.7503247f,22.005892f,5.3620367f,22.005892f,6.0f)
                curveTo(22.005892f,6.637964f,21.75189f,7.2496758f,21.3f,7.7000003f)
                lineTo(19.349998f,9.650001f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(20.5f,3.5f)
            }
}

public val LucideIcons.All.BombDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bomb: ImageVector
    @Composable get() = BombDefinition.asImageVector()
