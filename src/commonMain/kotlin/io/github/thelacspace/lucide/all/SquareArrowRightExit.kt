package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowRightExit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.0)
                lineTo(21.0,12.0)
                lineTo(17.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,6.343999862670898)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
                lineTo(21.0,17.6560001373291)
            }
}

public val LucideIcons.All.SquareArrowRightExitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowRightExit: ImageVector
    @Composable get() = SquareArrowRightExitDefinition.asImageVector()
