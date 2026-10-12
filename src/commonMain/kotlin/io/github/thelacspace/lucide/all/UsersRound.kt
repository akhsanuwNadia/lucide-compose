package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UsersRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                curveTo(17.980303f,16.595688f,14.404357f,13.035697f,10.0f,13.035697f)
                curveTo(5.595643f,13.035697f,2.0196967f,16.595688f,2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                curveTo(4.991987f,9.791655f,5.943226f,11.450651f,7.4935226f,12.3488f)
                curveTo(9.043819f,13.246948f,10.956181f,13.246948f,12.506477f,12.3488f)
                curveTo(14.056774f,11.450651f,15.008013f,9.791655f,15.0f,8.0f)
                curveTo(15.008013f,6.2083454f,14.056774f,4.549349f,12.506477f,3.6512005f)
                curveTo(10.956181f,2.7530522f,9.043819f,2.7530522f,7.4935226f,3.6512005f)
                curveTo(5.943226f,4.549349f,4.991987f,6.2083454f,5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,20.0f)
                curveTo(22.0f,16.630001f,20.0f,13.5f,18.0f,12.0f)
                curveTo(19.335129f,10.998315f,20.08238f,9.396466f,19.992018f,7.7297997f)
                curveTo(19.901657f,6.0631332f,18.9856f,4.5514646f,17.55f,3.6999998f)
            }
}

public val LucideIcons.All.UsersRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UsersRound: ImageVector
    @Composable get() = UsersRoundDefinition.asImageVector()
