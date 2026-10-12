package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(12.0f,22.0f)
                lineTo(12.0f,12.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,9.5f)
                lineTo(17.0f,7.0f)
                lineTo(12.0f,2.0f)
                lineTo(12.0f,6.5f)
            }
}

public val LucideIcons.All.BluetoothOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothOff: ImageVector
    @Composable get() = BluetoothOffDefinition.asImageVector()
