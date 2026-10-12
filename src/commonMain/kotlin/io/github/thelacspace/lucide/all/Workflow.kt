package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Workflow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(9.0,3.0)
                lineTo(11.0,3.0)
                lineTo(11.0,11.0)
                lineTo(9.0,11.0)
                lineTo(5.0,11.0)
                lineTo(3.0,11.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                lineTo(7.0,15.0)
                curveTo(7.0,16.104570388793945,7.895430564880371,17.0,9.0,17.0)
                lineTo(13.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,13.0)
                lineTo(19.0,13.0)
                lineTo(21.0,13.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(15.0,21.0)
                lineTo(13.0,21.0)
                lineTo(13.0,13.0)
                lineTo(15.0,13.0)
                close()
            }
}

public val LucideIcons.All.WorkflowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Workflow: ImageVector
    @Composable get() = WorkflowDefinition.asImageVector()
