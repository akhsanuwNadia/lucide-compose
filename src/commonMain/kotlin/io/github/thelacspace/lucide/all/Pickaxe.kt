package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pickaxe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(5.6190004f,21.380001f)
                curveTo(4.7894974f,22.202393f,3.4512858f,22.199623f,2.6251936f,21.373806f)
                curveTo(1.7991016f,20.547989f,1.7958863f,19.209778f,2.6180005f,18.380001f)
                lineTo(11.0f,9.999f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.973f,4.027f)
                curveTo(12.98182f,2.1258826f,9.344111f,1.5284475f,5.902f,2.373f)
                curveTo(4.5039997f,2.715f,4.81f,4.531f,6.179f,4.974f)
                curveTo(8.273602f,5.6529617f,10.240997f,6.6748457f,12.000999f,7.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.001f,11.999f)
                curveTo(17.32435f,13.75961f,18.346241f,15.727697f,19.025f,17.823f)
                curveTo(19.469f,19.192f,21.285f,19.499f,21.628f,18.101f)
                curveTo(22.46912f,14.674629f,21.881489f,11.053544f,20.0f,8.069f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.352f,3.352f)
                curveTo(17.881432f,2.8815029f,17.118567f,2.8815029f,16.647999f,3.352f)
                lineTo(11.351999f,8.648f)
                curveTo(10.881503f,9.1185665f,10.881503f,9.881433f,11.351999f,10.351999f)
                lineTo(13.647999f,12.647999f)
                curveTo(14.1185665f,13.118496f,14.881432f,13.118496f,15.351999f,12.647999f)
                lineTo(20.647999f,7.351999f)
                curveTo(21.118496f,6.8814316f,21.118496f,6.118566f,20.647999f,5.647999f)
                close()
            }
}

public val LucideIcons.All.PickaxeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pickaxe: ImageVector
    @Composable get() = PickaxeDefinition.asImageVector()
