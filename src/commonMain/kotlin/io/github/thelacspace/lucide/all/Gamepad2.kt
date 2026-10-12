package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gamepad2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                lineTo(10.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,9.0f)
                lineTo(8.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(15.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,10.0f)
                lineTo(18.01f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.32f,5.0f)
                lineTo(6.68f,5.0f)
                curveTo(4.629961f,5.000478f,2.9121287f,6.550759f,2.702f,8.59f)
                curveTo(2.6959999f,8.642f,2.692f,8.691f,2.685f,8.742001f)
                curveTo(2.604f,9.416f,2.0f,14.456f,2.0f,16.0f)
                curveTo(2.0f,17.656855f,3.3431458f,19.0f,5.0f,19.0f)
                curveTo(6.0f,19.0f,6.5f,18.5f,7.0f,18.0f)
                lineTo(8.414f,16.586f)
                curveTo(8.788985f,16.210901f,9.29761f,16.000113f,9.828f,16.0f)
                lineTo(14.172f,16.0f)
                curveTo(14.70239f,16.000113f,15.211015f,16.210901f,15.586f,16.586f)
                lineTo(17.0f,18.0f)
                curveTo(17.5f,18.5f,18.0f,19.0f,19.0f,19.0f)
                curveTo(20.656855f,19.0f,22.0f,17.656855f,22.0f,16.0f)
                curveTo(22.0f,14.455f,21.396f,9.416f,21.315f,8.742001f)
                curveTo(21.308f,8.692f,21.304f,8.642f,21.298f,8.591001f)
                curveTo(21.088348f,6.5513625f,19.370384f,5.0005302f,17.32f,5.0f)
                close()
            }
}

public val LucideIcons.All.Gamepad2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gamepad2: ImageVector
    @Composable get() = Gamepad2Definition.asImageVector()
