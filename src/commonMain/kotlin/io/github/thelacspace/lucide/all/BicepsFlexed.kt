package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BicepsFlexed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.409f,13.017f)
                curveTo(13.348639f,10.838916f,15.689379f,9.620853f,18.012371f,10.101147f)
                curveTo(20.335361f,10.58144f,22.001146f,12.627876f,22.0f,15.0f)
                curveTo(22.0f,18.866f,18.0f,22.0f,13.0f,22.0f)
                curveTo(8.923f,22.0f,4.847f,21.18f,2.6289997f,19.538f)
                curveTo(2.2029996f,19.222f,1.9979997f,18.706f,2.0089998f,18.176f)
                curveTo(2.118f,12.723f,2.627f,2.0f,10.0f,2.0f)
                curveTo(11.656855f,2.0f,13.0f,3.3431458f,13.0f,5.0f)
                curveTo(13.0f,6.1045694f,12.104569f,7.0f,11.0f,7.0f)
                curveTo(9.895f,7.0f,9.36f,6.5559998f,9.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                curveTo(13.777315f,13.082474f,12.20208f,12.774681f,10.72395f,13.164483f)
                curveTo(9.24582f,13.554286f,8.02722f,14.598849f,7.416f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.964f,6.825f)
                curveTo(8.019f,7.977f,9.5f,13.0f,8.0f,15.0f)
            }
}

public val LucideIcons.All.BicepsFlexedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BicepsFlexed: ImageVector
    @Composable get() = BicepsFlexedDefinition.asImageVector()
