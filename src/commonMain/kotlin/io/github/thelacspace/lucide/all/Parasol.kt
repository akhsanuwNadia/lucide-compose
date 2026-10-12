package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Parasol") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f, 11.134f)
                lineTo(18.196f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.425f, 5.299f)
                arcToRelative(10f, 10f, 0f, false, false, -16.941f, 9.78f)
                curveToRelative(.183f, .563f, .843f, .774f, 1.355f, .478f)
                lineTo(20.16f, 6.711f)
                curveToRelative(.512f, -.296f, .66f, -.973f, .264f, -1.413f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 21f)
                horizontalLineTo(3f)
            }
}

public val LucideIcons.All.ParasolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Parasol: ImageVector
    @Composable get() = ParasolDefinition.asImageVector()
