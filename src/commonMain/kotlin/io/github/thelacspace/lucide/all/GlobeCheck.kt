package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(17.0,8.0)
                lineTo(21.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(22.0,12.0)
                curveTo(22.0,17.52284812927246,17.52284812927246,22.0,12.0,22.0)
                curveTo(6.477152347564697,22.0,2.0,17.52284812927246,2.0,12.0)
                curveTo(2.0,6.477152347564697,6.477152347564697,2.0,12.0,2.0)
                curveTo(6.666666507720947,7.599999904632568,6.666666507720947,16.399999618530273,12.0,22.0)
                curveTo(14.567765235900879,19.30384635925293,16.0,15.723259925842285,16.0,12.0)
            }
}

public val LucideIcons.All.GlobeCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeCheck: ImageVector
    @Composable get() = GlobeCheckDefinition.asImageVector()
