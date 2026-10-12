package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CheckLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,4.0f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                lineTo(4.0f,10.0f)
            }
}

public val LucideIcons.All.CheckLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CheckLine: ImageVector
    @Composable get() = CheckLineDefinition.asImageVector()
