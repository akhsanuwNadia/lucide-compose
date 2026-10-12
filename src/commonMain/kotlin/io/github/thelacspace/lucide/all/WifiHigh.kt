package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiHigh") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.01f,20.0f)
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

public val LucideIcons.All.WifiHighDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiHigh: ImageVector
    @Composable get() = WifiHighDefinition.asImageVector()
