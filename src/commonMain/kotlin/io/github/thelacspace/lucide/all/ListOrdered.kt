package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListOrdered") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(5.0,4.0)
                lineTo(5.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                lineTo(6.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5,20.0)
                lineTo(3.4000000953674316,20.0)
                curveTo(3.4000000953674316,19.0,6.0,18.075000762939453,6.0,16.5)
                curveTo(6.000080585479736,15.882932662963867,5.622257709503174,15.328774452209473,5.047813892364502,15.103415489196777)
                curveTo(4.47337007522583,14.878056526184082,3.8195252418518066,15.027482986450195,3.4000000953674316,15.479999542236328)
            }
}

public val LucideIcons.All.ListOrderedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListOrdered: ImageVector
    @Composable get() = ListOrderedDefinition.asImageVector()
