package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacLibra") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(9.857f,16.0f)
                curveTo(10.019f,15.988f,10.047f,15.677f,9.895f,15.62f)
                curveTo(7.178645f,14.601775f,5.5797997f,11.785997f,6.0972085f,8.931587f)
                curveTo(6.6146173f,6.0771775f,9.100075f,4.001747f,12.001f,4.001747f)
                curveTo(14.901926f,4.001747f,17.387383f,6.0771775f,17.904793f,8.931587f)
                curveTo(18.422201f,11.785997f,16.823357f,14.601775f,14.107f,15.62f)
                curveTo(13.954f,15.677f,13.982f,15.988f,14.145f,16.0f)
                lineTo(21.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                lineTo(21.0f,20.0f)
            }
}

public val LucideIcons.All.ZodiacLibraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacLibra: ImageVector
    @Composable get() = ZodiacLibraDefinition.asImageVector()
