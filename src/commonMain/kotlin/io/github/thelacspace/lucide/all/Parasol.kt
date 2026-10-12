package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Parasol") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.5f,11.134f)
                lineTo(18.196f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.425f,5.299f)
                curveTo(17.265396f,1.7923653f,12.084067f,0.9725449f,7.996227f,3.3324459f)
                curveTo(3.9083858f,5.692347f,2.0273206f,10.589271f,3.4839993f,15.0789995f)
                curveTo(3.6669993f,15.641999f,4.326999f,15.853f,4.8389993f,15.556999f)
                lineTo(20.16f,6.711f)
                curveTo(20.671999f,6.415f,20.82f,5.738f,20.424f,5.298f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(3.0f,21.0f)
            }
}

public val LucideIcons.All.ParasolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Parasol: ImageVector
    @Composable get() = ParasolDefinition.asImageVector()
