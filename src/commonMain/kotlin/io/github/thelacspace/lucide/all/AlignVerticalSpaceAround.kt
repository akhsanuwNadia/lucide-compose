package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalSpaceAround") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(15.0,9.0)
                lineTo(17.0,9.0)
                lineTo(17.0,15.0)
                lineTo(15.0,15.0)
                lineTo(9.0,15.0)
                lineTo(7.0,15.0)
                lineTo(7.0,9.0)
                lineTo(9.0,9.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,20.0)
                lineTo(2.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,4.0)
                lineTo(2.0,4.0)
            }
}

public val LucideIcons.All.AlignVerticalSpaceAroundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalSpaceAround: ImageVector
    @Composable get() = AlignVerticalSpaceAroundDefinition.asImageVector()
