package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Popcorn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                curveTo(19.101078f,7.9950757f,19.991076f,7.101089f,19.991076f,6.0f)
                curveTo(19.991076f,4.898911f,19.101078f,4.0049243f,18.0f,4.0f)
                curveTo(17.995075f,2.8989217f,17.10109f,2.0089242f,16.0f,2.0089242f)
                curveTo(14.8989105f,2.0089242f,14.004924f,2.8989217f,14.0f,4.0f)
                curveTo(13.995076f,2.8989217f,13.1010895f,2.0089242f,12.0f,2.0089242f)
                curveTo(10.8989105f,2.0089242f,10.004924f,2.8989217f,10.0f,4.0f)
                curveTo(9.995076f,2.8989217f,9.1010895f,2.0089242f,8.0f,2.0089242f)
                curveTo(6.898911f,2.0089242f,6.0049243f,2.8989217f,6.0f,4.0f)
                curveTo(4.898922f,4.0049243f,4.0089245f,4.898911f,4.0089245f,6.0f)
                curveTo(4.0089245f,7.101089f,4.898922f,7.9950757f,6.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(9.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,22.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,8.0f)
                curveTo(20.5f,8.0f,20.9f,8.4f,20.8f,9.0f)
                lineTo(18.199999f,21.0f)
                curveTo(18.099998f,21.5f,17.499998f,22.0f,16.999998f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(6.4f,22.0f,5.9f,21.6f,5.8f,21.0f)
                lineTo(3.2f,9.0f)
                curveTo(3.1000001f,8.4f,3.5f,8.0f,4.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.PopcornDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Popcorn: ImageVector
    @Composable get() = PopcornDefinition.asImageVector()
