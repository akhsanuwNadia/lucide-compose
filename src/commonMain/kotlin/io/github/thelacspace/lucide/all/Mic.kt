package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,10.0)
                lineTo(19.0,12.0)
                curveTo(18.982765197753906,15.853774070739746,15.853812217712402,18.968765258789062,12.0,18.968765258789062)
                curveTo(8.146187782287598,18.968765258789062,5.017234802246094,15.853774070739746,5.0,12.0)
                lineTo(5.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,2.0)
                lineTo(15.0,2.0)
                lineTo(15.0,15.0)
                lineTo(12.0,15.0)
                lineTo(12.0,15.0)
                lineTo(9.0,15.0)
                lineTo(9.0,2.0)
                lineTo(12.0,2.0)
                close()
            }
}

public val LucideIcons.All.MicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mic: ImageVector
    @Composable get() = MicDefinition.asImageVector()
