package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothSearching") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(17.0f,17.0f)
                lineTo(12.0f,22.0f)
                lineTo(12.0f,2.0f)
                lineTo(17.0f,7.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.83f,14.83f)
                curveTo(21.581108f,14.079727f,22.003147f,13.061637f,22.003147f,12.0f)
                curveTo(22.003147f,10.938363f,21.581108f,9.920273f,20.83f,9.17f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.01f,12.0f)
            }
}

public val LucideIcons.All.BluetoothSearchingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothSearching: ImageVector
    @Composable get() = BluetoothSearchingDefinition.asImageVector()
