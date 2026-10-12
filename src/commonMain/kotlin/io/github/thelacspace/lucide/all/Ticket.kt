package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ticket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                curveTo(3.6516173f,9.007386f,4.9866138f,10.348366f,4.9866138f,12.0f)
                curveTo(4.9866138f,13.651634f,3.6516173f,14.992614f,2.0f,15.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.0f,18.10457f,2.8954306f,19.0f,4.0f,19.0f)
                lineTo(20.0f,19.0f)
                curveTo(21.10457f,19.0f,22.0f,18.10457f,22.0f,17.0f)
                lineTo(22.0f,15.0f)
                curveTo(20.348383f,14.992614f,19.013386f,13.651634f,19.013386f,12.0f)
                curveTo(19.013386f,10.348366f,20.348383f,9.007386f,22.0f,9.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.0f,5.8954306f,21.10457f,5.0f,20.0f,5.0f)
                lineTo(4.0f,5.0f)
                curveTo(2.8954306f,5.0f,2.0f,5.8954306f,2.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,5.0f)
                lineTo(13.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,17.0f)
                lineTo(13.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,11.0f)
                lineTo(13.0f,13.0f)
            }
}

public val LucideIcons.All.TicketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ticket: ImageVector
    @Composable get() = TicketDefinition.asImageVector()
