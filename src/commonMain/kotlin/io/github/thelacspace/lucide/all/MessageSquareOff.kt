package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,19.0f)
                lineTo(6.828f,19.0f)
                curveTo(6.2976103f,19.000113f,5.7889853f,19.210901f,5.414f,19.586f)
                lineTo(3.2120001f,21.788f)
                curveTo(3.0128727f,22.001991f,2.701741f,22.06972f,2.4316819f,21.957863f)
                curveTo(2.1616225f,21.846006f,1.9895006f,21.57812f,2.0f,21.286f)
                lineTo(2.0f,5.0f)
                curveTo(1.9999858f,4.211087f,2.463737f,3.4958763f,3.184f,3.174f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                lineTo(22.0f,16.344f)
            }
}

public val LucideIcons.All.MessageSquareOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareOff: ImageVector
    @Composable get() = MessageSquareOffDefinition.asImageVector()
