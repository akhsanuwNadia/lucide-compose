package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lambda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.38f, 10f)
                lineTo(5f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 18f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, cf)
                arcToRelative(-4.87f, -.003f, -5.052f, false, false, -16f, af)
            }
}

public val LucideIcons.All.LambdaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lambda: ImageVector
    @Composable get() = LambdaDefinition.asImageVector()
