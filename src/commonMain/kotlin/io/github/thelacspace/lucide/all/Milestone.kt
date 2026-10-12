package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Milestone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,13.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.172f,6.0f)
                curveTo(18.70239f,6.0001135f,19.211016f,6.2109013f,19.586f,6.586f)
                lineTo(21.646f,8.646f)
                curveTo(21.872677f,8.872398f,22.000044f,9.179627f,22.000044f,9.5f)
                curveTo(22.000044f,9.820373f,21.872677f,10.127602f,21.646f,10.354f)
                lineTo(19.586f,12.414f)
                curveTo(19.211016f,12.789099f,18.70239f,12.9998865f,18.172f,13.0f)
                lineTo(4.0f,13.0f)
                curveTo(3.4477153f,13.0f,3.0f,12.552285f,3.0f,12.0f)
                lineTo(3.0f,7.0f)
                curveTo(3.0f,6.4477153f,3.4477153f,6.0f,4.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.MilestoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Milestone: ImageVector
    @Composable get() = MilestoneDefinition.asImageVector()
