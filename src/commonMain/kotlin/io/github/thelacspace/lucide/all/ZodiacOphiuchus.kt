package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacOphiuchus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                curveTo(4.1490855f,8.725997f,5.7843423f,7.9987683f,7.5f,7.9987683f)
                curveTo(9.215657f,7.9987683f,10.850915f,8.725997f,12.0f,10.0f)
                curveTo(13.149085f,11.274003f,14.784343f,12.001232f,16.5f,12.001232f)
                curveTo(18.215658f,12.001232f,19.850914f,11.274003f,21.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(6.0f,15.0f)
                curveTo(6.0147724f,18.303234f,8.6967325f,20.973227f,12.0f,20.973227f)
                curveTo(15.3032675f,20.973227f,17.985228f,18.303234f,18.0f,15.0f)
                lineTo(18.0f,3.0f)
            }
}

public val LucideIcons.All.ZodiacOphiuchusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacOphiuchus: ImageVector
    @Composable get() = ZodiacOphiuchusDefinition.asImageVector()
