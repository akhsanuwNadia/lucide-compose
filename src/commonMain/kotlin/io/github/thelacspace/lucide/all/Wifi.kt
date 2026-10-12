package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wifi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.01f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.82f)
                curveTo(7.694013f,3.7271194f,16.305986f,3.7271194f,22.0f,8.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.859f)
                curveTo(8.888435f,9.047571f,15.111565f,9.047571f,19.0f,12.859f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                curveTo(10.444218f,14.523287f,13.555782f,14.523287f,15.5f,16.429f)
            }
}

public val LucideIcons.All.WifiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wifi: ImageVector
    @Composable get() = WifiDefinition.asImageVector()
