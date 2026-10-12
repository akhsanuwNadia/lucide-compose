package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwissFranc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,21.0)
                lineTo(10.0,3.0)
                lineTo(18.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(15.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.5)
                lineTo(17.0,9.5)
            }
}

public val LucideIcons.All.SwissFrancDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwissFranc: ImageVector
    @Composable get() = SwissFrancDefinition.asImageVector()
