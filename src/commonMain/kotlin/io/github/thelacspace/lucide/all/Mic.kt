package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,10.0f)
                lineTo(19.0f,12.0f)
                curveTo(18.982765f,15.853774f,15.853812f,18.968765f,12.0f,18.968765f)
                curveTo(8.146188f,18.968765f,5.017235f,15.853774f,5.0f,12.0f)
                lineTo(5.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,2.0f)
                lineTo(15.0f,2.0f)
                lineTo(15.0f,15.0f)
                lineTo(12.0f,15.0f)
                lineTo(12.0f,15.0f)
                lineTo(9.0f,15.0f)
                lineTo(9.0f,2.0f)
                lineTo(12.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.MicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mic: ImageVector
    @Composable get() = MicDefinition.asImageVector()
