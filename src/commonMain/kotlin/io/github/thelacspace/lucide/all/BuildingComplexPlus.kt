package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BuildingComplexPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,21.0f)
                lineTo(10.0f,18.0f)
                curveTo(10.000074f,17.275093f,10.392394f,16.606974f,11.02541f,16.253729f)
                curveTo(11.658426f,15.900486f,12.43303f,15.917424f,13.05f,16.298f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(14.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(22.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,7.0f)
                lineTo(20.0f,7.0f)
                curveTo(21.10457f,7.0f,22.0f,7.8954306f,22.0f,9.0f)
                lineTo(22.0f,13.355f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,10.895431f,2.0f,12.0f)
                lineTo(2.0f,19.0f)
                curveTo(2.0f,20.10457f,2.8954306f,21.0f,4.0f,21.0f)
                lineTo(12.535f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                lineTo(6.0f,5.0f)
                curveTo(6.0f,3.8954306f,6.8954306f,3.0f,8.0f,3.0f)
                lineTo(16.0f,3.0f)
                curveTo(17.10457f,3.0f,18.0f,3.8954306f,18.0f,5.0f)
                lineTo(18.0f,12.125999f)
            }
}

public val LucideIcons.All.BuildingComplexPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BuildingComplexPlus: ImageVector
    @Composable get() = BuildingComplexPlusDefinition.asImageVector()
