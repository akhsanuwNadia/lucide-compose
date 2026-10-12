package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PilcrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,9.0)
                lineTo(11.0,9.0)
                curveTo(9.348382949829102,8.992613792419434,8.013386726379395,7.6516337394714355,8.013386726379395,6.0)
                curveTo(8.013386726379395,4.3483662605285645,9.348382949829102,3.0073862075805664,11.0,3.0)
                lineTo(20.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,3.0)
                lineTo(18.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(2.0,18.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,22.0)
                lineTo(2.0,18.0)
            }
}

public val LucideIcons.All.PilcrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PilcrowLeft: ImageVector
    @Composable get() = PilcrowLeftDefinition.asImageVector()
