package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BluetoothSearching") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                lineTo(17.0,17.0)
                lineTo(12.0,22.0)
                lineTo(12.0,2.0)
                lineTo(17.0,7.0)
                lineTo(7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.829999923706055,14.829999923706055)
                curveTo(21.58110809326172,14.079727172851562,22.00314712524414,13.061636924743652,22.00314712524414,12.0)
                curveTo(22.00314712524414,10.938363075256348,21.58110809326172,9.920272827148438,20.829999923706055,9.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.010000228881836,12.0)
            }
}

public val LucideIcons.All.BluetoothSearchingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BluetoothSearching: ImageVector
    @Composable get() = BluetoothSearchingDefinition.asImageVector()
