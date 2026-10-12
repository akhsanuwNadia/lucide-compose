package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampFloor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.929000854492188,7.629000186920166)
                curveTo(18.05210304260254,7.9371337890625,18.014347076416016,8.286264419555664,17.828214645385742,8.560955047607422)
                curveTo(17.642080307006836,8.835646629333496,17.33181381225586,9.0001220703125,17.0,9.0)
                lineTo(7.0,9.0)
                curveTo(6.668362617492676,8.99979019165039,6.358402252197266,8.835179328918457,6.172505855560303,8.560541152954102)
                curveTo(5.98660945892334,8.285902976989746,5.948962211608887,7.93696928024292,6.072000026702881,7.628999710083008)
                lineTo(8.072000503540039,2.628999710083008)
                curveTo(8.223675727844238,2.249349594116211,8.59117317199707,2.0002589225769043,9.0,2.0)
                lineTo(15.0,2.0)
                curveTo(15.40882682800293,2.0002589225769043,15.776324272155762,2.249349594116211,15.927999496459961,2.628999948501587)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,22.0)
                lineTo(15.0,22.0)
            }
}

public val LucideIcons.All.LampFloorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampFloor: ImageVector
    @Composable get() = LampFloorDefinition.asImageVector()
