package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,12.531999588012695)
                lineTo(22.0,6.0)
                curveTo(22.0,4.895430564880371,21.104570388793945,4.0,20.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                lineTo(12.791999816894531,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(13.008999824523926,12.72700023651123)
                curveTo(12.387914657592773,13.087739944458008,11.621085166931152,13.087739944458008,11.0,12.72700023651123)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,16.5)
                lineTo(21.5,21.5)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,16.5)
                lineTo(16.5,21.5)
            }
}

public val LucideIcons.All.MailXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailX: ImageVector
    @Composable get() = MailXDefinition.asImageVector()
