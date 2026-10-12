package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(21.0,21.0)
                moveTo(15.0,15.0)
                lineTo(15.0,19.799999237060547)
                moveTo(15.0,14.999999046325684)
                lineTo(19.799999237060547,14.999999046325684)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.799999237060547)
                lineTo(9.0,15.0)
                moveTo(9.0,15.0)
                lineTo(4.199999809265137,15.0)
                moveTo(9.0,15.0)
                lineTo(3.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,4.199999809265137)
                lineTo(15.0,9.0)
                moveTo(15.0,9.0)
                lineTo(19.799999237060547,9.0)
                moveTo(15.0,9.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,4.199999809265137)
                lineTo(9.0,9.0)
                moveTo(9.0,9.0)
                lineTo(4.199999809265137,9.0)
                moveTo(9.0,9.0)
                lineTo(3.0,3.0)
            }
}

public val LucideIcons.All.ShrinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrink: ImageVector
    @Composable get() = ShrinkDefinition.asImageVector()
