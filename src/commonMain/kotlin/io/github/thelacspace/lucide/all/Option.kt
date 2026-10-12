package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Option") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(8.280001f,3.0f)
                curveTo(8.71024f,3.0003266f,9.092045f,3.2758064f,9.228001f,3.684f)
                lineTo(14.772001f,20.316f)
                curveTo(14.908073f,20.724543f,15.290394f,21.000103f,15.721002f,21.0f)
                lineTo(21.0f,21.0f)
            }
}

public val LucideIcons.All.OptionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Option: ImageVector
    @Composable get() = OptionDefinition.asImageVector()
