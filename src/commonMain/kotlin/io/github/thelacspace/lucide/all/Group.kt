package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Group") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.9000000953674316,3.9000000953674316,3.0,5.0,3.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.100000381469727,3.0,21.0,3.9000000953674316,21.0,5.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.100000381469727,20.100000381469727,21.0,19.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.9000000953674316,21.0,3.0,20.100000381469727,3.0,19.0)
                lineTo(3.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,7.0)
                lineTo(13.0,7.0)
                lineTo(14.0,7.0)
                lineTo(14.0,12.0)
                lineTo(13.0,12.0)
                lineTo(8.0,12.0)
                lineTo(7.0,12.0)
                lineTo(7.0,7.0)
                lineTo(8.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(16.0,12.0)
                lineTo(17.0,12.0)
                lineTo(17.0,17.0)
                lineTo(16.0,17.0)
                lineTo(11.0,17.0)
                lineTo(10.0,17.0)
                lineTo(10.0,12.0)
                lineTo(11.0,12.0)
                close()
            }
}

public val LucideIcons.All.GroupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Group: ImageVector
    @Composable get() = GroupDefinition.asImageVector()
