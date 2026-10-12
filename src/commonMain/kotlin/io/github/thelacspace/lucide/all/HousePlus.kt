package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HousePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.35f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,10.0f)
                curveTo(2.9995182f,9.410265f,3.2593346f,8.850379f,3.71f,8.47f)
                lineTo(10.71f,2.4700003f)
                curveTo(11.455044f,1.8411539f,12.544956f,1.8411539f,13.29f,2.4700003f)
                lineTo(20.29f,8.47f)
                curveTo(20.740665f,8.850379f,21.000483f,9.410265f,21.0f,10.0f)
                lineTo(21.0f,12.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.8f,12.4f)
                curveTo(14.611146f,12.148194f,14.314757f,12.0f,14.0f,12.0f)
                lineTo(10.0f,12.0f)
                curveTo(9.447715f,12.0f,9.0f,12.447715f,9.0f,13.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(21.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                lineTo(18.0f,21.0f)
            }
}

public val LucideIcons.All.HousePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HousePlus: ImageVector
    @Composable get() = HousePlusDefinition.asImageVector()
