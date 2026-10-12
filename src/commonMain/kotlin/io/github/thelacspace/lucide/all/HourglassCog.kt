package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HourglassCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.305f,19.53f)
                lineTo(15.228001f,19.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,16.852f)
                lineTo(14.304999f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,15.228f)
                lineTo(16.469f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,20.772f)
                lineTo(16.469f,21.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(17.0f,6.172f)
                curveTo(16.999887f,6.7023897f,16.789099f,7.2110147f,16.414f,7.586f)
                lineTo(7.5859995f,16.414f)
                curveTo(7.2109013f,16.788984f,7.0001135f,17.29761f,7.0f,17.828f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,15.228f)
                lineTo(19.531f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,21.696f)
                lineTo(19.148f,20.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,16.852f)
                lineTo(21.696f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,19.148f)
                lineTo(21.696f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,22.0f)
                lineTo(11.159f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,2.0f)
                lineTo(19.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(7.0f,6.172f)
                curveTo(7.0001135f,6.7023897f,7.2109013f,7.2110143f,7.586f,7.586f)
                lineTo(12.774f,12.774f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(14.995193f,19.074993f,15.565935f,20.07039f,16.496113f,20.60928f)
                curveTo(17.426292f,21.148169f,18.573708f,21.148169f,19.503887f,20.60928f)
                curveTo(20.434065f,20.07039f,21.004808f,19.074993f,21.0f,18.0f)
                curveTo(21.004808f,16.925007f,20.434065f,15.929609f,19.503887f,15.39072f)
                curveTo(18.573708f,14.851831f,17.426292f,14.851831f,16.496113f,15.39072f)
                curveTo(15.565935f,15.929609f,14.995193f,16.925007f,15.0f,18.0f)
            }
}

public val LucideIcons.All.HourglassCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HourglassCog: ImageVector
    @Composable get() = HourglassCogDefinition.asImageVector()
