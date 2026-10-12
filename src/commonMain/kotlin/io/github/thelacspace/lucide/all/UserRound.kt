package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,8.0f)
                curveTo(6.991987f,9.791655f,7.943226f,11.450651f,9.493523f,12.3488f)
                curveTo(11.043819f,13.246948f,12.956181f,13.246948f,14.506477f,12.3488f)
                curveTo(16.056774f,11.450651f,17.008013f,9.791655f,17.0f,8.0f)
                curveTo(17.008013f,6.2083454f,16.056774f,4.549349f,14.506477f,3.6512005f)
                curveTo(12.956181f,2.7530522f,11.043819f,2.7530522f,9.493523f,3.6512005f)
                curveTo(7.943226f,4.549349f,6.991987f,6.2083454f,7.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,21.0f)
                curveTo(19.980303f,16.595688f,16.404356f,13.035697f,12.0f,13.035697f)
                curveTo(7.595643f,13.035697f,4.0196967f,16.595688f,4.0f,21.0f)
            }
}

public val LucideIcons.All.UserRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRound: ImageVector
    @Composable get() = UserRoundDefinition.asImageVector()
