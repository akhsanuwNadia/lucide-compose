package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioTower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.9f,16.1f)
                curveTo(1.0f,12.2f,1.0f,5.8f,4.9f,1.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.8f,4.7f)
                curveTo(5.8482556f,6.722266f,5.518732f,9.811545f,7.0f,12.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                curveTo(9.996795f,9.716661f,10.377291f,10.38026f,10.997409f,10.73952f)
                curveTo(11.617528f,11.098779f,12.382472f,11.098779f,13.002591f,10.73952f)
                curveTo(13.622709f,10.38026f,14.003205f,9.716661f,14.0f,9.0f)
                curveTo(14.003205f,8.283339f,13.622709f,7.6197395f,13.002591f,7.2604804f)
                curveTo(12.382472f,6.901221f,11.617528f,6.901221f,10.997409f,7.2604804f)
                curveTo(10.377291f,7.6197395f,9.996795f,8.283339f,10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.2f,4.8f)
                curveTo(18.2f,6.8f,18.460001f,9.91f,17.0f,12.27f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.1f,1.9f)
                curveTo(20.97228f,3.768446f,22.02444f,6.3049054f,22.02444f,8.95f)
                curveTo(22.02444f,11.595095f,20.97228f,14.131554f,19.1f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,18.0f)
                lineTo(14.5f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(12.0f,11.0f)
                lineTo(16.0f,22.0f)
            }
}

public val LucideIcons.All.RadioTowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioTower: ImageVector
    @Composable get() = RadioTowerDefinition.asImageVector()
