package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(12.0,22.0)
                lineTo(12.0,12.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,9.5)
                lineTo(17.0,7.0)
                lineTo(12.0,2.0)
                lineTo(12.0,6.5)
            }
}

public val LucideIcons.All.BluetoothOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothOff: ImageVector
    @Composable get() = BluetoothOffDefinition.asImageVector()
