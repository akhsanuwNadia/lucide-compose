package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskConicalOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,4.3429999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,8.343000411987305)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(5.293577194213867,22.000164031982422,4.639467239379883,21.627649307250977,4.279190540313721,21.020004272460938)
                curveTo(3.9189138412475586,20.412357330322266,3.9059174060821533,19.65972328186035,4.244999885559082,19.040000915527344)
                lineTo(9.472000122070312,9.477001190185547)
            }
            lucidePath(strokeWidth) {
                moveTo(6.453000068664551,15.0)
                lineTo(15.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,2.0)
                lineTo(15.5,2.0)
            }
}

public val LucideIcons.All.FlaskConicalOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskConicalOff: ImageVector
    @Composable get() = FlaskConicalOffDefinition.asImageVector()
