package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,4.0f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(18.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(20.0f,20.0f)
                lineTo(18.0f,20.0f)
                lineTo(6.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(4.0f,8.0f)
                lineTo(6.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(4.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.0f)
                lineTo(22.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                lineTo(15.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                lineTo(9.0f,15.0f)
            }
}

public val LucideIcons.All.BotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bot: ImageVector
    @Composable get() = BotDefinition.asImageVector()
