package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microscope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(14.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,22.0f)
                lineTo(21.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,22.0f)
                curveTo(16.508316f,22.011217f,18.830912f,20.679483f,20.08832f,18.509068f)
                curveTo(21.345726f,16.338652f,21.345726f,13.661347f,20.08832f,11.4909315f)
                curveTo(18.830912f,9.320517f,16.508316f,7.9887824f,14.0f,8.0f)
                lineTo(13.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,14.0f)
                lineTo(11.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(7.8954306f,12.0f,7.0f,11.104569f,7.0f,10.0f)
                lineTo(7.0f,6.0f)
                lineTo(13.0f,6.0f)
                lineTo(13.0f,10.0f)
                curveTo(13.0f,11.104569f,12.104569f,12.0f,11.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,3.0f)
                curveTo(12.0f,2.4477153f,11.552285f,2.0f,11.0f,2.0f)
                lineTo(9.0f,2.0f)
                curveTo(8.447715f,2.0f,8.0f,2.4477153f,8.0f,3.0f)
                lineTo(8.0f,6.0f)
            }
}

public val LucideIcons.All.MicroscopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microscope: ImageVector
    @Composable get() = MicroscopeDefinition.asImageVector()
