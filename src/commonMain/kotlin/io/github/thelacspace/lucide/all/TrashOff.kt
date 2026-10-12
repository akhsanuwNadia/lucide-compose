package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrashOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.0)
                lineTo(10.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(16.0,4.0)
                curveTo(16.0,2.895430564880371,15.104569435119629,2.0,14.0,2.0)
                lineTo(10.0,2.0)
                curveTo(9.384474754333496,1.999843716621399,8.803163528442383,2.2831225395202637,8.423999786376953,2.7680001258850098)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,6.0)
                lineTo(19.0,13.343999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,6.0)
                lineTo(11.656000137329102,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,6.0)
                lineTo(5.0,20.0)
                curveTo(5.0,21.104570388793945,5.895430564880371,22.0,7.0,22.0)
                lineTo(17.0,22.0)
                curveTo(18.104570388793945,22.0,19.0,21.104570388793945,19.0,20.0)
                lineTo(19.0,19.0)
            }
}

public val LucideIcons.All.TrashOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrashOff: ImageVector
    @Composable get() = TrashOffDefinition.asImageVector()
