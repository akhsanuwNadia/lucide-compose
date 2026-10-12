package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Smartphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(17.0f,2.0f)
                curveTo(18.10457f,2.0f,19.0f,2.8954306f,19.0f,4.0f)
                lineTo(19.0f,20.0f)
                curveTo(19.0f,21.10457f,18.10457f,22.0f,17.0f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(5.8954306f,22.0f,5.0f,21.10457f,5.0f,20.0f)
                lineTo(5.0f,4.0f)
                curveTo(5.0f,2.8954306f,5.8954306f,2.0f,7.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.01f,18.0f)
            }
}

public val LucideIcons.All.SmartphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Smartphone: ImageVector
    @Composable get() = SmartphoneDefinition.asImageVector()
