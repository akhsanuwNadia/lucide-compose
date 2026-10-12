package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Amphora") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,7.632f)
                curveTo(10.0f,8.056f,9.728f,8.427f,9.347f,8.614f)
                curveTo(7.296249f,9.624971f,5.998323f,11.713597f,6.0f,14.0f)
                curveTo(6.006f,18.0f,9.0f,21.0f,11.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                lineTo(8.0f,5.0f)
                curveTo(6.898922f,5.0049243f,6.0089245f,5.898911f,6.0089245f,7.0f)
                curveTo(6.0089245f,8.1010895f,6.898922f,8.995076f,8.0f,9.0f)
                lineTo(8.68f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.632f)
                curveTo(14.0f,8.056f,14.272f,8.427f,14.652f,8.614f)
                curveTo(16.70314f,9.624689f,18.00149f,11.713372f,18.0f,14.0f)
                curveTo(18.0f,18.0f,15.0f,21.0f,13.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                lineTo(16.0f,5.0f)
                curveTo(17.101078f,5.0049243f,17.991076f,5.898911f,17.991076f,7.0f)
                curveTo(17.991076f,8.1010895f,17.101078f,8.995076f,16.0f,9.0f)
                lineTo(15.32f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(15.0f,2.0f)
            }
}

public val LucideIcons.All.AmphoraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Amphora: ImageVector
    @Composable get() = AmphoraDefinition.asImageVector()
