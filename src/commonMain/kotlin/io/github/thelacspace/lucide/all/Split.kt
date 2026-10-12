package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Split") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(3.0,3.0)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,13.699999809265137)
                curveTo(12.011545181274414,12.623993873596191,11.589071273803711,11.58871841430664,10.82800006866455,10.82800006866455)
                lineTo(3.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(21.0,3.0)
            }
}

public val LucideIcons.All.SplitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Split: ImageVector
    @Composable get() = SplitDefinition.asImageVector()
