package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalSpaceAround") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,7.0)
                lineTo(13.0,7.0)
                lineTo(15.0,7.0)
                lineTo(15.0,17.0)
                lineTo(13.0,17.0)
                lineTo(11.0,17.0)
                lineTo(9.0,17.0)
                lineTo(9.0,7.0)
                lineTo(11.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,22.0)
                lineTo(4.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,22.0)
                lineTo(20.0,2.0)
            }
}

public val LucideIcons.All.AlignHorizontalSpaceAroundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalSpaceAround: ImageVector
    @Composable get() = AlignHorizontalSpaceAroundDefinition.asImageVector()
