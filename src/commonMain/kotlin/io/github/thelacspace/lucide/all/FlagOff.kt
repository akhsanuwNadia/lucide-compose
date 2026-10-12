package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                curveTo(13.0f,16.0f,11.0f,14.0f,8.0f,14.0f)
                curveTo(6.5241175f,14.000037f,5.1000247f,14.544041f,4.0f,15.528f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,22.0f)
                lineTo(4.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.656f,2.0f)
                lineTo(8.0f,2.0f)
                curveTo(11.0f,2.0f,13.0f,4.0f,15.333f,4.0f)
                quadTo(17.333f,4.0f,18.4f,3.2f)
                curveTo(18.703018f,2.9727366f,19.108429f,2.9361806f,19.447214f,3.1055725f)
                curveTo(19.785997f,3.2749646f,20.0f,3.6212277f,20.0f,4.0f)
                lineTo(20.0f,14.347f)
            }
}

public val LucideIcons.All.FlagOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagOff: ImageVector
    @Composable get() = FlagOffDefinition.asImageVector()
