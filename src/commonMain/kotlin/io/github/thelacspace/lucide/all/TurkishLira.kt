package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TurkishLira") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                lineTo(5.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.5f)
                lineTo(5.0f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                curveTo(18.0f,16.970562f,13.970563f,21.0f,9.0f,21.0f)
                lineTo(9.0f,3.0f)
            }
}

public val LucideIcons.All.TurkishLiraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TurkishLira: ImageVector
    @Composable get() = TurkishLiraDefinition.asImageVector()
