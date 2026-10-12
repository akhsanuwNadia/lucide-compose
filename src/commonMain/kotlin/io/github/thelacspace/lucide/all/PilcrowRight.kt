package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PilcrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(7.0,9.0)
                curveTo(5.348382949829102,8.992613792419434,4.013386249542236,7.6516337394714355,4.013386249542236,6.0)
                curveTo(4.013386249542236,4.3483662605285645,5.348382949829102,3.0073862075805664,7.0,3.0)
                lineTo(15.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,14.0)
                lineTo(22.0,18.0)
                lineTo(2.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.PilcrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PilcrowRight: ImageVector
    @Composable get() = PilcrowRightDefinition.asImageVector()
