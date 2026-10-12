package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.01f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.128f,16.949f)
                curveTo(4.662941f,16.512465f,2.0497742f,13.588645f,2.0035717f,10.096501f)
                curveTo(1.9573693f,6.604358f,4.492268f,3.6124287f,7.944566f,3.0843737f)
                curveTo(11.396864f,2.5563188f,14.710213f,4.6537147f,15.71f,8.0f)
                lineTo(17.5f,8.0f)
                curveTo(19.977427f,8.01108f,21.97992f,10.02255f,21.97992f,12.5f)
                curveTo(21.97992f,14.97745f,19.977427f,16.98892f,17.5f,17.0f)
                lineTo(15.858f,17.0f)
            }
}

public val LucideIcons.All.CloudAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudAlert: ImageVector
    @Composable get() = CloudAlertDefinition.asImageVector()
