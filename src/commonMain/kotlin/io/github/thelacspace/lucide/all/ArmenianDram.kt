package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArmenianDram") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,10.0)
                lineTo(19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,14.0)
                lineTo(19.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,20.0)
                lineTo(17.0,10.0)
                curveTo(16.985227584838867,6.696765422821045,14.303267478942871,4.026772975921631,11.0,4.026772975921631)
                curveTo(7.696732521057129,4.026772975921631,5.014772415161133,6.696765422821045,5.0,10.0)
            }
}

public val LucideIcons.All.ArmenianDramDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArmenianDram: ImageVector
    @Composable get() = ArmenianDramDefinition.asImageVector()
