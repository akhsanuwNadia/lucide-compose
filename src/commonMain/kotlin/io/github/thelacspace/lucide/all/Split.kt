package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Split") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(3.0f,3.0f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,13.7f)
                curveTo(12.011545f,12.623994f,11.589071f,11.588718f,10.828f,10.828f)
                lineTo(3.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                lineTo(21.0f,3.0f)
            }
}

public val LucideIcons.All.SplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Split: ImageVector
    @Composable get() = SplitDefinition.asImageVector()
