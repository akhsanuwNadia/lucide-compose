package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WineOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(10.0f,10.0f)
                moveTo(17.0f,10.0f)
                lineTo(15.657f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.307f,7.307f)
                curveTo(7.1060133f,8.190658f,7.003058f,9.09378f,7.0f,10.0f)
                curveTo(7.00009f,11.763977f,7.929661f,13.397385f,9.446191f,14.298356f)
                curveTo(10.962721f,15.199328f,12.841785f,15.234533f,14.391f,14.391f)
                moveTo(8.638f,2.981f)
                curveTo(8.75f,2.668f,8.872f,2.34f,9.0f,2.0f)
                lineTo(15.0f,2.0f)
                curveTo(16.5f,6.0f,17.0f,8.0f,17.0f,10.0f)
                curveTo(17.0f,10.407f,16.95f,10.809f,16.855f,11.198f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.WineOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WineOff: ImageVector
    @Composable get() = WineOffDefinition.asImageVector()
