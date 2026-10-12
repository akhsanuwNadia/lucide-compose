package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MirrorRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,6.6f)
                lineTo(8.6f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,7.5f)
                lineTo(9.5f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(3.98718f,12.866648f,5.5091615f,15.521042f,7.9896364f,16.958078f)
                curveTo(10.470112f,18.395117f,13.529888f,18.395117f,16.010363f,16.958078f)
                curveTo(18.490839f,15.521042f,20.01282f,12.866648f,20.0f,10.0f)
                curveTo(20.01282f,7.1333523f,18.490839f,4.478958f,16.010363f,3.041921f)
                curveTo(13.529888f,1.6048834f,10.470112f,1.6048834f,7.9896364f,3.041921f)
                curveTo(5.5091615f,4.478958f,3.98718f,7.1333523f,4.0f,10.0f)
            }
}

public val LucideIcons.All.MirrorRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MirrorRound: ImageVector
    @Composable get() = MirrorRoundDefinition.asImageVector()
