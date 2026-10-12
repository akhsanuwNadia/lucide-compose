package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.9f,18.55f)
                lineTo(12.9f,2.5699997f)
                curveTo(12.732913f,2.2250092f,12.383322f,2.0058894f,12.0f,2.0058894f)
                curveTo(11.616677f,2.0058894f,11.267086f,2.2250092f,11.099999f,2.5699997f)
                lineTo(3.0999994f,18.55f)
            }
}

public val LucideIcons.All.ConeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cone: ImageVector
    @Composable get() = ConeDefinition.asImageVector()
