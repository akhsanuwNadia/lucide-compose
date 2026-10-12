package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlugZap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.3f,20.3f)
                curveTo(6.7503247f,20.75189f,7.3620367f,21.005892f,8.0f,21.005892f)
                curveTo(8.637964f,21.005892f,9.249677f,20.75189f,9.700001f,20.3f)
                lineTo(12.0f,18.0f)
                lineTo(6.0f,12.0f)
                lineTo(3.7f,14.3f)
                curveTo(3.248109f,14.750324f,2.9941072f,15.362037f,2.9941072f,16.0f)
                curveTo(2.9941072f,16.637964f,3.248109f,17.249676f,3.7f,17.7f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,13.5f)
                lineTo(10.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.5f,16.5f)
                lineTo(13.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,3.0f)
                lineTo(14.0f,7.0f)
                lineTo(20.0f,7.0f)
                lineTo(16.0f,11.0f)
            }
}

public val LucideIcons.All.PlugZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlugZap: ImageVector
    @Composable get() = PlugZapDefinition.asImageVector()
