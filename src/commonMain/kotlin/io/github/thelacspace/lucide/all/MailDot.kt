package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.674f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                lineTo(20.0f,20.0f)
                curveTo(21.10457f,20.0f,22.0f,19.10457f,22.0f,18.0f)
                lineTo(22.0f,13.325f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,7.0f)
                lineTo(11.0f,12.701f)
                curveTo(11.618802f,13.058266f,12.381198f,13.058266f,13.0f,12.701f)
                lineTo(14.084f,12.015f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                curveTo(15.995193f,8.074993f,16.565935f,9.070391f,17.496113f,9.60928f)
                curveTo(18.426292f,10.148169f,19.573708f,10.148169f,20.503887f,9.60928f)
                curveTo(21.434065f,9.070391f,22.004808f,8.074993f,22.0f,7.0f)
                curveTo(22.004808f,5.9250073f,21.434065f,4.9296093f,20.503887f,4.3907204f)
                curveTo(19.573708f,3.8518312f,18.426292f,3.8518312f,17.496113f,4.3907204f)
                curveTo(16.565935f,4.9296093f,15.995193f,5.9250073f,16.0f,7.0f)
            }
}

public val LucideIcons.All.MailDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailDot: ImageVector
    @Composable get() = MailDotDefinition.asImageVector()
