package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brackets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(19.552284f,3.0f,20.0f,3.4477153f,20.0f,4.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,20.552284f,19.552284f,21.0f,19.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(4.4477153f,21.0f,4.0f,20.552284f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,3.4477153f,4.4477153f,3.0f,5.0f,3.0f)
                lineTo(8.0f,3.0f)
            }
}

public val LucideIcons.All.BracketsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brackets: ImageVector
    @Composable get() = BracketsDefinition.asImageVector()
