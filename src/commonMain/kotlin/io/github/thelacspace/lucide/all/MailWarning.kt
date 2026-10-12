package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailWarning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,10.5)
                lineTo(22.0,6.0)
                curveTo(22.0,4.895430564880371,21.104570388793945,4.0,20.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.100000381469727,2.9000000953674316,20.0,4.0,20.0)
                lineTo(16.5,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(13.029999732971191,12.699999809265137)
                curveTo(12.400046348571777,13.094680786132812,11.599952697753906,13.094680786132812,10.969999313354492,12.699999809265137)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.0)
                lineTo(20.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,22.0)
                lineTo(20.0,22.010000228881836)
            }
}

public val LucideIcons.All.MailWarningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailWarning: ImageVector
    @Composable get() = MailWarningDefinition.asImageVector()
