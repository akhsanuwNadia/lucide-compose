package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacPisces") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                curveTo(15.0f,15.666667f,15.0f,8.333333f,19.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                curveTo(9.0f,8.333333f,9.0f,15.666667f,5.0f,21.0f)
            }
}

public val LucideIcons.All.ZodiacPiscesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacPisces: ImageVector
    @Composable get() = ZodiacPiscesDefinition.asImageVector()
