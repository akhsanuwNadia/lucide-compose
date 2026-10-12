package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Anvil") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(6.0,10.0)
                curveTo(3.790860891342163,10.0,2.0,8.209138870239258,2.0,6.0)
                curveTo(2.0,5.4477152824401855,2.4477152824401855,5.0,3.0,5.0)
                lineTo(7.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,5.0)
                curveTo(7.0,4.4477152824401855,7.4477152824401855,4.0,8.0,4.0)
                lineTo(21.0,4.0)
                curveTo(21.552284240722656,4.0,22.0,4.4477152824401855,22.0,5.0)
                curveTo(22.0,8.86599349975586,18.86599349975586,12.0,15.0,12.0)
                lineTo(8.0,12.0)
                curveTo(7.4477152824401855,12.0,7.0,11.552285194396973,7.0,11.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                curveTo(5.0,18.3431453704834,6.343145847320557,17.0,8.0,17.0)
                lineTo(16.0,17.0)
                curveTo(17.6568546295166,17.0,19.0,18.3431453704834,19.0,20.0)
                curveTo(19.0,20.552284240722656,18.552284240722656,21.0,18.0,21.0)
                lineTo(6.0,21.0)
                curveTo(5.4477152824401855,21.0,5.0,20.552284240722656,5.0,20.0)
            }
}

public val LucideIcons.All.AnvilDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Anvil: ImageVector
    @Composable get() = AnvilDefinition.asImageVector()
