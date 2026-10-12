package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.73f,18.0f)
                lineTo(13.73f,4.0f)
                curveTo(13.374877f,3.3733792f,12.710254f,2.9861038f,11.99f,2.9861038f)
                curveTo(11.269746f,2.9861038f,10.605123f,3.3733792f,10.25f,4.0f)
                lineTo(2.25f,18.0f)
                curveTo(1.8910892f,18.621584f,1.892786f,19.387835f,2.2544463f,20.007824f)
                curveTo(2.6161065f,20.627811f,3.2822654f,21.006458f,4.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.714165f,20.999268f,21.373747f,20.61778f,21.730513f,19.999113f)
                curveTo(22.087278f,19.380444f,22.087082f,18.618484f,21.73f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.01f,17.0f)
            }
}

public val LucideIcons.All.TriangleAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleAlert: ImageVector
    @Composable get() = TriangleAlertDefinition.asImageVector()
