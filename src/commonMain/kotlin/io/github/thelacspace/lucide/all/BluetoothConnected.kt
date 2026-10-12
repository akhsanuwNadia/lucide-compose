package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothConnected") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(17.0f,17.0f)
                lineTo(12.0f,22.0f)
                lineTo(12.0f,2.0f)
                lineTo(17.0f,7.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(6.0f,12.0f)
            }
}

public val LucideIcons.All.BluetoothConnectedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothConnected: ImageVector
    @Composable get() = BluetoothConnectedDefinition.asImageVector()
