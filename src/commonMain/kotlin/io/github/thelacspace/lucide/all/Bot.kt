package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,4.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(18.0,8.0)
                lineTo(20.0,8.0)
                lineTo(20.0,20.0)
                lineTo(18.0,20.0)
                lineTo(6.0,20.0)
                lineTo(4.0,20.0)
                lineTo(4.0,8.0)
                lineTo(6.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(4.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.0)
                lineTo(22.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,13.0)
                lineTo(15.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                lineTo(9.0,15.0)
            }
}

public val LucideIcons.All.BotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bot: ImageVector
    @Composable get() = BotDefinition.asImageVector()
