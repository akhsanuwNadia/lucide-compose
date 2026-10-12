package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrub") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,16.828f)
                curveTo(11.9998865f,16.29761f,11.789099f,15.788985f,11.414f,15.414f)
                lineTo(9.5f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,14.5f)
                lineTo(12.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,8.8f)
                curveTo(19.392181f,10.172999f,20.54015f,13.000045f,19.782413f,15.652119f)
                curveTo(19.02468f,18.304192f,16.556456f,20.09804f,13.8f,20.0f)
                lineTo(10.0f,20.0f)
                curveTo(7.1871686f,19.80903f,4.818141f,17.82654f,4.134359f,15.091411f)
                curveTo(3.4505763f,12.356281f,4.6079574f,9.4921875f,7.0f,8.0f)
                curveTo(7.0123105f,5.2473044f,9.247277f,3.0223107f,12.0f,3.0223107f)
                curveTo(14.752723f,3.0223107f,16.98769f,5.2473044f,17.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.ShrubDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrub: ImageVector
    @Composable get() = ShrubDefinition.asImageVector()
