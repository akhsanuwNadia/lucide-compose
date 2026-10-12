package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IndianRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(18.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(18.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(14.5,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(9.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                curveTo(15.666999816894531,13.0,15.666999816894531,3.0,9.0,3.0)
            }
}

public val LucideIcons.All.IndianRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IndianRupee: ImageVector
    @Composable get() = IndianRupeeDefinition.asImageVector()
