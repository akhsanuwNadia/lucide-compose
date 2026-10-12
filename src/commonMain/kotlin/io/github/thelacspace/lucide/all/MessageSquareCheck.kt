package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                curveTo(22.0f,18.10457f,21.10457f,19.0f,20.0f,19.0f)
                lineTo(6.828f,19.0f)
                curveTo(6.2976103f,19.000113f,5.7889853f,19.210901f,5.414f,19.586f)
                lineTo(3.2120001f,21.788f)
                curveTo(3.0128727f,22.001991f,2.701741f,22.06972f,2.4316819f,21.957863f)
                curveTo(2.1616225f,21.846006f,1.9895006f,21.57812f,2.0f,21.286f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(11.0f,13.0f)
                lineTo(15.0f,9.0f)
            }
}

public val LucideIcons.All.MessageSquareCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareCheck: ImageVector
    @Composable get() = MessageSquareCheckDefinition.asImageVector()
