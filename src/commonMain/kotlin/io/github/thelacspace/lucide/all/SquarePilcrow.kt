package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePilcrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(9.5f,12.0f)
                curveTo(8.123652f,11.993845f,7.0111556f,10.876362f,7.0111556f,9.5f)
                curveTo(7.0111556f,8.123638f,8.123652f,7.006155f,9.5f,7.0f)
                lineTo(17.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(16.0f,17.0f)
            }
}

public val LucideIcons.All.SquarePilcrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePilcrow: ImageVector
    @Composable get() = SquarePilcrowDefinition.asImageVector()
