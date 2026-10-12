package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacOphiuchus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                curveTo(4.149085521697998,8.725996971130371,5.784342288970947,7.998768329620361,7.5,7.998768329620361)
                curveTo(9.215657234191895,7.998768329620361,10.85091495513916,8.725996971130371,12.0,10.0)
                curveTo(13.14908504486084,11.274003028869629,14.784342765808105,12.001232147216797,16.5,12.001232147216797)
                curveTo(18.21565818786621,12.001232147216797,19.850914001464844,11.274003028869629,21.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(6.0,15.0)
                curveTo(6.014772415161133,18.303234100341797,8.696732521057129,20.97322654724121,12.0,20.97322654724121)
                curveTo(15.303267478942871,20.97322654724121,17.985227584838867,18.303234100341797,18.0,15.0)
                lineTo(18.0,3.0)
            }
}

public val LucideIcons.All.ZodiacOphiuchusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacOphiuchus: ImageVector
    @Composable get() = ZodiacOphiuchusDefinition.asImageVector()
