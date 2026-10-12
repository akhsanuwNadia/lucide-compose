package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Asterisk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(12.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.065000534057617,8.496000289916992)
                lineTo(5.940000534057617,15.496000289916992)
            }
            lucidePath(strokeWidth) {
                moveTo(5.940000057220459,8.503999710083008)
                lineTo(18.065000534057617,15.503999710083008)
            }
}

public val LucideIcons.All.AsteriskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Asterisk: ImageVector
    @Composable get() = AsteriskDefinition.asImageVector()
