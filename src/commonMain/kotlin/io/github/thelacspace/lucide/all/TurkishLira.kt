package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TurkishLira") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                lineTo(5.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.5)
                lineTo(5.0,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                curveTo(18.0,16.970561981201172,13.970562934875488,21.0,9.0,21.0)
                lineTo(9.0,3.0)
            }
}

public val LucideIcons.All.TurkishLiraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TurkishLira: ImageVector
    @Composable get() = TurkishLiraDefinition.asImageVector()
