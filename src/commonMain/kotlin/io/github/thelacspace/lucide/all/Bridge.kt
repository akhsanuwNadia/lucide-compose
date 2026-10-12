package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bridge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.727999687194824)
                lineTo(10.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,9.727999687194824)
                lineTo(14.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,20.0)
                lineTo(18.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,11.0)
                lineTo(18.0,7.0)
                curveTo(16.58359146118164,8.888544082641602,14.360679626464844,10.0,12.0,10.0)
                curveTo(9.639320373535156,10.0,7.416408061981201,8.888544082641602,6.0,7.0)
                lineTo(2.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,16.0)
                lineTo(2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                lineTo(6.0,4.0)
            }
}

public val LucideIcons.All.BridgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bridge: ImageVector
    @Composable get() = BridgeDefinition.asImageVector()
