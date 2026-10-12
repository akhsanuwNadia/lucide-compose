package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,10.27f)
                lineTo(7.0f,3.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,13.73f)
                lineTo(7.0f,20.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,20.66f)
                lineTo(16.0f,18.93f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.34f)
                lineTo(16.0f,5.0699997f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.66f,17.0f)
                lineTo(18.93f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.66f,7.0f)
                lineTo(18.93f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.34f,17.0f)
                lineTo(5.0699997f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.34f,7.0f)
                lineTo(5.0699997f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.98718f,14.866648f,5.5091615f,17.521042f,7.9896364f,18.958078f)
                curveTo(10.470112f,20.395117f,13.529888f,20.395117f,16.010363f,18.958078f)
                curveTo(18.490839f,17.521042f,20.01282f,14.866648f,20.0f,12.0f)
                curveTo(20.01282f,9.133352f,18.490839f,6.478958f,16.010363f,5.0419207f)
                curveTo(13.529888f,3.6048834f,10.470112f,3.6048834f,7.9896364f,5.0419207f)
                curveTo(5.5091615f,6.478958f,3.98718f,9.133352f,4.0f,12.0f)
            }
}

public val LucideIcons.All.CogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cog: ImageVector
    @Composable get() = CogDefinition.asImageVector()
