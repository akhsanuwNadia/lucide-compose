package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brackets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(19.0,3.0)
                curveTo(19.552284240722656,3.0,20.0,3.4477152824401855,20.0,4.0)
                lineTo(20.0,20.0)
                curveTo(20.0,20.552284240722656,19.552284240722656,21.0,19.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(5.0,21.0)
                curveTo(4.4477152824401855,21.0,4.0,20.552284240722656,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,3.4477152824401855,4.4477152824401855,3.0,5.0,3.0)
                lineTo(8.0,3.0)
            }
}

public val LucideIcons.All.BracketsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brackets: ImageVector
    @Composable get() = BracketsDefinition.asImageVector()
