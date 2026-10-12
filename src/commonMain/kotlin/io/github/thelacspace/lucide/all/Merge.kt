package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Merge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,12.3f)
                curveTo(12.011545f,13.376006f,11.589071f,14.411282f,10.828f,15.172f)
                lineTo(4.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,22.0f)
                lineTo(15.0f,17.0f)
            }
}

public val LucideIcons.All.MergeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Merge: ImageVector
    @Composable get() = MergeDefinition.asImageVector()
