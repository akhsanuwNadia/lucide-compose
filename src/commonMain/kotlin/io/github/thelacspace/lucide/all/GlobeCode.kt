package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.5f,10.0f)
                lineTo(13.0f,7.5f)
                lineTo(15.5f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.861f,14.0f)
                curveTo(15.442635f,17.004927f,14.092247f,19.80293f,12.0f,22.0f)
                curveTo(6.6564846f,16.404078f,6.6564846f,7.5959234f,12.0f,2.0f)
                curveTo(6.672298f,2.0006077f,2.2805722f,6.1780624f,2.0136948f,11.499076f)
                curveTo(1.7468172f,16.82009f,5.698511f,21.416012f,10.999415f,21.949701f)
                curveTo(16.30032f,22.48339f,21.088844f,18.767424f,21.888f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f,5.0f)
                lineTo(22.0f,7.5f)
                lineTo(19.5f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(10.5f,12.0f)
            }
}

public val LucideIcons.All.GlobeCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeCode: ImageVector
    @Composable get() = GlobeCodeDefinition.asImageVector()
