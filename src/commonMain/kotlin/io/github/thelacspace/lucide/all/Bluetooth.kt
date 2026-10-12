package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bluetooth") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(17.0f,17.0f)
                lineTo(12.0f,22.0f)
                lineTo(12.0f,2.0f)
                lineTo(17.0f,7.0f)
                lineTo(7.0f,17.0f)
            }
}

public val LucideIcons.All.BluetoothDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bluetooth: ImageVector
    @Composable get() = BluetoothDefinition.asImageVector()
