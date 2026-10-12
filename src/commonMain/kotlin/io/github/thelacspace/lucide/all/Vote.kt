package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(11.0,14.0)
                lineTo(15.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                curveTo(5.0,5.900000095367432,5.900000095367432,5.0,7.0,5.0)
                lineTo(17.0,5.0)
                curveTo(18.104570388793945,5.0,19.0,5.895430564880371,19.0,7.0)
                lineTo(19.0,19.0)
                lineTo(5.0,19.0)
                lineTo(5.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(2.0,19.0)
            }
}

public val LucideIcons.All.VoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vote: ImageVector
    @Composable get() = VoteDefinition.asImageVector()
