package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LightbulbOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.8f,11.2f)
                curveTo(17.599998f,10.3f,18.0f,9.2f,18.0f,8.0f)
                curveTo(17.995964f,5.795267f,16.783096f,3.7703507f,14.84122f,2.726331f)
                curveTo(12.899343f,1.6823113f,10.541315f,1.7873912f,8.7f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3f,6.3f)
                curveTo(5.5726786f,8.113684f,6.0514674f,10.1884365f,7.5f,11.5f)
                curveTo(8.2f,12.2f,8.8f,13.0f,9.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                lineTo(15.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                lineTo(14.0f,22.0f)
            }
}

public val LucideIcons.All.LightbulbOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LightbulbOff: ImageVector
    @Composable get() = LightbulbOffDefinition.asImageVector()
