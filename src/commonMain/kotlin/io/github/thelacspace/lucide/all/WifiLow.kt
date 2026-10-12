package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiLow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.01f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                curveTo(10.444218f,14.523287f,13.555782f,14.523287f,15.5f,16.429f)
            }
}

public val LucideIcons.All.WifiLowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiLow: ImageVector
    @Composable get() = WifiLowDefinition.asImageVector()
