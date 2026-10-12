package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicketPercent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                curveTo(3.074993f,8.995193f,4.0703907f,9.565935f,4.6092796f,10.496114f)
                curveTo(5.1481686f,11.426291f,5.1481686f,12.573709f,4.6092796f,13.503886f)
                curveTo(4.0703907f,14.434065f,3.074993f,15.004807f,2.0f,15.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.0f,18.10457f,2.8954306f,19.0f,4.0f,19.0f)
                lineTo(20.0f,19.0f)
                curveTo(21.10457f,19.0f,22.0f,18.10457f,22.0f,17.0f)
                lineTo(22.0f,15.0f)
                curveTo(20.925007f,15.004807f,19.92961f,14.434065f,19.39072f,13.503886f)
                curveTo(18.851831f,12.573709f,18.851831f,11.426291f,19.39072f,10.496114f)
                curveTo(19.92961f,9.565935f,20.925007f,8.995193f,22.0f,9.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.0f,5.8954306f,21.10457f,5.0f,20.0f,5.0f)
                lineTo(4.0f,5.0f)
                curveTo(2.8954306f,5.0f,2.0f,5.8954306f,2.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                lineTo(9.01f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(15.01f,15.0f)
            }
}

public val LucideIcons.All.TicketPercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicketPercent: ImageVector
    @Composable get() = TicketPercentDefinition.asImageVector()
