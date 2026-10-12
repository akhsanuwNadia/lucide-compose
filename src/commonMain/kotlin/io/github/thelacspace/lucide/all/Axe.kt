package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Axe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(5.6190004f,20.380001f)
                curveTo(4.7894974f,21.202393f,3.4512858f,21.199623f,2.6251936f,20.373806f)
                curveTo(1.7991016f,19.547989f,1.7958863f,18.209778f,2.6180005f,17.380001f)
                lineTo(11.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.5f)
                curveTo(15.0f,15.776142f,15.223858f,16.0f,15.5f,16.0f)
                curveTo(19.089851f,16.0f,22.0f,13.08985f,22.0f,9.5f)
                curveTo(22.0f,9.223858f,21.776142f,9.0f,21.5f,9.0f)
                lineTo(19.828f,9.0f)
                curveTo(19.29761f,8.9998865f,18.788984f,8.789099f,18.414f,8.414f)
                lineTo(13.351999f,3.3519998f)
                curveTo(12.881432f,2.8815026f,12.1185665f,2.8815026f,11.647999f,3.3519998f)
                lineTo(9.352f,5.648f)
                curveTo(8.881503f,6.118567f,8.881503f,6.8814325f,9.352f,7.3519998f)
                lineTo(14.414f,12.414f)
                curveTo(14.789099f,12.788985f,14.9998865f,13.29761f,15.0f,13.828f)
                close()
            }
}

public val LucideIcons.All.AxeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Axe: ImageVector
    @Composable get() = AxeDefinition.asImageVector()
