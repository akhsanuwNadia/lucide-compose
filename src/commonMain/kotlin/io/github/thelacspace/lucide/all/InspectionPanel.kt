package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("InspectionPanel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                lineTo(7.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,7.0)
                lineTo(17.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                lineTo(7.010000228881836,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(17.010000228881836,17.0)
            }
}

public val LucideIcons.All.InspectionPanelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.InspectionPanel: ImageVector
    @Composable get() = InspectionPanelDefinition.asImageVector()
