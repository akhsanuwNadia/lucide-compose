package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskConical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,8.0)
                curveTo(13.999857902526855,8.33548355102539,14.08410930633545,8.665613174438477,14.244999885559082,8.960000038146973)
                lineTo(19.755001068115234,19.040000915527344)
                curveTo(20.094083786010742,19.65972328186035,20.081087112426758,20.412357330322266,19.720809936523438,21.020004272460938)
                curveTo(19.360532760620117,21.627649307250977,18.706422805786133,22.000164031982422,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(5.293577194213867,22.000164031982422,4.639467239379883,21.627649307250977,4.279190540313721,21.020004272460938)
                curveTo(3.9189138412475586,20.412357330322266,3.9059174060821533,19.65972328186035,4.244999885559082,19.040000915527344)
                lineTo(9.755000114440918,8.960000991821289)
                curveTo(9.91589069366455,8.665614128112793,10.000142097473145,8.33548355102539,10.0,8.0)
                lineTo(10.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.453000068664551,15.0)
                lineTo(17.547000885009766,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,2.0)
                lineTo(15.5,2.0)
            }
}

public val LucideIcons.All.FlaskConicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskConical: ImageVector
    @Composable get() = FlaskConicalDefinition.asImageVector()
