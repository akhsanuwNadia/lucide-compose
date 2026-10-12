package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PcCase") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(17.0,2.0)
                lineTo(19.0,2.0)
                lineTo(19.0,22.0)
                lineTo(17.0,22.0)
                lineTo(7.0,22.0)
                lineTo(5.0,22.0)
                lineTo(5.0,2.0)
                lineTo(7.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(15.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(15.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                lineTo(15.0,10.0)
            }
}

public val LucideIcons.All.PcCaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PcCase: ImageVector
    @Composable get() = PcCaseDefinition.asImageVector()
