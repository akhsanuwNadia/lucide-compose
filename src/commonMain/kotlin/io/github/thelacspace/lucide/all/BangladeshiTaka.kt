package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BangladeshiTaka") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,5.0f)
                curveTo(6.0049243f,3.8989217f,6.898911f,3.0089242f,8.0f,3.0089242f)
                curveTo(9.1010895f,3.0089242f,9.995076f,3.8989217f,10.0f,5.0f)
                lineTo(10.0f,17.0f)
                curveTo(10.009849f,19.202156f,11.797822f,20.982151f,14.0f,20.982151f)
                curveTo(16.202179f,20.982151f,17.990152f,19.202156f,18.0f,17.0f)
                curveTo(17.995075f,15.898922f,17.10109f,15.0089245f,16.0f,15.0089245f)
                curveTo(14.8989105f,15.0089245f,14.004924f,15.898922f,14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                lineTo(18.0f,9.0f)
            }
}

public val LucideIcons.All.BangladeshiTakaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BangladeshiTaka: ImageVector
    @Composable get() = BangladeshiTakaDefinition.asImageVector()
