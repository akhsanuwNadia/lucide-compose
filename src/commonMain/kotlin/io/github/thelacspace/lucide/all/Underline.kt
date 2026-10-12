package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Underline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,4.0)
                lineTo(6.0,10.0)
                curveTo(6.014772415161133,13.303234100341797,8.696732521057129,15.973227500915527,12.0,15.973227500915527)
                curveTo(15.303267478942871,15.973227500915527,17.985227584838867,13.303234100341797,18.0,10.0)
                lineTo(18.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
            }
}

public val LucideIcons.All.UnderlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Underline: ImageVector
    @Composable get() = UnderlineDefinition.asImageVector()
