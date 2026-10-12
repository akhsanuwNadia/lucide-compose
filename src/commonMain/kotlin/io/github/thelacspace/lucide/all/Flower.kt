package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(8.995193f,13.074993f,9.565935f,14.070391f,10.496114f,14.60928f)
                curveTo(11.426291f,15.148169f,12.573709f,15.148169f,13.503886f,14.60928f)
                curveTo(14.434065f,14.070391f,15.004807f,13.074993f,15.0f,12.0f)
                curveTo(15.004807f,10.925007f,14.434065f,9.929609f,13.503886f,9.39072f)
                curveTo(12.573709f,8.851831f,11.426291f,8.851831f,10.496114f,9.39072f)
                curveTo(9.565935f,9.929609f,8.995193f,10.925007f,9.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.5f)
                curveTo(12.0f,18.985281f,9.985281f,21.0f,7.5f,21.0f)
                curveTo(5.0147185f,21.0f,3.0f,18.985281f,3.0f,16.5f)
                curveTo(3.0f,14.014719f,5.0147185f,12.0f,7.5f,12.0f)
                curveTo(5.0147185f,12.0f,3.0f,9.985281f,3.0f,7.5f)
                curveTo(3.0f,5.0147185f,5.0147185f,3.0f,7.5f,3.0f)
                curveTo(9.985281f,3.0f,12.0f,5.0147185f,12.0f,7.5f)
                curveTo(12.0f,5.0147185f,14.014719f,3.0f,16.5f,3.0f)
                curveTo(18.985281f,3.0f,21.0f,5.0147185f,21.0f,7.5f)
                curveTo(21.0f,9.985281f,18.985281f,12.0f,16.5f,12.0f)
                curveTo(18.985281f,12.0f,21.0f,14.014719f,21.0f,16.5f)
                curveTo(21.0f,18.985281f,18.985281f,21.0f,16.5f,21.0f)
                curveTo(14.014719f,21.0f,12.0f,18.985281f,12.0f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.5f)
                lineTo(12.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f,12.0f)
                lineTo(9.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,12.0f)
                lineTo(15.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.5f)
                lineTo(12.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(9.88f,9.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f,9.88f)
                lineTo(16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                lineTo(9.88f,14.12f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.12f,14.12f)
                lineTo(16.0f,16.0f)
            }
}

public val LucideIcons.All.FlowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flower: ImageVector
    @Composable get() = FlowerDefinition.asImageVector()
