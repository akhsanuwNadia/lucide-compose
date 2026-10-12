package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sunrise") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.929999828338623,10.930000305175781)
                lineTo(6.339999675750732,12.34000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(4.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.06999969482422,10.930000305175781)
                lineTo(17.65999984741211,12.34000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(2.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(12.0,2.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                curveTo(15.990151405334473,15.797843933105469,14.202178001403809,14.01784896850586,12.0,14.01784896850586)
                curveTo(9.797821998596191,14.01784896850586,8.009848594665527,15.797843933105469,8.0,18.0)
            }
}

public val LucideIcons.All.SunriseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sunrise: ImageVector
    @Composable get() = SunriseDefinition.asImageVector()
