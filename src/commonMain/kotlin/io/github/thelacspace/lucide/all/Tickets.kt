package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tickets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.173f,8.18f)
                lineTo(14.173f,3.1800003f)
                curveTo(15.178177f,2.7238092f,16.362886f,3.1682432f,16.82f,4.1730003f)
                lineTo(18.56f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                lineTo(6.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(6.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,19.0f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(22.0f,8.0f)
                lineTo(22.0f,21.0f)
                lineTo(20.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(2.0f,21.0f)
                lineTo(2.0f,8.0f)
                lineTo(4.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.TicketsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tickets: ImageVector
    @Composable get() = TicketsDefinition.asImageVector()
