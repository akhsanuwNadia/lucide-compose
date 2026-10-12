package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.584f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,10.0f)
                curveTo(3.000153f,9.411476f,3.2595086f,8.852892f,3.709f,8.473f)
                lineTo(10.709f,2.4729996f)
                curveTo(11.454388f,1.8430271f,12.545611f,1.8430271f,13.290999f,2.4729996f)
                lineTo(20.291f,8.473f)
                curveTo(20.740759f,8.853118f,21.000141f,9.412127f,21.0f,10.001f)
                lineTo(21.0f,10.584001f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(10.0f,12.0f)
                curveTo(9.447715f,12.0f,9.0f,12.447715f,9.0f,13.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305f,19.53f)
                lineTo(15.228001f,19.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.229f,16.852f)
                lineTo(14.305f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,15.228f)
                lineTo(16.469f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,20.773f)
                lineTo(16.469f,21.697f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,15.228f)
                lineTo(19.531f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,21.697f)
                lineTo(19.148f,20.773f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773f,16.852f)
                lineTo(21.695002f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773f,19.148f)
                lineTo(21.695002f,19.531f)
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

public val LucideIcons.All.HouseCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseCog: ImageVector
    @Composable get() = HouseCogDefinition.asImageVector()
