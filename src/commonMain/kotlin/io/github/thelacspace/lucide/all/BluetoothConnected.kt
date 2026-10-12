package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothConnected") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                lineTo(17.0,17.0)
                lineTo(12.0,22.0)
                lineTo(12.0,2.0)
                lineTo(17.0,7.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(6.0,12.0)
            }
}

public val LucideIcons.All.BluetoothConnectedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothConnected: ImageVector
    @Composable get() = BluetoothConnectedDefinition.asImageVector()
