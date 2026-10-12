package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(11.0f,14.0f)
                lineTo(15.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                curveTo(5.0f,5.9f,5.9f,5.0f,7.0f,5.0f)
                lineTo(17.0f,5.0f)
                curveTo(18.10457f,5.0f,19.0f,5.8954306f,19.0f,7.0f)
                lineTo(19.0f,19.0f)
                lineTo(5.0f,19.0f)
                lineTo(5.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                lineTo(2.0f,19.0f)
            }
}

public val LucideIcons.All.VoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vote: ImageVector
    @Composable get() = VoteDefinition.asImageVector()
