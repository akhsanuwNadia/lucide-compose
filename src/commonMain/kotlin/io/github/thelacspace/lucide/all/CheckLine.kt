package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CheckLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,4.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(4.0,10.0)
            }
}

public val LucideIcons.All.CheckLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CheckLine: ImageVector
    @Composable get() = CheckLineDefinition.asImageVector()
