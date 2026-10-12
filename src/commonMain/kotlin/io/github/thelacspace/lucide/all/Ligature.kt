package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ligature") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(16.0,12.0)
                lineTo(16.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(18.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                lineTo(10.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,20.0)
                lineTo(8.0,8.0)
                curveTo(8.000079154968262,6.189647197723389,9.216046333312988,4.605034828186035,10.96471118927002,4.136475086212158)
                curveTo(12.71337604522705,3.6679153442382812,14.558745384216309,4.432234287261963,15.464000701904297,6.0)
            }
}

public val LucideIcons.All.LigatureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ligature: ImageVector
    @Composable get() = LigatureDefinition.asImageVector()
