package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePilcrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(9.5,12.0)
                curveTo(8.123652458190918,11.993844985961914,7.011155605316162,10.876361846923828,7.011155605316162,9.5)
                curveTo(7.011155605316162,8.123638153076172,8.123652458190918,7.006155014038086,9.5,7.0)
                lineTo(17.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(16.0,17.0)
            }
}

public val LucideIcons.All.SquarePilcrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePilcrow: ImageVector
    @Composable get() = SquarePilcrowDefinition.asImageVector()
