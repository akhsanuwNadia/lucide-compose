package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalSpaceAround") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,7.0f)
                lineTo(13.0f,7.0f)
                lineTo(15.0f,7.0f)
                lineTo(15.0f,17.0f)
                lineTo(13.0f,17.0f)
                lineTo(11.0f,17.0f)
                lineTo(9.0f,17.0f)
                lineTo(9.0f,7.0f)
                lineTo(11.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,22.0f)
                lineTo(4.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,22.0f)
                lineTo(20.0f,2.0f)
            }
}

public val LucideIcons.All.AlignHorizontalSpaceAroundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalSpaceAround: ImageVector
    @Composable get() = AlignHorizontalSpaceAroundDefinition.asImageVector()
