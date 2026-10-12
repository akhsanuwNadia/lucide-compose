package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Network") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,16.0)
                lineTo(21.0,16.0)
                lineTo(22.0,16.0)
                lineTo(22.0,22.0)
                lineTo(21.0,22.0)
                lineTo(17.0,22.0)
                lineTo(16.0,22.0)
                lineTo(16.0,16.0)
                lineTo(17.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                lineTo(7.0,16.0)
                lineTo(8.0,16.0)
                lineTo(8.0,22.0)
                lineTo(7.0,22.0)
                lineTo(3.0,22.0)
                lineTo(2.0,22.0)
                lineTo(2.0,16.0)
                lineTo(3.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(14.0,2.0)
                lineTo(15.0,2.0)
                lineTo(15.0,8.0)
                lineTo(14.0,8.0)
                lineTo(10.0,8.0)
                lineTo(9.0,8.0)
                lineTo(9.0,2.0)
                lineTo(10.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,16.0)
                lineTo(5.0,13.0)
                curveTo(5.0,12.447714805603027,5.4477152824401855,12.0,6.0,12.0)
                lineTo(18.0,12.0)
                curveTo(18.552284240722656,12.0,19.0,12.447714805603027,19.0,13.0)
                lineTo(19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,8.0)
            }
}

public val LucideIcons.All.NetworkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Network: ImageVector
    @Composable get() = NetworkDefinition.asImageVector()
